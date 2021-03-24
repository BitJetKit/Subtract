package com.BitJetKit.Subtract;

public class Subtract {
	private double number1;
	private double number2;
	private double difference;
	
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public void setDifference(double number1, double number2) {
		difference = number1 - number2;
	}
	public void printSum() {
		System.out.println("1st number = " + number1 + " 2nd number = " + number2 + " Difference = " + difference);
	}
	
}
