package practice;

public class LastLetterCapString {

	public static void main(String[] args) {
		String input="the dog is barking";
		String result="";
		
		String []words=input.split(" ");
		for(String word:words) {
			String modified=word.substring(0,word.length()-1)+Character.toUpperCase(word.charAt(word.length()-1));
			result=result+modified+" ";
		}
		System.out.println(result);
	}

}
