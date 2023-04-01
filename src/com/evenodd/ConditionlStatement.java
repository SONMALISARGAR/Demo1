package com.evenodd;

import java.util.Scanner;

public class ConditionlStatement {

	static void evenodddemo() {      //   usingif
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number");
		
		int a = sc.nextInt();//28
		
		if(a%2==0) {
			System.out.println("even number");
			System.out.println("odd number");
			System.out.println("end prm");
		}
	}
	public static void main(String[] args) {
	//	evenodddemo();
		evenodddemo2();
	}

	
	static void evenodddemo2() {             //using if else
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();//23
		
		if(a%2==0) //23%2=0
			System.out.println("even number");
			else
				System.out.println("odd number");
	}
}

