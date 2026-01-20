package practice;

public class CountSpecialCharacterInString {

	public static void main(String[] args) {
		String str="@hel*gdi%&k*";
		String special="!@#$%^&*";
		int count=0;
		boolean found=false;
		for(int i=str.length()/2;i<=str.length()-1;i++) {
			for(int j=0;j<special.length();j++) {
			char ch=str.charAt(i);
			
			char cha=special.charAt(j);
			
			if(ch==cha) {
				found=true;
				count++;
			}
		}
		}
		
		
		if(found) {
			System.out.println(count);
		}

	}

}
