package practice;

public class LongestSubstring {

	public static void main(String[] args) {
		String s="abcabcbb";
		int count=0;
		boolean [] found=new boolean[256];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				count++;
				if(found[c]) {
					count=count-1;
					break;
				}
			}
		}
		System.out.println(count);

	}

}
