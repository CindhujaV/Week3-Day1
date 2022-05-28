package week3day1;

public class AxisBank extends BankInfo {
	
public void Deposit()
{
	System.out.println("Overriding Deposit to Fixed Deposit");
}

	public static void main(String[] args) {
		AxisBank Dep = new AxisBank();
		Dep.Deposit();
		

	}

}
