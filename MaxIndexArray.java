package practice;

public class MaxIndexArray {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4};
		int max=arr[0];
		int maxIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxIndex=i;
			}
		}
		boolean found=true;
		for(int i=0;i<arr.length;i++) {
			if(i!=maxIndex) {
				if(arr[i]*2>max) {
					found=false;
					break;
				}
			}
		}
		if(found) {
			System.out.println(maxIndex);
		}else {
			System.out.println(-1);
		}

	}

}
