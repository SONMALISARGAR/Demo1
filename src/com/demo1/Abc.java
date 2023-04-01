package com.demo1;

public class Abc {
	protected int a=10;//instance variable
	
  private	static int b=20;//static variable
	
	public void m1() {
		System.out.println("hiiii java");//istance method
		
	}
	static void m2 () {
		System.out.println("helloo");//static method
	}
	

	public static void main(String[] args) {
    Xyz xx=new Xyz();
    xx.m1();
	}
		
	}
	
	class Xyz{
		
		int d=50;//instance variable
		
		static int c=40;//static variable
		
		void m1() {
	//		System.out.println("welcome");//istance method
		//Abc a1=new Abc();
		//	a1.m1();
		//	a1.m2();
			//System.out.println("a="+a1.b);
			
			
		}
		static void m2 (){
			System.out.println("java");//static method
		}
	}

