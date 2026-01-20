package practice;

public class LongestWordInString {

	public static void main(String[] args) {
		String s="java is a programming language";
		String [] arr=s.split(" ");
		String longword=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			String str=arr[i];
			if(str.length()>longword.length()) {
				longword=arr[i];
			}
			
		}
		System.out.println(longword);

	}

}
