package com.leapyeardemo;

import java.util.Scanner;

public class Comditionlstatement {

	static void ifstatmentdemo() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter leapyear");
		
		int year = sc.nextInt();//2004
		
		if (year%4==0);
		System.out.println("ur eg,igible for leapyear");
		
		System.out.println("ur not egligible for leapyear");
		
	}
	public static void main(String[] args) {
	//	ifstatmentdemo ();
		
		ifelsedemo2() ;
		}
	static void ifelsedemo2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter leapyear");
		
		int year = sc.nextInt();//2004
		
		if(year%4==0)
		System.out.println("ur egligible leapyear");
		else
	
			System.out.println("ur not egligible leap year");
	}
	
	
}
