package practice;

public class MajorityElement {

	public static void main(String[] args) {
		int []arr= {1,2,2,3,4,5,5,5,5};
		int mostrep=arr[0];
		int maxcount=1;
		int currentcount=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				currentcount+=1;
			}else {
				currentcount=1;
			}
			if(maxcount<currentcount) {
				mostrep=arr[i];
			}
		}
		System.out.println(mostrep);

	}

}
