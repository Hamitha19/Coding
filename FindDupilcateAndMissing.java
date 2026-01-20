package practice;
import java.util.Arrays;
import java.util.Scanner;
public class FindDupilcateAndMissing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
	int xor1=0;
	int xor2=0;
	int m=arr.length+1;
	for(int i=1;i<=m;i++) {
		xor1^=i;
	}
	
	for(int num:arr) {
		xor2^=num;
	}
	int missing=xor1^xor2;
	
		int duplicate=0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
					if(arr[i]==arr[j]) {
						
						
						duplicate=arr[i];
					}
				}
		}
		System.out.println(duplicate+","+missing);
		}
		

	}


