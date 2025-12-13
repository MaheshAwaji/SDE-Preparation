package com.dsa.basic_programs;

public class PrimeNumber {

	public static void main(String[] args) {

		int n=10;
		int count=0;
		for(int i=1;i<=5;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
	}

}
