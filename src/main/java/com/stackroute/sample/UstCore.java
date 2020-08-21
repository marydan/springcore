package com.stackroute.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UstCore {

	public static void main(String[] args) {
		
		
		ApplicationContext appcontext=new ClassPathXmlApplicationContext("mybeans.xml");
		
	//	Doctor doctor=new Doctor();
		//		Doctor doctor=appcontext.getBean("hbean", Doctor.class); // injecting bean class
//        		
//       
//	//	System.out.println(doctor.getDname() + "Experienc " + doctor.getExpr());
//	
//
//		
//Doctor doctor1=appcontext.getBean("doctorbean", Doctor.class); // injecting bean class
//		
//doctor1.setDname("Raj");
//		System.out.println(doctor1.getDname() + "Experienc " + doctor1.getExpr());

		
		Hospital hospital=appcontext.getBean("hbean",Hospital.class);
		
		System.out.println(hospital.hname);
		System.out.println(hospital.getDoctorbean().getDname());
		
		
		
		
	}

	
}
