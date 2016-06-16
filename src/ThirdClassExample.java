import java.util.Scanner;

import jdk.internal.dynalink.beans.StaticClass;

public class ThirdClassExample {
	static Scanner myScanner=new Scanner(System.in);
	
	static String[] books={"Java", "C","Python"};
	static final double studentDiscount=0.3;
	static final double teacherDiscount=0.4;
	static final double alienDiscount=0.0;

	public static void main(String[] args) { 
		prln("*****************Welcome to our bookstore************");
		prln("Which book do you want?\nAns: ");
		String userChoice=myScanner.nextLine();
		if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
			
			prln("you opted for " + books[0]+" books");
			calculatePrice(books[0]);
			
		}else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
			
			prln("you opted for " + books[1]+" books");
			calculatePrice(books[1]);
			
		}else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
			
			prln("you opted for " + books[2]+" books");
			calculatePrice(books[2]);
			
		}else {
			
			prln("Sorry,We don't have this book");
			
		}
	}
	static void calculatePrice(String bookName){
		
		prln("Are you Student,Teacher,Alient?\nAns: ");
		String answer=myScanner.nextLine();
		double price=200;
		if (answer.toLowerCase().equals("teacher")) {
			
			price=price-(price*teacherDiscount);
			showPrice(price);
			
		}else if (answer.toLowerCase().equals("student")) {
			price=price-(price*studentDiscount);
			showPrice(price);
		}else if (answer.toLowerCase().equals("alient")) {
			
			price=price-(price*alienDiscount);
			showPrice(price);
		}else {
			prln("Sorry we can't serve you.");
		}
	}
	
	static void showPrice(double price){
		prln("your total amount: " +price);
		prln("\n-------Thank you for shopping--------");
	}
	
	static public void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static public void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
