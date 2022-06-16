package beans;

import java.io.Serializable;

public class CustomerType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type_name;
	private String discount;
	private int points;
	
	public CustomerType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerType(String type_name, String discount, int points) {
		super();
		this.type_name = type_name;
		this.discount = discount;
		this.points = points;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	

}
