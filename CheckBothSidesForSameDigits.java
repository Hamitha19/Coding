package practice;

public class CheckBothSidesForSameDigits {

	public static void main(String[] args) {
		
		int arr[]= {1,0,0,0};
		int n=arr.length;
		for(int i=1;i<n-3;i++) {
			if(arr[i]==arr[i-1] && arr[i]==arr[i+1]) {
				System.out.println(i);
			}
		}
		for(int i=n-1;i>=n-3;i--) {
		if(arr[n-1]==arr[n-2] && arr[n-2]==arr[n-3]) {
			System.out.println(n-2);
			break;
		}
		}
	}

}
