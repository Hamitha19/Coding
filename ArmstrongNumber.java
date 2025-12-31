package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a=153;
		int temp=a;
		int count=0;int sum=0;
		int n=a;
		while(n>0) {
			n=n/10;
			count++;
			
		}
		 n=a;
		while(n>0) {
			int digit=n%10;
			sum+=Math.pow(digit, count);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
		

	}

}
