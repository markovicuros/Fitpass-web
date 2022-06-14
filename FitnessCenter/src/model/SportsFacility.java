package model;

import java.io.Serializable;

public class SportsFacility implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private String content;
	private WorkStatusEnum status;
	private Location location;
	private String logo;
	private double avgMark;
	private String workTime;
	
	
	public SportsFacility() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SportsFacility(String name, String type, String content, WorkStatusEnum status, Location location,
			String logo, double avgMark, String workTime) {
		super();
		this.name = name;
		this.type = type;
		this.content = content;
		this.status = status;
		this.location = location;
		this.logo = logo;
		this.avgMark = avgMark;
		this.workTime = workTime;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public WorkStatusEnum getStatus() {
		return status;
	}
	public void setStatus(WorkStatusEnum status) {
		this.status = status;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public double getAvgMark() {
		return avgMark;
	}
	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	
	
	
}
