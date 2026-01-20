package practice;

public class FreqOfLetterString {

	public static void main(String[] args) {
		String str="the dog is barking";
		
		str=str.replace(" ","");
		str=str.toLowerCase();
		boolean[] found=new boolean[str.length()];
		for(int i=0;i<str.length();i++) {
			if(found[i]) continue;
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					found[j]=true;
				}
				
			}
			System.out.println(str.charAt(i)+":"+count);
		}

	}

}
