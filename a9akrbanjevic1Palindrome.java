import java.util.Scanner;
public class a9akrbanjevic1Palindrome {

	static Scanner keyboard = new Scanner(System.in);
	private static String input = "";
	private static String rev = "";
	
//	
//	public boolean endLoop() {
//		if (input.equals("Stop") ) {
//			return false;
//		}
//		
//		else {
//			return true;
//		}
//	}
	
	public static String palindrometest () {
		String response;
		
		while (!input.equals("no") || !input.equals("No")) {
			System.out.println("Enter a string please!");
			input = keyboard.next();
			int inputlength = input.length();
			
			
			for (int i = inputlength - 1; i >= 0; i--) {
				rev = rev + input.charAt(i);
			}
			
			  if (input.equals(rev)) {
			
				  response = "This is a palindrome";
		
			  }
			   
			  else {
			
				  response = "This is not a palindrome!";
				
			  }        
			  return response;
		}
		
		response = "This is not a palindrome!";
		return response; 
	
	}
}


