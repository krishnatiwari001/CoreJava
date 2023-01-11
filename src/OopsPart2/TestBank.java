package OopsPart2;

//Second class of Interface

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);//we can access interface variable using interface name
		
		HSBCBank hs = new HSBCBank();
		hs.Credit();
		hs.Debit();
		hs.TransferMoney();
		hs.EducationLoan();
		hs.CarLoan();
		
		//Dynamic Polymorphism:
		//Child class object can be referred by parent Interface reference variable
		
		USBank b = new HSBCBank();
		b.Credit();
		b.Debit();
		b.TransferMoney();
		//b.EducationLoan // we can access only parent overriden methods

	}

}
