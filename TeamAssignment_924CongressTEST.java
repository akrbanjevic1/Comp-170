import java.util.Scanner;

public class TeamAssignment_924CongressTEST{
/*
 * Set up a loop to  
 */
	private static final boolean DEBUG = true;
		    
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    int start = 1;
	    double number = 0.0;
	    double mean = 0.0;
	    double max = 0.0;
	    double min = 100.0;
	    double grades = 0.0;
	    String response = "y";
	   
	    while (start <= 10000000) {
	    	if (DEBUG) {
		   		System.out.print("Student " + start + "'s grade is: ");
		   		number = keyboard.nextInt();
		   		grades = grades + number;
		        mean = (grades / start);
		        if (number > max) {
		        	max = number;
		        }
		        if (number < min) {
		        	min = number;
		        }
		    }
	    	System.out.print("Would you like to enter a Student's grade? (y/n): ");
	   		response = keyboard.next();
	    	response = response.toLowerCase();
	    	System.out.println(" "); //This space is used to make code look nice
	    	if (!response.equals("y") && (!response.equals("n"))) {
	    		System.out.println("Not a valid response, last try before returning results");
	    		System.out.print("Would you like to enter a Student's grade? (y/n): ");
		   		response = keyboard.next();
		    	response = response.toLowerCase();
		    	System.out.println(" ");
	    		start = 10000001;
	   			break;
	    	}
	    	if (response.equals("n")) {
	   			start = 10000001;
	   			break;
	   		}
	    	
	   		assert(start <= 10000000);
	   		start++;
		}
		assert response == "n";
		System.out.println("The mean value is: " + mean);
		System.out.println("The max value is: " + max);
		System.out.println("The min value is: " + min);
		        
		keyboard.close();
		System.exit(0);
	}

}


