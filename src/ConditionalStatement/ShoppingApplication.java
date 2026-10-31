package ConditionalStatement;

import java.util.Scanner;

public class ShoppingApplication{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("=======Shopping Application======");
	System.out.println("Enter your choice ... 1 to 4");
	System.out.println("1.Laptop - 30000Rs");
	System.out.println("2.Iphone - 1200000RS");
	System.out.println("3.Shirt - 1800Rs");
	System.out.println("4.TV - 11000Rs");
	
	System.out.println("Enter your choice to purchace product(1-4)");
	
	int choice = sc.nextInt();
	
	String product = "";
	int price = 0;
	double discount = 0;
	double finalPrice = 0;
	int qty = 0 ;
	double totalPrice = 0;
	
	if(choice == 1) {
		System.out.println("You select laptop ....");
		product = "Laptop";
		price = 30000;
		System.out.println("How many quantity you want?");
		 qty = sc.nextInt();
		 totalPrice = price * qty ;
		if(totalPrice > 50000) {
			System.out.println("Eligible for 5% discount");
			discount= 5;
			double x = totalPrice * 0.05;
			  finalPrice =totalPrice - x;
			}else
				{
				System.out.println("No discount applicble");
				discount = 0;
				finalPrice = totalPrice;
				}
	}else
		if(choice == 2) {
		System.out.println("You select Iphone ....");
		product = "Iphone";
		price = 1200000;
		System.out.println("How many quantity you want?");
		 qty = sc.nextInt();
		 totalPrice = price * qty ;
		if(totalPrice > 60000) {
			System.out.println("Eligible for 5% discount");
			discount= 6;
			double x = totalPrice * 0.06;
			  finalPrice =totalPrice - x;
			}else
				{
				System.out.println("No discount applicble");
				discount = 0;
				finalPrice = totalPrice;
				}
	}
	else
	if(choice == 3) {
		System.out.println("You select Tshirt ....");
		product = "Tshirt";
		price = 1800;
		System.out.println("How many quantity you want?");
		 qty = sc.nextInt();
		 totalPrice = price * qty ;
		if(totalPrice > 2000) {
			System.out.println("Eligible for 5% discount");
			discount= 3;
			double x = totalPrice * 0.03;
			  finalPrice =totalPrice - x;
			}else
				{
				System.out.println("No discount applicble");
				discount = 0;
				finalPrice = totalPrice;
				}
	}
	else if(choice == 4) {
		{
			System.out.println("You select TV ....");
			product = "Television";
			price = 11000;
			System.out.println("How many quantity you want?");
			 qty = sc.nextInt();
			 totalPrice = price * qty ;
			if(totalPrice > 15000) {
				System.out.println("Eligible for 5% discount");
				discount= 5;
				double x = totalPrice * 0.05;
				  finalPrice =totalPrice - x;
				}else
					{
					System.out.println("No discount applicble");
					discount = 0;
					finalPrice = totalPrice;
					}
		}
	}
	
	System.out.println("==============Receipt============");
	System.out.println("Product Name :" + product );
	System.out.println("Quantity: "+qty);
	System.out.println("Total Price: "+ totalPrice+ "Rs");
	System.out.println("Discount: "+discount + "%");
	System.out.println("Final Price: "+finalPrice + "Rs");
	System.out.println("Your "+ product +" is booked...");
}
}
