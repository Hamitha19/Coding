package practice;

public class FindingSmallestMissingNumber {

	public static void main(String[] args) {
		int arr[]= {-2,1,2,4,6};
		int smallest=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==smallest) {
				smallest++;
			}
		}
		System.out.println(smallest);

	}

}
