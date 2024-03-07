package Task9;

public class Ans2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Mahi";
		String y ="";
		
		for(int i=x.length()-1; i>=0 ;i--) {
			y = y + x.charAt(i);
		}
			System.out.println("Original String: "+x);
			
			System.out.println("Reversed String: "+y);

		
	}

}
