package day7Q4;

import java.lang.reflect.Method;

public class AxisBank extends Bank {
	  double rateOfInterest;
	
	  @Override
	public void displayDetails() {
		  System.out.println("Branch Name is "+branchName);
		  System.out.println("IFSC Code is "+ifscCode);
		  System.out.println("Rate of Interest "+rateOfInterest);
		
	}
	  
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	   
}
