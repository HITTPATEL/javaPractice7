package day7Q1;

public class Manager extends Member {
	String Specialisation;
	String Department; 
	
	@Override
	public void printSalary() {
		System.out.println("Salary:"+this.salary);
	}
}
