package model;

import java.io.Serializable;

public class Comments implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customer;
	private SportsFacility facility;
	private String comment;
	private MarkEnum mark;
	
	
	
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(String customer, SportsFacility facility, String comment, MarkEnum mark) {
		super();
		this.customer = customer;
		this.facility = facility;
		this.comment = comment;
		this.mark = mark;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public SportsFacility getFacility() {
		return facility;
	}
	public void setFacility(SportsFacility facility) {
		this.facility = facility;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public MarkEnum getMark() {
		return mark;
	}
	public void setMark(MarkEnum mark) {
		this.mark = mark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
