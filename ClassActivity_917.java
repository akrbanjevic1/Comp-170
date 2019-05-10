import java.util.Scanner;
public class ClassActivity_917 {

    private static final boolean DEBUG = true;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to loop to: ");
        int number = keyboard.nextInt();
        int start = 0;
        while (start < number) {
            if (DEBUG) {
                System.out.println("Value of start is " + start);
                assert(start < number);
            }
            System.out.println("Counting");
            start++;
        }
        assert start >= number;
        
        keyboard.close();
    }

}
