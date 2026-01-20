package practice;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str="Welcomew java";
		str=str.toLowerCase();
		
		char nonrep='\0';
		for(int i=0;i<str.length();i++) {
			boolean found=false;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					found=true;
					break;
				}
				
			}
			if(!found) {
				nonrep=str.charAt(i);
				break;
			}
			
			
					
				}
		if (nonrep!= '\0') {
            System.out.println("First non-repeated character: " + nonrep);
        } else {
            System.out.println("No unique character found!");
        }
			
		}

	}


