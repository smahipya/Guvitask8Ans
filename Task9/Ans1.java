package Task9;

public class Ans1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String x = "abcdcba"; 

	       int i=0, j =x.length()-1;
	       while (i<j) {
	   if( x.charAt(i)!= x.charAt(j)) {
		   System.out.println("It is not a Palindrome");
		   System.exit(0);}
		   i++;
		   j--;
			System.out.println("It is a palindrome");   
	   } 
	}

}
