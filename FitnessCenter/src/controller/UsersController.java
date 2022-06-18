package controller;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;
import spark.Session;

import com.google.gson.Gson;

import beans.User;
import dto.LoginDTO;
import service.UsersService;

public class UsersController {

	private UsersService usersService;
	private static Gson gson = new Gson();
	
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
		
		post("/users/register", (req,res) -> {
			res.type("application/json");
			
			try {
				User newUser = gson.fromJson(req.body(), User.class);

				for(User user : usersService.getAllUsers()) {
					if(user.getUsername().equals(newUser.getUsername())) {
						return "";
					}
				}
				
				usersService.register(newUser);
				Session session = req.session(true);
				
				User loggedUser = session.attribute("user");
				if(loggedUser == null)
					session.attribute("user", newUser);
				System.out.print("REGISTROVANxd ");
				return gson.toJson(newUser);
			
			} catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		});
		
		post("/user/login", (req, res) -> {
			res.type("application/json");
			try {
				User loggedUser = usersService.login(gson.fromJson(req.body(), LoginDTO.class));
				if (loggedUser != null) {
					Session session = req.session(true);
					session.attribute("user", loggedUser);
					return gson.toJson(loggedUser);
				} else {
					return "";
				}
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		});
		
		get("/user/", (req, res) -> {
			res.type("application/json");
			try {
				Session session = req.session(true);
				User loggedUser = session.attribute("user");
				return gson.toJson(loggedUser);
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		});
		
		post("/users/edit", (req,res) -> {
			res.type("application/json");
			
			try {
				User newUser = gson.fromJson(req.body(), User.class);
				
				usersService.editUser(newUser);
				Session session = req.session(true);			
				session.attribute("user", newUser);
				return gson.toJson(newUser);
				
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});

		get("/user/getAllUsers", (req, res) -> {
			res.type("application/json");
			try {
				return gson.toJson(usersService.getAllUsers());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});
		
		get("/user/getAllAdmins", (req, res) -> {
			res.type("application/json");
			try {
				return gson.toJson(usersService.getAllAdmin());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});
		
		get("/user/getAllManagers", (req, res) -> {
			res.type("application/json");
			try {
				return gson.toJson(usersService.getAllManagers());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});
		
		get("/user/getAllCoaches", (req, res) -> {
			res.type("application/json");
			try {
				return gson.toJson(usersService.getAllCoaches());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});
		
		get("/user/getAllCustomers", (req, res) -> {
			res.type("application/json");
			try {
				return gson.toJson(usersService.getAllCustomers());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});
		
		get("/users/logout", (req, res) -> {
			res.type("application/json");
			Session session = req.session(true);
			User loggedUser = session.attribute("user");
			
			if (loggedUser != null) {
				session.invalidate();
			}
			return true;
		});
		
	}

}
