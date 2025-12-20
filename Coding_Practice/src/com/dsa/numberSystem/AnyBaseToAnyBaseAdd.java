package com.dsa.numberSystem;

public class AnyBaseToAnyBaseAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=236;
		int n2=754;
		int b=8;
		int res=getAdditionOfAnyBase(n1,n2,b);
		System.out.println(res);

	}

	private static int getAdditionOfAnyBase(int n1, int n2, int b) {
		// TODO Auto-generated method stub
		int res=0;
		int c=0;
		int p=1;
		while(n1>0||n2>0||c>0) {
			int d1=n1%10;
			int d2=n2%10;
			n1=n1/10;
			n2=n2/10;
			
			int d=d1+d2+c;
			c=d/b;
			d=d%b;
			
			res=res+p*d;
			p=p*10;
			
		}
		return res;
	}

}
