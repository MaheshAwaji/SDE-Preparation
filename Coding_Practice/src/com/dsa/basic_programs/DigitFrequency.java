package com.dsa.basic_programs;

public class DigitFrequency {

	public static void main(String[] args) {

		int num=12326;
		int target=3;
		int count=0;
		while(num>0) {
			int digit=num%10;
			if(digit==target) {
				count++;
			}
			num=num/10;
		}
		System.out.println(target+" is occurs "+count+" times");
	}

}
