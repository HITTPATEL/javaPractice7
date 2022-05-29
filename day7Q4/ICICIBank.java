package day7Q4;

public class ICICIBank extends Bank  {
    double rateOfInterest;
    
    @Override
    public void displayDetails() {
    	 System.out.println("Branch Name is "+branchName);
		  System.out.println("IFSC Code is "+ifscCode);
		  System.out.println("Rate of Interest "+rateOfInterest);
    }
}
