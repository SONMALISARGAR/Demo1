package com.demo3;

public class H {
   
	int student_id;
	String student_name;
	int student_monumber;
	String student_city;
	
	public static void main(String[] args) {
		H h1=new H(10);
		h1.setStudent_id(1);
		h1.setStudent_name("sonali");
		h1.setStudent_monumber(1234567);
		h1.setStudent_city("pune");
	System.out.println("name==."+h1.student_name);
		
	System.out.println("h1="+h1);	
		
	}

	@Override
	public String toString() {
		return "H [student_id=" + student_id + ", student_name=" + student_name + ", student_monumber="
				+ student_monumber + ", student_city=" + student_city + "]";
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_monumber() {
		return student_monumber;
	}

	public void setStudent_monumber(int student_monumber) {
		this.student_monumber = student_monumber;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}
	
	public H() {
		System.out.println("no arg");
	}
	
	public H(int a) {
		System.out.println("single arg");
	}
}
