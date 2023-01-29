package OopsPart1;

public class GlobalVariable {
	String name = "Krishna";//Global Variable or class variable
	int Age = 32;
	public static void main(String[] args) {
		//To access global variable under main method we have to create object
		GlobalVariable gv = new GlobalVariable();
		System.out.println(gv.name);
		System.out.println(gv.Age);
		
		int i=20;//Local Variable
		System.out.println(i);
		
		gv.Sum();
	}
	public void Sum()
	{
		int i=20;//Local variable
		int j=30;
		int k=i+j;
		System.out.println(k);
		System.out.println("Global variable i am accessing in method "+name);
	}

}
