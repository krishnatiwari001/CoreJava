package OopsPart2;
//3rd class for method overriding with main method
public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		//When ever a method in common in child class as well as in parent class then preference will be given to child class method
		b.start();
		//when same method is present in child class as well as in parent class with same name same datatype same number of arguments is called method overriding
		//static polymorphism or compile time polymorphism
		//because during compilation java will decide which method need to call
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("*************");
		
		Car c = new Car();//Object of parent class(Car)
		c.start();
		c.stop();
		c.refuel();
		
		//Parent class can not access child class method
		
		System.out.println("************");
		
		//Top casting 
		Car c1 = new BMW();//Child class object can be referred by parent class reference variable -- dynamic polymporphism or Run time polymporphism
		//Only over ridden method we can call or common method using parent class reference variable 
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down casting
		BMW b1 = (BMW)new Car();
		//Parent class object can be referred by child class reference variable
		//Down casting is not allowed it will through error
		//ClassCastException
		

	}

}
