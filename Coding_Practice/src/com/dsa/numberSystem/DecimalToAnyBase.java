package com.dsa.numberSystem;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		int b=2;
		int ans=getDecimalAnyBase(n,b);
		System.out.println(ans);

	}

	private static int getDecimalAnyBase(int n, int b) {
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
