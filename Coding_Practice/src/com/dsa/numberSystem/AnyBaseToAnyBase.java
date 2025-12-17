package com.dsa.numberSystem;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11000;
		int b1=2;
		int b2=8;
		
		int inDec=getDecimalFromAnyBase(n, b1);
		int finalAns=getDecimalToAnyBase(inDec, b2);
		System.out.println(finalAns);

	}
	private static int getDecimalFromAnyBase(int n, int b) {
		int ans=0;
		int p=1;
		while(n>0) {
			int dig=n%10;
			n=n/10;
			ans=ans+dig*p;
			p=p*b;
		}
		return ans;
	}
	
	private static int getDecimalToAnyBase(int n, int b) {
		int ans=0;
		int p=1;
		while(n>0) {
			int dig=n%b;
			n=n/b;
			ans=ans+dig*p;
			p=p*10;
		}
		return ans;
	}



}
