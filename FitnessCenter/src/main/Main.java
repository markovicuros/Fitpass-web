package main;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

import java.io.File;

import com.google.gson.Gson;

import controller.UsersController;
import dao.UsersDAO;
import service.UsersService;

public class Main {
	
	private static Gson g = new Gson();

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		port(8080);
		
		staticFiles.externalLocation(new File("./WebContent").getCanonicalPath());
		
		get("/test", (req, res) -> {
			return "Works";
		});
		
		UsersDAO usersDAO = new UsersDAO("./files/users.json");
		UsersService usersService = new UsersService(usersDAO);
		UsersController usersController = new UsersController(usersService);
		
	}

}
