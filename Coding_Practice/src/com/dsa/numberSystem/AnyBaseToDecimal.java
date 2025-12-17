package com.dsa.numberSystem;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		 int n=30;
		 int b=8;
		 int ans=getDecimalFromAnyBase(n,b);
		 System.out.println(ans);
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

}
