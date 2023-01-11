package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		//all keywords are present in small letters
		//if is a keyword
		//if c=d means you are assigning value of c into d
		//if c==d you are comparing value of c to d
		//comparison operators < > <= >= == !=
		
		int a=110;
		int b=20;
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("B is greater than a");
		}
		
		int c=40;
		int d=40;
		if(c==d)
		{
			System.out.println("C and D are equal");
		}
		else
		{
			System.out.println("C and D are not equl");
		}
		
		//write logic to find greatest number out of 3 numbers
		int a1=150;
		int b1=260;
		int c1=70;
		if(a1>b1 && a1>c1)
		{
			System.out.println("A1 is greatest number");
		}
		else if(b1>c1)
		{
			System.out.println("B1 is greatest number");
		}
		else
		{
			System.out.println("C1 is greatest number");
		}
	}

}
