 
import java.util.Scanner;
/**
 * This class contains main method for the CarRegistration
 * @author krish
 * @version 25/2/2024
 * 
 */

public class carRegistrationTest {
	/**
	 * this  method is used to print the customer information and his eligibility.
	 * @param args
	 */
  public static void main(String[] args) {
	
	  //creating
	  Scanner sc = new Scanner(System.in);
	  
	  //Taking input of the car details
	  System.out.println("Enter the base price of the car:- ");
	  double basePrice = sc.nextDouble();
	     
	  System.out.println("Enter the upgrade coeffcient(between 1 and 2):- ");
	  double upgradeCoffcient = sc.nextDouble();
	  
	  System.out.println("Enter the color index(0(default) to 5000):- ");
	  double  colorIndex = sc.nextDouble();
	  
	  // taking input of the customer details
	  
	  System.out.println("Enter your First Name:- ");
	  String firstName = sc.next();
	  
	  System.out.println("Enter your Last Name:- ");
	  String lastName = sc.next();
	  
	  System.out.println("Enter your gender:- ");
	  String gender = sc.next();
	  
	 System.out.println("Enter  birthYear:- ");
	  int birthyear = sc.nextInt();
	  
	  System.out.println("Enter Occupation:- ");
	  String occupation = sc.next();
	  
	  System.out.println("Enter Yearly Income:- ");
	  double yearlyIncome = sc.nextDouble();
	  
//	  System.out.println("Enter your Age:- ");
//	  int customerAge = sc.nextInt();	  
//	  
   /*
   * creating an object of a class called CarRegistration and set the parameter as shown above.
   */
	  
	  CarRegistration registration1 = new CarRegistration(basePrice, upgradeCoffcient,colorIndex,
			                           firstName,lastName,gender,birthyear,occupation,yearlyIncome);
	  
  
	   
	  
	   
	   //Calling a method to display all the information details of the customer
	   
	   registration1.displayCustomerInfo();
	 
	   
	   // total car price of with all estimation
	   
	     CarSelection selection1 = new CarSelection();
	     
	      double totalCalculatedPrice= selection1.calculateCarPrice(basePrice, upgradeCoffcient, colorIndex);
	  
	         System.out.printf("Final cost of the car is:- %.2f", totalCalculatedPrice);
}
}
