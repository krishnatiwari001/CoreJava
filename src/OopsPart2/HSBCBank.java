package OopsPart2;

//First Class for Interface 

public class HSBCBank implements USBank,BrazilBank {//we are achieving multiple inheritance
	//This is call Is-a-relationship 

	//If a class is implementing any Interface, then its mandatory to define/override all the methods of Interface
	//below methods are overriding from USBank
		public void Credit()
		{
			System.out.println("HSBC---Credit");
		}
		public void Debit()
		{
			System.out.println("HSBC------Debit");
		}
		public void TransferMoney()
		{
			System.out.println("HSBC------TransferMoney");
		}
		//below methods are seperate method of HSBC Bank
		public void EducationLoan()
		{
			System.out.println("HSBC------EducationLoan");
		}
		public void CarLoan()
		{
			System.out.println("HSBC------CarLoan");
		}
		//Below method is Overriding from Brazil bank
		public void MutualFund()
		{
			System.out.println("HSBC------MutualFund");
		}

}
