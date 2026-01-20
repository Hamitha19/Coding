package practice;

public class DuplicatePrintingString {

	public static void main(String[] args) {
		String st="java is a programming language";
		st=st.replace(" ","");
		st=st.toLowerCase();
		String s="";
		boolean []found=new boolean[256];
		for(int i=0;i<st.length();i++) {
			
			char c=st.charAt(i);
			int count=0;
			if(found[c]) {
				continue;
			}
			for(int j=0;j<st.length();j++) {
				
			
			if(st.charAt(i)==st.charAt(j)) {
				count++;
				
			}
			}
			if(count>1) {
				s+=c;
			}
			found[c]=true;
		}
		System.out.print(s);
		
		
	}

}
