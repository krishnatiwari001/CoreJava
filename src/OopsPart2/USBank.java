package OopsPart2;

//First Interface 

public interface USBank {
	int min_bal = 100;
	
	public void Credit();
	public void Debit();
	public void TransferMoney();
	

	//Only we can declare method 
	//In interface we can declare variables and variables are by default static in nature
	//In interface value of variables will not change,it's final/constant in nature
	//no static method allowed in interface
	//In interface we can not give method body 
	//Main method is not present in Interface
	//We can not create the object of interface 
	//Interface is abstract in nature
	
}
