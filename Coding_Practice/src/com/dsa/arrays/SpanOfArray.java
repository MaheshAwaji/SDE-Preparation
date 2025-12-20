package com.dsa.arrays;

public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,8,3,9,23,45,2,56,7};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		int span=max-min;
		System.out.println(span);

	}

}
