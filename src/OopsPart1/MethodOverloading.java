package OopsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		//We can overload main method also
		//we can not create method inside method
		//duplicate method-->same methods name same no of arguments and same data type are not allowed
		//Method Overloading--> when the method name is same with different arguments or input parameters and 
		//different data type with in same class it is called method overloading
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(30,20);
	}
	public void sum()//0 input parameter
	{
		System.out.println("Zero Parameter method");
	}
	public void sum(int i)//1 input parameter
	{
		System.out.println("One Input Parameter");
		System.out.println(i);
	}
	public void sum(int i, int j)//2 input parameters
	{
		System.out.println("Two Input Parameters");
		System.out.println(i+j);
	}

}
