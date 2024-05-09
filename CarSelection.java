 
/*
 * CarSelection is a base class to be extended for a vehicle purchase
 * process, which is also named as Assignment 1. It contains a method to to calculate
 * a vehicle price. It also contains a function that uses a wrong formula
 * to calculate a vehicle's price.
 * 
 * 
 * @version 1.0
 */

/**
 * This  base class has the method for calculating the actual car price 
 * @author krish
 * @version 25/2/2024
 * 
 */

public class CarSelection {
	/**
	 * This method returns the price of a vehicle of a particular model based on
	 * its base price, upgrade coefficient and color choice.
	 * @param basePrice      this is the base price for the car
	 * @param upgradeCoefficient  this is upgrade coffcient value which range is between 1 to 2.
	 * @param colorIndex    this has range between 0(default color) to 5000.
	 * @return basePrice * upgradeCoefficient + colorIndex   return the actual value.
	 */
	
	
	public double calculateCarPrice(double basePrice, double upgradeCoefficient, double colorIndex) {
		return basePrice * upgradeCoefficient + colorIndex;
	}
	
	/**
	 * this method returns the Price of the car incorrectly as it has the logical error while returning
	 * @param basePrice
	 * @param upgradeCoefficient
	 * @param colorIndex
	 * @return basePrice * upgradeCoefficient + colorIndex
	 */
	
	public double incorrectCarPrice(double basePrice, double upgradeCoefficient, double colorIndex) {
		return basePrice + upgradeCoefficient + colorIndex;
	}
	
}

