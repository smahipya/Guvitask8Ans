package Task9;

import java.util.Scanner;

public class Ans7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n1,n2,n3,largest;
		Scanner big =new Scanner (System.in);
		System.out.println("Enter number one :"  );
		n1 = big.nextInt();
		System.out.println("Enter number two :"  );
		n2 = big.nextInt();
		System.out.println("Enter number three :"  );
		n3 = big.nextInt();
		
		largest=(n1>n2&&n1>n1)? n1:((n2>n1&&n2>n3)?n2 :n3);
		  
		System.out.printf("The greatest value among these three are%d,%d,%d is  %d."  ,n1,n2,n3,largest );
	}

}
