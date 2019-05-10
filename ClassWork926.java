import java.util.Scanner;

public class ClassWork926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many times?");
		int times = keyboard.nextInt();
		StringBuilder s = new StringBuilder ("");
		int i = 0;
		String at = "@";
		
	while (times < 1 || times > 99) {
		if (times < 1 || times > 99) {
			System.out.println("Please try again!");
			times = keyboard.nextInt();
		}
	}
		
		if (times >= 1 && times <= 99) {
			for (i = 0; i < times; i++) {
				s.append(at);
				System.out.println(s);
			}
		}
	}	
}
