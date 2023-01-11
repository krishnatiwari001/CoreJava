package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
		//Execution : always start from left to right
		//+ : is called concatenation operator
		//println : it will print on console with new line
		//print : it will just print on console
		
		int a=10;
		double b=22.22;
		String Name = "Krishna";
		String S = "Tiwari";
		
		System.out.println(a+b);//32.22
		
		System.out.println(Name);//Krishna
		System.out.println(S);//Tiwari
		
		System.out.println(a+Name+b+S);//10Krishna22.22Tiwari
		System.out.println(Name+S+a+b);//KrishnaTiwari1022.22
		
		System.out.println(a+b+Name+S);//32.22KrishnaTiwari
		System.out.println(Name+S+(a+b));//KrishnaTiwari32.22
		
		System.out.println("My Name is : "+Name);
		System.out.println("Last Name is : "+ S);
		
		System.out.print("Hello");
		System.out.println("Hi Selenium");
		System.out.println("Selenium is good for automation");
		
	}

}
