package com.demo1;

import java.util.Scanner;

public class D  {



static void assingnvalueDemo() throws CloneNotSupportedException   {
 
  
  Scanner sc=new Scanner(System.in);
    
  System.out.println("enter empId");
  int empId=sc.nextInt();
  
  System.out.println("enter empname");
  String empname=sc.next();
  
  System.out.println("enter salary");
  double empsalary=sc.nextDouble();
  
  Emp e1=new Emp(empId,empname,empsalary);
  
  System.out.println("e1=="+e1);

	Emp e2 = (Emp) e1.clone();
	 System.out.println("e2=="+e2);
	 
} 

	public static void main(String[] args) throws CloneNotSupportedException{
		assingnvalueDemo();
		system.out.println("Hii");
	
}
}
class Emp  implements Cloneable{
	 
	int empid;
	String empname;
	double empsalary;
	public int getEmpid() {		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	public Emp(int empid, String empname, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
    
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

