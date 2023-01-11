package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {
		//while and for are keyword in java so we need to write in small letters
		
		//while loop: 
		//Disadvantage of while loop: if we will not assign increment/decrement part then it will generate infinite loop
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;//Increment
		}
		int k=10;
		while(k>=0)
		{
			System.out.println(k);
			k--;//Decrement
		}
		System.out.println("_________________________");
		//for loop
		for(int j=0;j<=10;j++)
		{
			System.out.println(j);
		}
		for(int l=10;l>=0;l--)
		{
			System.out.println(l);
			
		}
	}

}
