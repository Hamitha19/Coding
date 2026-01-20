package practice;

public class FindPairToGetOp {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int given=5;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==given) {
					System.out.println("found at" +" "+ i+" " + j);
					found=true;
					break;
				}
			}
		}
		if(!found) {
			System.out.println("no pairs");
		}

	}

}
