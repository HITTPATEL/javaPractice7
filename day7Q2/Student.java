package day7Q2;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		  System.out.println("Student Id is "+studId);
		  System.out.println("Student Name is "+studName);
		  System.out.println("Exam Fee is "+ examFee);
	}
	
	public double payFee() {
		
		return examFee;
	}

	public Student(int studId, String studName, double examFee) {
	
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
 
	

	
	
}
