package com.dsa.arrays;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,8,3,9,23,45,2,56,7};
		int target=9;
		int ans=findElement(target,arr);
		System.out.println(ans);

	}

	private static int findElement(int target, int[] arr) {
		// TODO Auto-generated method stub
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				ans=i;
			}
		}
		return ans;
	}

}
