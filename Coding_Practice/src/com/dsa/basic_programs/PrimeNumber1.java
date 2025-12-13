package com.dsa.basic_programs;

public class PrimeNumber1 {

	public static void main(String[] args) {

		int n=9;
		boolean isPrime=checkPrime(n);
		if(isPrime) {
			System.out.println("It is a Prime Number");
		}else {
			System.out.println("It is not a Prime Number");
		}
	}

	public static boolean checkPrime(int n) {
		if(n<2) {
			return false;
		}
		if(n==2) {
			return true;
		}
		if(n%2==0) {
			return false;
		}
		for(int i=3;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
