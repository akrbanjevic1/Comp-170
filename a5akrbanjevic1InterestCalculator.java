import java.util.Scanner;
//First, the program will ask the user to enter their bank account balance and their interest rate
//Once it has this information, the program will then use the rate to multiply by the balance (which is turned into
//a double)
//Then we have 3 separate for loops; one for each type of ending balance required (yearly, monthly, daily)
//They then use the give balance and interest rates to calculate the ending balances with compounded interest included
//Each for loop prints out a statement displaying the ending balances with interest compounded
//We also use a while loop to see if the user wants to re-enter a new balance and interest rate
public class a5akrbanjevic1InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		double annual;
		double total;
		boolean exitloop = false;
		String answer1;
		
	while (!exitloop)	
	{
	   System.out.println("What is the balance of your bank account?");
	   double balance = keyboard.nextInt();
	   System.out.println("What is your interest rate?");
	   double rate = keyboard.nextInt();
		
		for (int i = 1; i < 2; i++) {
			double rate1 = rate / 100;
			annual = (balance * rate1);
			total = balance + annual;
			System.out.print("Ending balance with interest compounded yearly: ");
			System.out.println(total);
		}
		
		for (int i = 1; i <= 12; i++) {
			double rate1 = (rate / 100)/12;
			total = balance * Math.pow(1 + rate1, i);
			System.out.println("");
			System.out.println(total);
				if (i == 12 ) {
					System.out.println("Ending balance with interest compounded monthly: ");
					System.out.println("");
					System.out.println("-----------------------------");
				}
}
		for (int i = 1; i <= 365; i++) {
			double rate1 = ((rate / 100) / 365);
			total = balance * Math.pow(1 + rate1, i);
			System.out.println("");
			System.out.println(total);
				if (i == 365) {
					System.out.println("Ending balance with interest compounded daily: ");
					System.out.println("");
					System.out.println("-----------------------------");
				}
				
			}
					
		System.out.println("'Do you want to do a new balance? (Please type exactly either Yes or 'yes'");
		answer1 = keyboard.next();
		
		if (answer1.equals("Yes") || answer1.equals("yes" )) {
			exitloop = false;
		}
		else {
			exitloop = true;
		}
		
		}
	keyboard.close();
	}
}



