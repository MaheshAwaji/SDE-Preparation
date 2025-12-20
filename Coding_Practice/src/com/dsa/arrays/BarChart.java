package com.dsa.arrays;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,3,4,5};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=max;i>=1;i--) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>=i) {
					System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
