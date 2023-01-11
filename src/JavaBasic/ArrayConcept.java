package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		//integer array: to store similar data type values in array variable
		//lower index bound = 0
		//upper bound index = n-1(n is size of array)
		//one dimension array
		//disadvantage of array:
		//1.Size is fixed , Static array to overcome this problems we can use dynamic array collections ArrayList,Hash table use dynamic array
		//2.Store similar data type values to overcome this problem we can use Object array
		
		int i[] = new int [4];
		i[0]=20;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		System.out.println(i[3]);
		System.out.println(i.length);//it will give size of array
		
		//System.out.println(i[4]);//it will throw ArrayIndexOutOfBoundsException because i[4] is not declared in array
		
		//print all value of array using for loop
		for(int j=0; j<i.length; j++)
		{
			System.out.println("Integer array index"+" "+j+" "+"value is :"+i[j]);//it will print all values
			
		}
		//Double array
		double d[] = new double[4];
		d[0]=2.32;
		d[1]=30.25;
		d[2]=85.32;
		d[3]=89.32;
		System.out.println(d[0]);
		
		//print all values of array
		for(int k=0; k<d.length; k++)
		{
			System.out.println("Double array index"+" "+k+" "+"value is :"+d[k]);
		}
		
		//Char Array
		char c[] = new char[4];
		c[0]='K';
		c[1]='R';
		c[2]='I';
		c[3]='S';
		System.out.println(c[1]);
		
		//Print all values of array
		for(int l=0;l<c.length;l++)
		{
			System.out.println("Char array index"+" "+l+" "+"value is :"+c[l]);
		}
		
		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);
		
		//String Array String is a class not a data type
		String s[] = new String[4];
		s[0]="Krishn";
		s[1]="Tiwari";
		s[2]="Age";
		s[3]="Good person";
		System.out.println(s[2]);
		
		//print all value of array
		for(int m=0;m<s.length;m++)
		{
			System.out.println("String array index"+" "+m+" "+"value is :"+s[m]);
		}
		
		//Object array : in this array we can store any data type values
		Object o[] = new Object[4];
		o[0]="Krishna";
		o[1]="age";
		o[2]=32;
		o[3]=75.500;
		System.out.println(o[3]);
		
		//print all values of array
		for(int n=0;n<o.length;n++)
		{
			System.out.println("Object array index"+" "+n+" "+"value is :"+o[n]);
		}
	}

}
