package Task9;

import java.util.Scanner;

public class Ans6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the month number: ");
	          int month = scanner.nextInt();
	        System.out.println("Enter the room rent: ");  
	          double rent = scanner.nextDouble();
	        System.out.println("Enter the number of days: ");
	          int days = scanner.nextInt();
	           
	          scanner.close();
	          
	          double totalroomrent =rent *days;
	          
	          switch (month) {
	          case 4:
	          case 5:
	          case 6:
	          case 11:
	          case 12:
	        	  totalroomrent*=1.20;
	          break;
	          default:
	          break;
	    }
	        System.out.printf("Hotel tariff to be paid: %.2f", totalroomrent);
	}

}
