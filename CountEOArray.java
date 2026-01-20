package practice;

public class CountEOArray {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int []arr= {1,2,3,4,5};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				even+=1;
			}else {
				odd+=1;
			}
			
		}
		System.out.println(even);
		System.out.println(odd);

	}

}