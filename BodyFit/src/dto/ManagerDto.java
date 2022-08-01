package dto;

import java.util.Date;

import beans.Gender;

public class ManagerDto {
	public String username;
	public String password;
	public String name;
	public String surname;
	public String gender;
	public Date birthday;	
	public String userRole;
	public String sportFacilityId;
	
	public Gender gerGenderEnum() {
		if (gender.equals("MALE"))
			return Gender.MALE;
		else
			return Gender.FEMALE;
	}
	
}
