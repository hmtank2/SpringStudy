package com.dto;

import java.util.Arrays;
import java.util.List;

public class LoginDTO {
	String userid;
	String passwd;
	
	//phone
	String[] phone;
	//email
	List<String> email;
	
	public LoginDTO(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", passwd=" + passwd + ", phone=" + Arrays.toString(phone) + ", email="
				+ email + "]";
	}
	
	
}
