package ConditionalStatement;

import java.util.Scanner;

public class FoodDelApp {

    public static void main(String[] args) {

        System.out.println("======== Food Court ========");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Puri Bhaji - 200 Rs");
        System.out.println("2. Misal - 70 Rs");
        System.out.println("3. Vadapav - 30 Rs");
        System.out.println("4. Samosa - 20 Rs");
        System.out.println("5. Tea - 10 Rs");
        System.out.println("6. Biryani - 150 Rs");
        System.out.println("7. Chicken - 200 Rs");
        System.out.println("8. Veg Thali - 300 Rs");
        System.out.println("9. Sandwich - 120 Rs");
        System.out.println("10. Rajasthani Thali - 5000 Rs");

        System.out.println("\nWhat do you want to order?");

        String orderName = "";
        double orderPrice = 0;
        int qty = 0;
        double discount = 0;
        double totalPrice = 0;
        double gst = 0;
        double serviceCharge = 0;
        double finalPrice = 0;

        int choice = sc.nextInt();

        if (choice == 1) {
            orderName = "Puri Bhaji";
            orderPrice = 200;
        } 
        else if (choice == 2) {
            orderName = "Misal";
            orderPrice = 70;
        } 
        else if (choice == 3) {
            orderName = "Vadapav";
            orderPrice = 30;
        } 
        else if (choice == 4) {
            orderName = "Samosa";
            orderPrice = 20;
        } 
        else if (choice == 5) {
            orderName = "Tea";
            orderPrice = 10;
        } 
        else if (choice == 6) {
            orderName = "Biryani";
            orderPrice = 150;
        } 
        else if (choice == 7) {
            orderName = "Chicken";
            orderPrice = 200;
        } 
        else if (choice == 8) {
            orderName = "Veg Thali";
            orderPrice = 300;
        } 
        else if (choice == 9) {
            orderName = "Sandwich";
            orderPrice = 120;
        } 
        else if (choice == 10) {
            orderName = "Rajasthani Thali";
            orderPrice = 5000;
        } 
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.println("How many quantities do you want?");
        qty = sc.nextInt();

        totalPrice = orderPrice * qty;

        System.out.println("Total Price: " + totalPrice);

        if (totalPrice > 800) {

            // Apply 5% discount
            discount = totalPrice * 0.05;

            totalPrice = totalPrice - discount;

            System.out.println("You got free delivery!");

        } 
        else {
            discount = 0;
        }

        gst = 20;
        serviceCharge = 20;

        finalPrice = totalPrice + gst + serviceCharge;

        System.out.println("\n========== Your Final Receipt ==========");

        System.out.println("Order Name      : " + orderName);
        System.out.println("Order Price     : " + orderPrice);
        System.out.println("Total Quantity  : " + qty);
        System.out.println("Total Price     : " + totalPrice);
        System.out.println("Discount        : " + discount);
        System.out.println("GST             : " + gst);
        System.out.println("Service Charge  : " + serviceCharge);
        System.out.println("Final Price     : " + finalPrice);

        System.out.println("Your order is on the way...");
        System.out.println("============ Thank You ============");

        sc.close();
    }
}