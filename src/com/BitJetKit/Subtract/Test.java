package com.BitJetKit.Subtract;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double userNumber;
		Subtract reducer = new Subtract();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("===============Add===============");
		System.out.println("Enter 2 numbers from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ".");
		
		System.out.println("\nEnter the 1st number: ");
		userNumber = reader.nextDouble();
		reducer.setNumber1(userNumber);
		
		System.out.println("\nEnter the 2nd number: ");
		userNumber = reader.nextDouble();
		reducer.setNumber2(userNumber);
		reducer.setDifference(reducer.getNumber1(), reducer.getNumber2());
		reducer.printSum();
	}

}
