package model;

import java.io.Serializable;

public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String longitude;
	private String latitude;
	private Adress adresa;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(String longitude, String latitude, Adress adresa) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.adresa = adresa;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Adress getAdresa() {
		return adresa;
	}
	public void setAdresa(Adress adresa) {
		this.adresa = adresa;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
