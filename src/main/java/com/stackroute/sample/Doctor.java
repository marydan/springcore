package com.stackroute.sample;

import org.springframework.beans.factory.annotation.Required;

public class Doctor {

	String dname;
	int expr;
	String field;
	
	Doctor()
	{
		
	}
	Doctor(String dn,int ex,String f)
	{
		this.dname=dn;
		this.expr=ex;
		this.field=f;
	}
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	public int getExpr() {
		return expr;
	}
	public void setExpr(int expr) {
		this.expr = expr;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	
}
