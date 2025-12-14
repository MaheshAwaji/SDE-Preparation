package com.dsa.basic_programs;

public class RotateNumber {

	public static void main(String[] args) {
		int n=1234;
		int k=2;
		
		int temp=n;
		int digits=0;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		
		int div=1;
		int mult =1;
		
		for(int i=1;i<=digits;i++) {
			if(i<=k) {
				div=div*10;
				
			}
			else {
				mult=mult*10;
			}
		}
		
		int r=n%div;
		int q=n/div;
		
		int ans=r*mult+q;
		System.out.println(ans);
		
	}
}
