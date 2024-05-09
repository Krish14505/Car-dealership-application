

/**
 * This class extends the base class CarRegistration.
 * @author krish
 * @version 25/2/2024
 * 
 */

public class CarRegistration extends CarSelection {
	// variable to hold the buyer's first name
	private double basePrice;
	private double upgradeCoefficient; // value range: 1(no upgrade) to 2 (highest level upgrade)
	private double colorIndex; // value range: 0 (default color) to 5000
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private String occupation;
	private double yearlyIncome;
// The approved variable stores true/false depending on whether a customer is approved or not for a loan, respectively
	private boolean approved;
	

	public static int currentYear = 2024;
	
	// to calculate the customer age
	private int customerAge=currentYear - birthYear;
	
	//Constructor for the Junit test
	 public CarRegistration( double yearlyIncome,double basePrice, double upgradeCofficient, double colorIndex) {
		 this.yearlyIncome=yearlyIncome;
		 this.basePrice=basePrice;
		 this.upgradeCoefficient=upgradeCofficient;
		 this.colorIndex=colorIndex;
		 
	 }
	/**
	 * Constructor to instantiate a car registration object of the class
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param birth year
	 * @param yearly income
	 */
	public CarRegistration(double basePrice, double upgradeCoefficient,
	double colorIndex, String firstName, String lastName, String gender, int birthYear, String
	occupation, double yearlyIncome) {
	// To Do: complete the constructor
		super();
		this.basePrice = basePrice;
		this.upgradeCoefficient=upgradeCoefficient;
		this.colorIndex=colorIndex;
		this.firstName= firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.birthYear= birthYear;
		this.occupation=occupation;
		this.yearlyIncome=yearlyIncome;
	}
		
	// To Do:1. add appropriate setter and getter methods
	public String getFirstName() {
	     return firstName;	
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	//2.getter and setter for the lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName( String lastName) {
		this.lastName=lastName;
	}
	
	//3.getters and setters for the gender
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	//4.getters and setters for the birthyear
	public int getBirthyear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear=birthYear;
	}
	
	//5.getter and setters for the yearlyIncome
	public double getYearlyIncome() {
		return yearlyIncome;
	}
	public void setyearlyIncome(double yearlyIncome) {
		this.yearlyIncome=yearlyIncome;
	}
	
	//6.getters and setters for the occupation
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation=occupation;
	}
	
	//7.getters and setters for the upgradeCoefficient
	public double getUpgradeCoefficient() {
		return upgradeCoefficient;
	}
	public void setUpgradeCoefficient(double upgradeCoefficient) {
		this.upgradeCoefficient=upgradeCoefficient;
	}
     
	//8.getters and setters for the basePrice
	public double getBasePrice() {
		return basePrice ;
	}
	public void setbasePrice(double basePrice) {
		this.basePrice=basePrice;
	}
	
	//9.getters and setters for the colorIndex
	public double getColorIndex() {
		return colorIndex;
	}
	public void setColorIndex(double colorIndex) {
		this.colorIndex=colorIndex;
	}
	
	//10.getters and setters for the approved variable
	public boolean getApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved=approved;
	}
	

	/*
	 * 11.This method calculates a customer's age
	 */


	
	public int getCustomerAge() {
		return currentYear - birthYear;
	}
	public void setCustomerAge(int age) {
		this.customerAge=age;
	}
	/*
	 * This function checks whether a customer is eligible to purchase the car
	 * and prints out a message about it.
	 * To Do: a car's price should not be more than 20% of the customer's yearly
	 * salary. Implement the method below accordingly.
	 */
  
	  public boolean isPreApproved() {
		  double maxCarPrice = 0.2 * yearlyIncome; //20 percent of customer yearly income
		  double totalPriceOfCar = basePrice * upgradeCoefficient  + colorIndex;
		  
		  
		  //condition to check the whether the totalPrice of car is lower or not.
		  if (totalPriceOfCar<=maxCarPrice) {
			  System.out.println("Congratulation! , you are pre-approved. ");
			  return true;
		  }
		  else {
			  System.out.println("Sorry, you are not pre-approved for the car purchase.");
			  return false;
		  }
		  
	  }
		
/*
 * This function check if a customer is eligible to drive and prints a relevant message.
 * To Do: a customer's age should be at least 16 years to be eligible to drive.
 */
	public void isEligibleToDrive(){
		
		if(customerAge>=16) {
			System.out.println("yes,you are eligible to drive.");
		}
		else {
			System.out.println("No, You are not eligible to drive.");
		}
	
	}
	
	/*
	* This function prints the customer’s information 
	*/
	public void displayCustomerInfo() {
		/*
		 * print out the customer's following information
		 * first name, last name
		 * gender
		 * age
		 * birth year
		 * eligibility to drive
		 * eligibility to purchase the car
		 */
		
	System.out.println("Customer Information: ");
     System.out.println("First Name:- " + getFirstName());
     System.out.println("Last Name:- "+ getLastName());
     System.out.println("Gender:- "+getGender());
     System.out.println("Birth Year:-"+ getBirthyear());
     System.out.println("Age:-" +getCustomerAge());
     System.out.println("Yearly Income:- "+ getYearlyIncome());
     System.out.print("Eligiblity  to drive: ");
     isEligibleToDrive(); // this methods supports to print the eligibility of the customer to drive the car
     System.out.print("Eligibility to purchase the Car:- ");
     System.out.println();
     isPreApproved(); 		//this method is used to check whether the customer is able to purchase the Car financially or not.
     
	}

}

