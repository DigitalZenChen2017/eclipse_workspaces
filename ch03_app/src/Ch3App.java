import java.text.NumberFormat;
import java.util.Scanner;

public class Ch3App {

	public static void main(String[] args) {
		
		
//		// 1st example
//		int a = 14;
//		int b = 8;
//		
//		int c = a / b;
//		int d = a % b;
//		
//		System.out.println("a / b = "+c);
//		System.out.println("a % b = "+d);
//		
//		
		
//		// 2nd example - compound assignment
//		
//		int a = 100;
//		a+=50; // result should be 150
//		System.out.println(a);
//		a=+50;
//		System.out.println(a);
//		a-=20; // 130
//		System.out.println(a);
//		
//		int i = 52;
//		i%= 9;
//		System.out.println(i);
//		
//		
//	}
//		
////		// 3rd example - implicit casting
////		
////		int a = 5;
////		double b = 6;
////		double c= a * b;
//		
//		// - explicit casting
//		int a = 5.2;
//		double b = 6.8;
//		double c= a * (int)b;
		
//		// 4th example - wrapper classes
//	int a = 10;
//	int b = 20;
//	
//	int c = Math.max(a,  b);
//	int d = Math.min(b,  a);
//	
//	System.out.println("max = "+c);
//	
//	System.out.println("min = "+d);
//	
////	
////	Scanner sc = new Scanner(System.in);
////	String choice = "y";
////	while (choice.equalsIgnoreCase("y")) {
////		int r = (int)(100 * Math.random()) + 1;
////		System.out.println("random = "+r);
////		System.out.println("Continue?");
////		choice = sc.next();
////	}
	
	// 6th example - NumberFormat
	double sales = 350000.3331231;
	double interestRate = .025;
	double distancetoParisYard = 7268800;
	NumberFormat currencyFormat = 
			NumberFormat.getCurrencyInstance();
	NumberFormat percentFormat = NumberFormat.getPercentInstance();
	percentFormat.setMaximumFractionDigits(3);
	System.out.println(currencyFormat.format(sales));
	System.out.println(currencyFormat.format(interestRate));
	System.out.println(percentFormat.format(interestRate));
	System.out.println(distancetoParisYard);
		
		
	}
	
	
}

