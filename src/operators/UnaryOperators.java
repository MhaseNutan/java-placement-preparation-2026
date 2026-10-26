
package operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Initial value: " + a);

        // Increment
        System.out.println("Post-increment: " + a++);
        System.out.println("After post-increment: " + a);

        System.out.println("Pre-increment: " + (++a));

        // Decrement
        System.out.println("Post-decrement: " + a--);
        System.out.println("After post-decrement: " + a);

        System.out.println("Pre-decrement: " + (--a));

        // Unary minus
        System.out.println("Unary minus: " + (-a));

        // Unary plus
        System.out.println("Unary plus: " + (+a));
    }
}
