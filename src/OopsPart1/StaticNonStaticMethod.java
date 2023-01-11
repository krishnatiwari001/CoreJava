package OopsPart1;

public class StaticNonStaticMethod {
	String name = "Krishna";//non Static method
	static int age = 32;//Static method
	
	public static void main(String[] args) {
	
		//Global Variable: the scope of global variables are available across all the functions with some conditions
       //Static variables we can access directly but not static variables or methods we can access using object reference	
		
		StaticNonStaticMethod obj = new StaticNonStaticMethod();
		
		//How i can call static method or variable
		
		//1.Direct calling
		System.out.println(age);//static variable without object reference i can call
		Sum();//static method
		
		//2 Using class name
		System.out.println(StaticNonStaticMethod.age);
		StaticNonStaticMethod.Sum();
		
		//How we can call non static method or variables
		
		//1. Using object reference variable
		System.out.println(obj.name);//Non static variable
		obj.Name();//Non static method
		
		//Can i access static method using object reference Yes 
		//but warning(the static method should be accessed in static way) will be given and it is not good practice
		obj.Sum();
	}
	public static void Sum()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	public void Name()
	{
		System.out.println("Krishna");
		System.out.println("Sachin");
	}

}
