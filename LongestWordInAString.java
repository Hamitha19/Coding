package practice;

public class LongestWordInAString {

	public static void main(String[] args) {
	  String str="The dog is barking";
	  String []arr=str.split(" ");
	  int max=0;
	  String longString="";
	  for(int i=0;i<arr.length;i++) {
		  int count=0;
		  for(int j=0;j<arr[i].length();j++) {
			  count++;
			  if(count>max) {
				  max=count;
				  longString=arr[i];
			  }
		  }
		 
	  }
	  System.out.println(longString);

	}

}
