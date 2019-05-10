import java.util.Scanner;
public class HarrisBenedict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//First the program asks the user for weight
		System.out.println("What is your weight (in pounds)?");
		double weight = keyboard.nextDouble();
		
		//After that, the program then asks the user for their height in inches
		System.out.println("What is your height (in inches?)");
		double height = keyboard.nextDouble();
		
		//Finally, the program asks the user for their age in years
		System.out.println("What is your age in years?");
		int age = keyboard.nextInt();
		
		//Here, we have the formulas for calculating the BMR based on gender
		//BMRw is for females, and BMWm is for males
		double BMRw = 655 + (4.3 * weight) + (4.7 * height) - (4.7 *age);
		double BMRm = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		//Finally, the program prints two statements, one for both males and females
		//and it uses the Math.round function to give the user an estimated whole number 
		//of chocolate bars
		System.out.println("If you are female, you need to consume about " + 
				Math.round((BMRw/230)) +
				" chocolate bars");
		
		
		System.out.println("If you are male, you need to consume about " + 
				Math.round((BMRm/230)) + 
				" chocolate bars");
			
	}

}
