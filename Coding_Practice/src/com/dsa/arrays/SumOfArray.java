package com.dsa.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,5,6};
		int[] arr2= {3,4,5,7,3};
		
		int[] sum=new int[arr1.length>arr2.length?arr1.length:arr2.length];
		
		int i=arr1.length-1;
		int j=arr2.length-1;
		
		int k=sum.length-1;
		int c=0;
		while(k>=0) {
			int d=c;
			if(i>=0) {
				d+=arr1[i];
			}
			
			if(j>=0) {
				d+=arr2[j];
			}
			c=d/10;
			d=d%10;
			
			sum[k]=d;
			i--;
			j--;
			k--;
		}
		
		if(c!=0) {
			System.out.println(c);
		}
		for(int val:sum) {
			System.out.println(val);
		}

	}

}
