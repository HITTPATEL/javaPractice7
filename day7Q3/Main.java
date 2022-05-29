package day7Q3;

public class Main extends SuperKeyword{
	
	public void name() {
		  System.out.println(super.x);
	}
	public static void main(String[] args) {
		  Main main=new Main();
		  main.name();
	}
}


//Q3)What is the use of ‘this’ and ‘super’ keyword in java explain with example.

//Answer :-
//"this" Keyword:-
//'this' keyword is used in parent class.
//this(): It is used to call, same class Default or Parametrized Constructor.
//The this keyword refers to the current object in a method or constructor

//"super" Keyword:-
// 'super' keyword is used to call parent constructor by child class.
//The super keyword refers to superclass (parent) objects. 
//It is used to call superclass methods, and to access the superclass constructor. 