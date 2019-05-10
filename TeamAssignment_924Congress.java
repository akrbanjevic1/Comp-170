import java.util.Scanner;

public class TeamAssignment_924Congress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println("How many years have you had citizenship for?");
		int citizenship = keyboard.nextInt();
		response1(age, citizenship);	
		response2(age, citizenship);
		response3(age,citizenship);
		
	}
	
	public static boolean response1 (int age, int citizenship) {
		
			boolean Senate;
			if (age >= 30 && citizenship >= 9) {
				System.out.println("You are eligible to run for Senate");
				Senate = true;
			}
			else {
				System.out.println("You are not eligible to run for Senate");
				Senate = false;
			}
			return Senate;
		
	}
	public static boolean response2(int age, int citizenship) {
		
		boolean HouseOfReps;
		if (age>= 25 && citizenship >=7) {
			System.out.println("You are eligible to run for US house of Representatives!");
			HouseOfReps = true;
		}
		else {
			System.out.println("You are not eligible to run for US house of Representatives!");
			HouseOfReps = false;
		}
		return HouseOfReps;
	}
	public static boolean response3(int age, int citizenship) {
		boolean president;
		
		if (age == citizenship) {
			System.out.println("You are eligible to run for president!");
			president = true; 
		}
		else {
			System.out.println("You are not eligible to run for president");
			president = false;
		}
		
		return president;
	}
}
