package model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Membership implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String tip;
	private String date;
	private String ValidityTime;
	private String price;
	private String customer;
	private ActivityStatusEnum status;
	private String numberOfTerms;

	
	
	public Membership() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Membership(int id, String tip, String date, String validityTime, String price, String customer,
			ActivityStatusEnum status, String numberOfTerms) {
		super();
		this.id = id;
		this.tip = tip;
		this.date = date;
		ValidityTime = validityTime;
		this.price = price;
		this.customer = customer;
		this.status = status;
		this.numberOfTerms = numberOfTerms;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getValidityTime() {
		return ValidityTime;
	}
	public void setValidityTime(String validityTime) {
		ValidityTime = validityTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public ActivityStatusEnum getStatus() {
		return status;
	}
	public void setStatus(ActivityStatusEnum status) {
		this.status = status;
	}
	public String getNumberOfTerms() {
		return numberOfTerms;
	}
	public void setNumberOfTerms(String numberOfTerms) {
		this.numberOfTerms = numberOfTerms;
	}
	
	
	
	
}
