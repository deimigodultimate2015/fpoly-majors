package com.sol.dght003.dto.request;

//To collect information from test request
public class CandidateRegister {

	private String name;
	private String phone;
	private String province;
	private String school;
	
	public CandidateRegister() {}
	
	public CandidateRegister(String name, String phone, String province, String school) {
		super();
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.school = school;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
}
