package day7Q4;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
			AxisBank a1=new AxisBank();
			a1.branchName="Axis Bank Ashta";
			a1.ifscCode="AXIS0000896";
			a1.rateOfInterest=7;
			return a1;
		}
		else if(bank.equals("icici")) {
			ICICIBank a2=new ICICIBank();
			a2.branchName="ICICI Bank Ashta";
			a2.ifscCode="ICICI89798789";
			a2.rateOfInterest=8;
			return a2;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		
		System.out.println("Enter Branch Name");
		String bankNameString=inputScanner.next();
		
	    if(bankNameString.equals("icici")) {
	    	Bank b1=getBank(bankNameString);
	    	ICICIBank i1=(ICICIBank)b1;
	    	i1.displayDetails();
	    	
	    }
	    else if(bankNameString.equals("axis")) {
	    	Bank b1=getBank(bankNameString);
	    	AxisBank a1=(AxisBank)b1;
	    	a1.displayDetails();
	    	a1.getCreditCard();
	    }
	    else {
	    	Bank b1=getBank(bankNameString);
	    }
		
		
		
	}
}
