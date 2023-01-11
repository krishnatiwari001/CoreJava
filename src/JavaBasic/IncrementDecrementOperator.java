package JavaBasic;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		//++
		//--
		int i=1;
		int j=i++; //Post Increment first it will assign value of i to j after that it will increase value of i by 1
		System.out.println(i);//2
		System.out.println(j);//1
		
		int a=1;
		int b=++a; //Pre Increment first it will increase value of a by 1 after that it will assign value of a to b
		System.out.println(a);//2
		System.out.println(b);//2
		
		int m=4;
		int n=m--; //Post Decrement first it will assign value of m to n after that it will decrease value of m by 1
		System.out.println(m);//3
		System.out.println(n);//4
		
		int k=6;
		int l=--k; //Pre Decrement first it will decrease value of k by 1 after that it will assign to l
		System.out.println(k);//5
		System.out.println(l);//5
	}

}
