package beans;

import java.io.Serializable;
import java.time.LocalTime;

public class Training implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private SportsFacility facility;
	private LocalTime length;
	private String coach;
	private String description;
	private String photo;
	
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training(String name, String type, SportsFacility facility, LocalTime length, String coach,
			String description, String photo) {
		super();
		this.name = name;
		this.type = type;
		this.facility = facility;
		this.length = length;
		this.coach = coach;
		this.description = description;
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public SportsFacility getFacility() {
		return facility;
	}
	public void setFacility(SportsFacility facility) {
		this.facility = facility;
	}
	public LocalTime getLength() {
		return length;
	}
	public void setLength(LocalTime length) {
		this.length = length;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
