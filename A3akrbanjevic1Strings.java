import java.util.Scanner;
//First, the program asks the user to key in a sentence of their choice
//When the program reads the word "hate" in the input, it will change it to love
//This is accomplished with the (sentence.replaceFirst('hate','love')) line
//This will look for the first substring of "hate" and then replace it with the string
// "love"
//Finally, the user is able to see that the line was rephrased and with the replaced 
// word
public class A3akrbanjevic1Strings {

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a line of text: ");
        String sentence = keyboard.nextLine();
        System.out.println("I have rephrased that line to read:");
        System.out.println(sentence.replaceFirst("hate", "love"));
    }
}
