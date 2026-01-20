package practice;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		for(int i=5;i>=2;i--){
		      
		      for(int j=1;j<=i;j++){
		        System.out.print(" ");
		      }
		      for(int j=1;j<=6-i;j++){
		    	  if(j==1 || j==6-i) {
		        System.out.print("* ");
		      }else {
		    	  System.out.print("  ");
		      }
		      }
		      
		      System.out.println();
		     }
		     for(int i=1;i<=5;i++){
		      
		      for(int j=1;j<=i;j++){
		        System.out.print(" ");
		      }
		      for(int j=i;j<6;j++){
		    	  if(j==i || j==5) {
		    		  
		    	  
		        System.out.print("* ");
		      }else {
		    	  System.out.print("  ");
		      }
		      }
		      
		      System.out.println();
		     }
	}

}
