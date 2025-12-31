package practice;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		s1=s1.trim();
		s2=s2.trim();
		s1=s1.replaceAll("\\s+","");
		s2=s2.replaceAll("\\s+","");
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}