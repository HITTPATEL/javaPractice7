package day7Q3;

import java.util.jar.Attributes.Name;

public class Thiskeyword {
      int a=2;
      int b=3;
   public void name() {
	    System.out.println(this.a);
    }
   public static void main(String[] args) {
	     Thiskeyword thiskeyword=new Thiskeyword();
	      thiskeyword.name();

	     }
}
