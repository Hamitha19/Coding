package practice;

public class Concat {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		String s=s1.concat(s2);
		boolean[] seen=new boolean[256];
		String result="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!seen[c]) {
				result+=c;
				seen[c]=true;
			}
		}
		System.out.println(result);
	}

}
