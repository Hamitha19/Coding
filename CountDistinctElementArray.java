package practice;

public class CountDistinctElementArray {

	public static void main(String[] args) {
		int []arr= {1,2,1,3,2,1};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			boolean found=true;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					found=false;
					break;
				}
			}
			if(found) {
				count++;
			}
		}
		System.out.println(count);

	}

}
