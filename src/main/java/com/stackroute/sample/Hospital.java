package com.stackroute.sample;

import org.springframework.beans.factory.annotation.Autowired;

public class Hospital {

	String hname;
	String location;
	
	
	Doctor  doctorbean;
	
	Hospital()
	{
		
	}
	
	@Autowired
	Hospital(Doctor doc)
	{
		this.doctorbean=doc;
	}

	
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Doctor getDoctorbean() {
		return doctorbean;
	}
	public void setDoctorbean(Doctor doctor) {
		this.doctorbean = doctor;
	}
	
}
