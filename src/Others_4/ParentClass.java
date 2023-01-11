package Others_4;

//public final class ParentClass {//it will throw error during inheritance(in child class) because i have declared ParentClass as final class
public class ParentClass
{
	//public final void Start()//It will throw error during method overriding (in child class method) because i have declared Start method as final
	public void Start()
	{
		System.out.println("This is parent method");
	}

}
