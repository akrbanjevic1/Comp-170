import java.util.Scanner;

//First the program asks each player what their choice is between
// r, p, or s
//Then the program checks for both uppercase and lowercase variations of letters
//The program then checks for the first players entry, and then it checks if 
//there they have won, lost, or tied
//Process is repeated for the other two options
public class A4akrbanjevic1RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome! To play, please type: 'r', 'p', or 's'");
		System.out.println("Player 1: enter your choice");
		String user1 = keyboard.next();
		System.out.println("Player 2: enter your choice");
		String user2 = keyboard.next();
		
		if (user1.equals("r") || user1.equals("R")) {
			if (user2.equals("s") || user2.equals("S")) {
				System.out.println("Player 1 wins! Rock beats scissors!");
			}
			else if (user2.equals("p") || user2.equals("P")) {
				System.out.println("Player 2, you win! Paper beats rock!");
			}
			else {
				System.out.println("Tied. Try again!");
			}
		}
		else if (user1.equals("p") || user1.equals("P")) {
			if (user2.equals("r") || user2.equals("R")) {
				System.out.println("Player 1 wins! Paper beats rock!");
			}
			else if (user2.equals("s") || user2.equals("S")) {
				System.out.println("Player 2 wins! Scissors beat paper!");
			}
			else {
				System.out.println("Tied. Try again!");
			}
		}
		else {
			if (user2.equals("p") || user2.equals("P")) {
				System.out.println("Player 1 wins! Scissors beats paper!");
			}
			else if (user2.equals("r") || user2.equals("R")) {
				System.out.println("Player 2 wins! Rock beats scissors!");
			}
			else {
				System.out.println("Tied. Try again!");
			}
		}
		keyboard.close();
	}	
}
