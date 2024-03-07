package Task8;

import java.util.Scanner;

public class Ans4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj=new Scanner (System.in);
		System.out.println("Enter first number :" );
		int number=myobj.nextInt();
		System.out.println("Enter second number :");
		int number1=myobj.nextInt();
		
		
		int temp= number;
		number=number1;
		number1=temp;
		
		System.out.println("Original number");
		System.out.println("Enter first  number : " + number);
		System.out.println("Enter Second  number : " + number1);
			
		System.out.println("\nSwaped number");
		System.out.println("Enter first  number : " + number);
		System.out.println("Enter Second  number : " + number1);
	}

}
