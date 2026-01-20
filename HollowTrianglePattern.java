package practice;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				if(j==1 || j==6-i || i==1) {
				   System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
