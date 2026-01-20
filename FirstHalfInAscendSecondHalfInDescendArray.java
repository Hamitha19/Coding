package practice;

public class FirstHalfInAscendSecondHalfInDescendArray {

	public static void main(String[] args) {
		int []arr= {25,13,74,56,22,43};
		int n=arr.length/2;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=n;i<arr.length-1;i++) {
			for(int j=n;j<arr.length-i+n-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
