package com.geekster.homework;

import java.util.Scanner;

public class B {
	public  void add() {
	// public static void add() for done with static method

Scanner scan=new Scanner(System.in);
    System.out.println("Enter The First Number : ");
			int a=scan.nextInt();
			 System.out.println("Enter The Second Number : ");
				int b=scan.nextInt();
				int c = a+b;
				System.out.println("sum : " + c);
				scan.close();
				
}
}