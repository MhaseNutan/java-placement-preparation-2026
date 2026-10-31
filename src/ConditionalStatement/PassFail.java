package ConditionalStatement;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Student is Pass");
        } else {
            System.out.println("Student is Fail");
        }

    }
}