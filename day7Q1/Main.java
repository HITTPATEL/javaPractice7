package day7Q1;import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Main {
      public static void main(String[] args) {
		Manager m1=new Manager();
		
		m1.nameString="Raju";
		System.out.println("Name:"+ m1.nameString);
		
		m1.Specialisation="Manager";
		System.out.println("Specialisation:"+ m1.Specialisation);
		
		m1.Department="Bank";
		System.out.println("Department:"+ m1.Department );
		
		m1.age=22;
		System.out.println("Age:"+ m1.age );
		
		m1.phoneNumberString="9987879678";
		System.out.println("Phone Number:"+ m1.phoneNumberString);
		
		m1.addressString="M.P.";
		System.out.println("Address:"+ m1.addressString);
		
		m1.salary=20000;
     	m1.printSalary();
		
		System.out.println("=========================");
		Employee e1=new Employee();
		
		e1.nameString="Kanha";
		System.out.println("Name:"+ e1.nameString);
		
		e1.Specialisation="Employee";
		System.out.println("Specialisation:"+ e1.Specialisation);
		
		e1.Department="Bank";
		System.out.println("Department:"+ e1.Department );
		
		

		e1.age=18;
		System.out.println("Age:"+ e1.age );
		
		e1.phoneNumberString="38697394579";
		System.out.println("Phone Number:"+ e1.phoneNumberString);
		
		e1.addressString="U.P.";
		System.out.println("Address:"+ e1.addressString);
		
		e1.salary=10000;
		e1.printSalary();
		
		
		
		
		
		
	}
}
