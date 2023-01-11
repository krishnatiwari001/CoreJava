package OopsPart1;

public class WrapperClass {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);//10020
		
		//Integer,double,boolean are wrapper class
		
		//String to integer conversion
		int i = Integer.parseInt(x);
		System.out.println(x+20);//120
		
		String y="12.33";
		System.out.println(y+10);//12.3310
		
		//String to double conversion
		double d = Double.parseDouble(y);
		System.out.println(d+10);//22.33
		
		String z="true";
		System.out.println(z+10);//true10
		
		//String to boolean conversion
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		
		int m=100;
		System.out.println(m+40);//140
		
		//int to String Conversion
		String s = String.valueOf(m);
		System.out.println(s+10);//10010
		
		//String to int conversion
		String p = "100P";
		int  n= Integer.parseInt(p);
		System.out.println(n);//it will throw error NumberFormatException -- because string is not in proper integer format
	}

}
