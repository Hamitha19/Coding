package practice;
import java.util.Arrays;
public class BinarySearch {
public static void main(String[] args) {
		int []arr= {8,7,9,6,5};
		int sum=0,avg=0;
		int key=91;
		boolean found=false;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i==0 || i==arr.length-1) {
				sum+=i;
				avg=sum/2;
			}
			}
		if(key<arr[avg]) {
			for(int i=0;i<avg;i++) {
				if(key==arr[i]) {
					System.out.println("found at front"+" "+i);
					found=true;
					break;
					}
			}
		}
		else {
			for(int i=arr.length-1;i>=avg;i--) {
				if(key==arr[i]) {
					System.out.println("found at end"+" "+i);
					found=true;
					break;
				}
			}
		}
		if(!found) {
			System.out.println("not found");
		}
		

	}

}
