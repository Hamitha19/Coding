package practice;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int key=4;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				found=true;
				System.out.println("found"+ " "+i);
				break;
			}
		}
		if(!found) {
			System.out.println("not found");
		}

	}

}
