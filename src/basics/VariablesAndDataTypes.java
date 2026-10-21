
package basics;

public class VariablesAndDataTypes {

    public static void main(String[] args) {

        // 1. Integer type
        byte age = 23;
        short year = 2026;
        int marks = 85;
        long mobileNumber = 9876543210L;

        // 2. Decimal types
        float percentage = 85.5f;
        double salary = 25000.75;

        // 3. Character type
        char grade = 'A';

        // 4. Boolean type
        boolean isPassed = true;

        // 5. String type
        String name = "Nutan Mhase";
        String city = "Ahilyanagar";

        // Display all variables
        
        System.out.println("===== Student Information =====");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Year: " + year);

        System.out.println("\n===== Academic Details =====");

        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);

        System.out.println("\n===== Other Data Types =====");

        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Short Value: " + year);
        System.out.println("Byte Value: " + age);
        System.out.println("Float Value: " + percentage);
        System.out.println("Double Value: " + salary);
    }
}
