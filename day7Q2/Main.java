package day7Q2;

public class Main {
   
	public static void main(String[] args) {
		
		DayScholar s1=new DayScholar(1234,"Shubham",2000.00,1000.00);
		
		s1.displayDetails();
		System.out.println("Transport Fee is "+s1.transportFee);
		double totalFee=s1.payFee();
		System.out.println("Total fee is "+totalFee);
		System.out.println("=======================");
		
		Hosteller s2=new Hosteller(4321,"Rajsekar",2000,4000);

		s2.displayDetails();
		System.out.println("Hostel Fee is "+s2.hostelFee);
		double totalFees=s2.payFee();
		System.out.println("Total fee is "+totalFees);
		System.out.println("=======================");
		
		
	}
}
