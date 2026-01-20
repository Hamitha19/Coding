package practice;

public class LargestSmallestArray {

	public static void main(String[] args) {
		int[]arr= {2,3,1,5,3};
		int max=arr[0];
		int min=arr[0];
		for(int num:arr) {
			if(num>max) max=num;
			if(num<min) min=num;
		}
		System.out.println(max);
		System.out.println(min);

	}

}
