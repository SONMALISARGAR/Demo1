package com.division;

import java.util.Scanner;

public class DividedDemo {

	static void devideddemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		if(a%2==0 && a%10==0) 
		System.out.println("its true");
		else
		System.out.println("its false");
		System.out.println("end prm");
		
	}
	public static void main(String[] args) {
		devideddemo();
	}
}
