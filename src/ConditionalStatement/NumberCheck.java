package ConditionalStatement;
import java.util.Scanner;
// else-if
	public class NumberCheck {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int num = sc.nextInt();

	        if (num > 0) {
	            System.out.println("Positive Number");
	        } else if (num < 0) {
	            System.out.println("Negative Number");
	        } else {
	            System.out.println("Zero");
	        }

	        sc.close();
	    }
}
