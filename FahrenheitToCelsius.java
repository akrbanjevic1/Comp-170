import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//Here, the user is asked to give their temperature in Fahrenheit 
		System.out.println("Enter a temperature in Degrees Fahrenheit: ");
		double fahrenheit = keyboard.nextInt();
		
		//At this spot, we take the fahrenheit value and do the math to convert it
		double celsius = (5*(((fahrenheit)-32)/9));
		
		//Finally, we print a statement that takes the original fahrenheit value
		//and the newly converted celsius value and print a statement with it
		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees celsius");
		
	}

}
