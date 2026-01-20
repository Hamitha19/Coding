package practice;

public class CountSequenceOfBinaryDigits {

	public static void main(String[] args) {
		int arr[]= {1,0,1,0,0,0,1};
		int Maxcount=1;
		int CurrentCount=1;
		for(int i=1;i<arr.length;i++) {
			
				if(arr[i]==arr[i-1]) {
					CurrentCount++;
					Maxcount=Math.max(Maxcount, CurrentCount);
				}else {
					CurrentCount=1;
				}
			}
		
		System.out.println(Maxcount);
	}

}
