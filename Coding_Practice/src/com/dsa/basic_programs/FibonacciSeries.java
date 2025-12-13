package com.dsa.basic_programs;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n=10;
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i=0;i<10;i++) {
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;	
		}
	}

}
