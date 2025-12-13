package com.dsa.basic_programs;

public class Palindrome {

	public static void main(String[] args) {

		int n=1213;
		int temp=n;
		int rev=0;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev) {
			System.out.println("It is a paliindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}

}
