package model;

import java.io.Serializable;

public class Adress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String street;
	private String number;
	private String city;
	private int postalcode;
	
	
	
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Adress(String street, String number, String city, int postalcode) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
		this.postalcode = postalcode;
	}




	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getPostalcode() {
		return postalcode;
	}



	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	
	
	
	
}
