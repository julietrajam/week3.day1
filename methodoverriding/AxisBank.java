package week3.day1.methodoverriding;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("Deposit Account from Child Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank a1=new AxisBank();
		a1.saving();
		a1.fixed();
		a1.deposit();
		
		

	}

}
