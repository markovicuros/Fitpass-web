package beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrainingHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String checkInTime;
	private Training training;
	private String customer;
	private String coach;
	public TrainingHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrainingHistory(String checkInTime, Training training, String customer, String coach) {
		super();
		this.checkInTime = checkInTime;
		this.training = training;
		this.customer = customer;
		this.coach = coach;
	}
	public String getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
