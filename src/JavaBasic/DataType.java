package JavaBasic;
public class DataType{
public static void main(String[] args) {
		System.out.println("Data Type ");
		//Primitive Data type: integer,Double,char,boolean these are primitive data type
		//Integer: we can store only integer values
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);//30
		a=40;
		System.out.println(a);//40 it will replace a value 10 to 40
		
		//Double: we can store only decimal numbers and integer numbers also as decimal
		double d = 12.56;
		double d1=100;
		System.out.println(d);//12.56
		System.out.println(d1);//100.00
		
		//Char: we can store only single characters using single quotes
		char c2='K';
		char c1='R';
		System.out.println(c2);//K
		System.out.println(c1);//R
		
		//boolean: we can store only true and false and same keywords are present in java 
		boolean b1= true;
		boolean b2=false;
		System.out.println(b1);
		System.out.println(b2);
		
		//String: we can store only string values using double quotes and it is class not a data type
		String Name = "Krishna";
		String Mob = "9619951168";
		System.out.println(Name);
		System.out.println(Mob);
	}

}
