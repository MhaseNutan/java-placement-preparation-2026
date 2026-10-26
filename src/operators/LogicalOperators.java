
package operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 23;
        boolean hasId = true;

        // Logical AND
        System.out.println((age >= 18) && hasId);

        // Logical OR
        System.out.println((age < 18) || hasId);

        // Logical NOT
        System.out.println(!hasId);
    }
}
