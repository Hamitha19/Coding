package practice;

public class CheckRotationOf1IsEqualTo2 {

	public static void main(String[] args) {
		String s="abcde";
		String t="jiehf";
		if(s.length()==t.length() && s.length()>0) {
			String combined=s+s;
			if(combined.contains(t)) {
				System.out.println("rotation contains t");
			}else {
				System.out.println("does not contains");
			}
		}else {
			System.out.println("string entered is not correct.");
		}

	}

}
