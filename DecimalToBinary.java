package practice;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal=12376;
		int binary[]=new int[20];
		int i=0;
		while(decimal>0) {
			int temp=decimal%2;
			binary[i++]=temp;
			decimal/=2;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]+" ");
		}

	}

}
