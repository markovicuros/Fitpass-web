package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String name;
	private String surname;
	private GenderEnum gender;
	private String dateOfBirth;
	private Role role;
	private TrainingHistory training_history;
	private Membership membership;
	private SportsFacility sports_facility;
	private SportsFacility visited_object;
	private int collectedPoints;
	private CustomerType customer_type;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//FOR COACH
	public User(String username, String password, String name, String surname, GenderEnum gender, String dateOfBirth,
			Role role, TrainingHistory training_history, CustomerType customer_type) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.training_history = training_history;
		this.customer_type = customer_type;
	}


	
	//FOR CUSTOMER
	public User(String username, String password, String name, String surname, GenderEnum gender, String dateOfBirth,
			Role role, Membership membership, SportsFacility visited_object, int collectedPoints,
			CustomerType customer_type) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.membership = membership;
		this.visited_object = visited_object;
		this.collectedPoints = collectedPoints;
		this.customer_type = customer_type;
	}

	
	//FOR MANAGER
	public User(String username, String password, String name, String surname, GenderEnum gender, String dateOfBirth,
			Role role, SportsFacility sports_facility, CustomerType customer_type) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.sports_facility = sports_facility;
		this.customer_type = customer_type;
	}


	public User(String username, String password, String name, String surname, GenderEnum gender, String dateOfBirth,
			Role role, TrainingHistory training_history, Membership membership, SportsFacility sports_facility,
			SportsFacility visited_object, int collectedPoints, CustomerType customer_type) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.training_history = training_history;
		this.membership = membership;
		this.sports_facility = sports_facility;
		this.visited_object = visited_object;
		this.collectedPoints = collectedPoints;
		this.customer_type = customer_type;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public GenderEnum getGender() {
		return gender;
	}



	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	public TrainingHistory getTraining_history() {
		return training_history;
	}



	public void setTraining_history(TrainingHistory training_history) {
		this.training_history = training_history;
	}



	public Membership getMembership() {
		return membership;
	}



	public void setMembership(Membership membership) {
		this.membership = membership;
	}



	public SportsFacility getSports_facility() {
		return sports_facility;
	}



	public void setSports_facility(SportsFacility sports_facility) {
		this.sports_facility = sports_facility;
	}



	public SportsFacility getVisited_object() {
		return visited_object;
	}



	public void setVisited_object(SportsFacility visited_object) {
		this.visited_object = visited_object;
	}



	public int getPoints_number() {
		return collectedPoints;
	}



	public void setPoints_number(int collectedPoints) {
		this.collectedPoints = collectedPoints;
	}



	public CustomerType getCustomer_type() {
		return customer_type;
	}



	public void setCustomer_type(CustomerType customer_type) {
		this.customer_type = customer_type;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + "]";
	}

	
	
	
}
