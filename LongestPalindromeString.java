package practice;

public class LongestPalindromeString {

	public static void main(String[] args) {
		String st="abaaabaa";
		int []freq=new int[26];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			freq[ch-'a']++;
		}
		int len=0;
		boolean hasOdd=false;
		for(int i=0;i<26;i++) {
			int count=freq[i];
			len+=(count/2)*2;
			if(count%2==1) {
				hasOdd=true;
				}
			}
		if(hasOdd) {
			len+=1;
		}
		System.out.println(len);

	}

}
