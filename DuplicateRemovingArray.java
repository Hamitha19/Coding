package practice;

import java.util.Arrays;

public class DuplicateRemovingArray {

	public static void main(String[] args) {
		int []arr= {1,1,2,3,4,4};
		int n=arr.length;
		if(arr[0]==arr[1]) {
			System.out.print(arr[0]+" ");
		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1] && arr[i]==arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
			}
		if(arr[n-1]==arr[n-2]) {
			System.out.print(arr[n-1]);
		}
		

	}

}
