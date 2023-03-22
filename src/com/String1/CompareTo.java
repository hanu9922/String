package com.String1;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String first");
		String s1=sc.nextLine();
		System.out.println("Enter String Second");
		String s2=sc.nextLine();
		System.out.println("Enter String Third");
		String s=sc.nextLine();
		
		System.out.println("comparing string " + s1+" to string " +s+" == " + s1.contains(s));
		
		String s3="Example.com";
		String s4="example.com";
		System.out.println(s3.contains(s4));
	}

}
