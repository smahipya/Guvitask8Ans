package Task9;

import java.util.Scanner;

public class Ans5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in); 
		
		System.out.println("Enter the marks scored by the student: ");
		int marks= scanner.nextInt();
		
		scanner.close();
		if(marks  <0|| marks >100){System.out.println("invalid input");
		return;	
		}
		  char grade;
	        if (marks >= 90 && marks <= 100) {
	            grade = 'A';
	        } else if (marks >= 80 && marks <= 89) {
	            grade = 'B';
	        } else if (marks >= 70 && marks <= 79) {
	            grade = 'C';
	        } else if (marks >= 60 && marks <= 69) {
	            grade = 'D';
	        } else if (marks >= 50 && marks <= 59) {
	            grade = 'E';
	        } else {
	            grade = 'F';
	        }
		
		System.out.println("Grade : "  + grade  );
	}

}
