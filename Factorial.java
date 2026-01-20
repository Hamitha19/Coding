package practice;

public class Factorial {
	int fact(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		Factorial f=new Factorial();
		int n=4;
		int r=f.fact(n);
		System.out.println(r);

	}

}
