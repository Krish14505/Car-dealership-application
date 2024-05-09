 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Krish Chaudhary
 * @version 25/2/2024
 */
class CarRegistrationTest2 {

 @Test
  /**
   * this method is used to test isPreApproved method 
   */
    public void testIsPreApproved() {
        

    	// Arrange
        double yearlyIncome = 700000; // Example yearly income
        double basePrice = 25000; // Example base price of the car
        double upgradeCoefficient = 1.2; // Example upgrade coefficient
        double colorIndex = 1000; // Example color index
        
        
        CarRegistration carRegistration = new CarRegistration(yearlyIncome, basePrice, upgradeCoefficient, colorIndex);

        
        // Act
        boolean result = carRegistration.isPreApproved();

        // Assert
        assertTrue(result); // We expect this customer to be pre-approved
    }	
 
 

   
    
}
