package practice;

public class CountPrimeNumbersInArray {

	public static void main(String[] args) {
		int n=5;
		int count1=0;
		int []arr= {1,2,3,4,5,};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				if(i%j==0) {
					count++;
					
				}if(count!=2) {
					count1++;
					break;
				}
			}
			
		}
		
		
		System.out.println(count1);

	}

}
