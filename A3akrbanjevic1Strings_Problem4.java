import java.util.Scanner;
// First the program will ask the user for their favorite color, food, and animal
//It stores this information in three different strings
//Then after it has this information, it will ask the user for the name of a friend
//or relative, and store it in the "name" string
//Once it has this information, the program will output a line that uses all
//of the strings with values

public class A3akrbanjevic1Strings_Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your favorite color: ");
		String color = keyboard.next();
		System.out.println("Enter your favorite food: ");
		String food = keyboard.next();
		System.out.println("Enter your favorite animal ");
		String animal = keyboard.next();
		System.out.println("Enter the name of a friend or relative");
		String name = keyboard.next();
		System.out.println("");
		
		System.out.println("I had a dream that " + name + " ate a " + color + " "
				+ animal + " and said it tasted like " + food + "!");
		
		
	}

}
