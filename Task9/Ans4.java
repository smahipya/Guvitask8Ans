package Task9;

public class Ans4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==6)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			     System.out.println(" ");
		
			
		}
	}

}
