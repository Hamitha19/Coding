package practice;

public class LeftRotationArray {

	public static void main(String[] args) {
		int []arr= {2,4,6,8,10};
		int n=arr.length;
		int d=n-1;
		
		d=d%n;
		for(int i=0;i<d;i++) {
			int first=arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=first;
		}
		for(int num:arr) {
			System.out.println(num+" ");
		}

	}

}
