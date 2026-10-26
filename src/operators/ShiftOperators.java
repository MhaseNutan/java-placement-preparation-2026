
package operators;

public class ShiftOperators {

    public static void main(String[] args) {

        int a = 8;

        System.out.println("Original value: " + a);

        // Left shift
        System.out.println("Left shift: " + (a << 1));

        // Right shift
        System.out.println("Right shift: " + (a >> 1));

        // Unsigned right shift
        System.out.println("Unsigned right shift: " + (a >>> 1));
    }
}
