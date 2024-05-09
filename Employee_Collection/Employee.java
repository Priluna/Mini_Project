package com.qsp.collection;

public class Employee {
private int id;
private String name;
private long mobileNo;
private String email;
private String job;
Employee(int id,String name,long mobileNo,String email, String job){
	this.id=id;
	this.name=name;
	this.mobileNo=mobileNo;
	this.email=email;
	this.job = job;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
@Override
public String toString() {
	return "Employee[id: "+id+" Name: "+name+" Mobile Number: "+mobileNo+" Email: "+email+" Job: "+job+" ]";
}

}
