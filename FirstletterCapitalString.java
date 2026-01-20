package practice;

public class FirstletterCapitalString {

	public static void main(String[] args) {
		String input="the dog is barking";
		String result="";
		String[] arr=input.split(" ");
		for(String word:arr) {
			result=result+Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase()+" ";
		}
		System.out.println(result);
	}

}
