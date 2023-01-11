package OopsPart1;

public class Car {
	//We can say global variable or class variable also
	int mod;//Global Variable
	int wheel;//Global Variable
	
	public static void main(String[] args) {
	Car a = new Car();
	Car b = new Car();
	Car c = new Car();
	//a,b,c are object reference variable
	//new Car() This is object of car class
	//we can not create duplicate reference variable
	//new keyword is used to create the object
	//class is entities where we have to define number properties,methods and variables.
	
	a.mod=2015;
	a.wheel=4;
	b.mod=2013;
	b.wheel=4;
	c.mod=2011;
	c.wheel=4;
	
	System.out.println("Before Shifting References");
	System.out.println(a.mod);
	System.out.println(a.wheel);
	
	System.out.println(b.mod);
	System.out.println(b.wheel);
	
	System.out.println(c.mod);
	System.out.println(c.mod);
	
	System.out.println("After Shifting References");
	
	a=b;
	b=c;
	c=a;
	System.out.println(a.mod);//2013
	System.out.println(b.mod);//2011
	System.out.println(c.mod);//2013
	
	a.mod=10;
	System.out.println(a.mod);//10
	System.out.println(c.mod);//10
	
	c.mod=20;
	System.out.println(a.mod);//20
	System.out.println(b.mod);//2011
	System.out.println(c.mod);//20
	
	}

}
