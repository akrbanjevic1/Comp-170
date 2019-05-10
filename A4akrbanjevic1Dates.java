import java.util.Scanner;

//First the program asks the user to enter a date in MM/DD/YYYY format
//Then the program takes the substring of the month, day, and year to be able
//to convert it to an int later
//Then the program checks to see if the users input is a valid month
//From here, the program will check to see if the input includes the months of
//April, September, June, or November
//Then it checks if the day is valid
//For February, we check to see if it is a leap year or not
//Depending on whether or not it is, we then check to see if the days are accurate
//For the rest of the months, we check to see if the user entered more than 31 days
//If not, then the date gets printed. If they did, then they are informed of their
//error
public class A4akrbanjevic1Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a date in MM/DD/YYYY format");
		System.out.println("An example would be: 01/10/2000");
		String date = keyboard.nextLine();
		
		//int index = indexOf("/");
		//String m = date.substring(0, index);
		//String test = s.substring(index+1);
		
		String month1 = date.substring(0, 2);
		String day1 = date.substring(3,5);
		String year1 = date.substring(6);
		int month = Integer.parseInt(month1);
		int day = Integer.parseInt(day1);
		int year = Integer.parseInt(year1);
		
		if (month <= 12) {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day <= 30) {
					System.out.println(date + " is a valid date.");
				}
				
				else {
					System.out.println(date + " is not a valid date." + 
				" you can't have more than 30 days.");
				}
			}
			else if (month == 2) {
				if (year % 4 == 0 || year % 400 == 0) {
					if (day <= 29) {
						System.out.println(date + " is a valid date.");
					}
					else {
						System.out.println(date + " is not a valid date. You" +
					" can't have more than 29 days in this month.");
					}
				}
				else {
					if (day <= 28) {
						System.out.println(date + " is a valid date.");
					}
					else {
						System.out.println(date + " is not a valid date." +
					" you can't have more than 28 days in this month.");
					}
			}
			}
			
			else {
				if (day <= 31) {
					System.out.println(date + " is a valid date.");
				}
				else {
					System.out.println(date + " is an invalid date. You can't "
							+ "have more than 31 days.");
				 }
		}
		}	
		
		else {
			System.out.println(date + " is not a valid date. Your month can't be"
					+ " over 12.");
		     }
	keyboard.close();
	}

}
