package ConditionalStatement;

import java.util.Scanner;

/*if (condition) {
 code executes if condition is true
}*/
public class If {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	   /*     System.out.println("Enter a number:");
	        int num = sc.nextInt();

	        if (num > 0) {
	            System.out.println("Number is Positive");
	        }
*/
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();

	        if (num % 2 == 0) {
	            System.out.println("Number is Even");
	        
	    }
	    }    
}
