package service;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.JsonSyntaxException;

import beans.Role;
import beans.User;
import dao.UsersDAO;
import dto.LoginDTO;


public class UsersService {

	private UsersDAO usersDAO;
	
	public UsersService(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
	public void register(User user) throws JsonSyntaxException, IOException{
		usersDAO.create(user);
	}
	
	public ArrayList<User> getAllUsers() throws JsonSyntaxException, IOException{
		return usersDAO.getAllNonDeleted();
	}
	
	public ArrayList<User> getAllAdmin() throws JsonSyntaxException, IOException {
		
		ArrayList<User> allAdmins = new ArrayList<User>();
		
		for (User user : usersDAO.getAllNonDeleted())
			if(user.getRole().equals(Role.ADMIN))
				allAdmins.add(user);
		
		return allAdmins;
	}
	
	public ArrayList<User> getAllManagers() throws JsonSyntaxException, IOException {
		
		ArrayList<User> allManagers = new ArrayList<User>();
		
		for (User user : usersDAO.getAllNonDeleted()) 
			if(user.getRole().equals(Role.MANAGER))
				allManagers.add(user);		
		
		return allManagers;
	}
	
	public ArrayList<User> getAllCoaches() throws JsonSyntaxException, IOException {
		
		ArrayList<User> allCoaches = new ArrayList<User>();
		
		for (User user : usersDAO.getAllNonDeleted()) 
			if(user.getRole().equals(Role.COACH))
				allCoaches.add(user);		
		
		return allCoaches;
	}
	
	public ArrayList<User> getAllCustomers() throws JsonSyntaxException, IOException {
		
		ArrayList<User> allCustomers = new ArrayList<User>();
		
		for (User user : usersDAO.getAllNonDeleted()) 
			if(user.getRole().equals(Role.CUSTOMER))
				allCustomers.add(user);		
		
		return allCustomers;
	}
	
	public User getUserByUserName(String username) throws JsonSyntaxException, IOException {
		return usersDAO.getByID(username);
	}
	
	public void updateUser(User user) throws JsonSyntaxException, IOException {
		usersDAO.update(user);
	}
	
	public void editUser(User newUser) throws JsonSyntaxException, IOException {
		usersDAO.update(newUser);
	}
	
	public User login(LoginDTO user) throws JsonSyntaxException, IOException {
		User loggedUser = null;
		if(user.getUsername() != null) {
			loggedUser = usersDAO.getByID(user.getUsername());
		}
		
		if(loggedUser != null) {
			if(user.getPassword().equals(loggedUser.getPassword())) {
				return loggedUser;
			}
		}
		return null;
	}
	
	
}
