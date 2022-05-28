package week3day1;

public class BankInfo {
		
		public void Savings()
		{
			System.out.println("Savings Bank Account");
		}
		public void Fixed()
		{
			System.out.println("Fixed Account");
		}
		public void Deposit()
		{
			System.out.println("Deposit Account");
		}
		public static void main(String[] args) {
	
			BankInfo Bnk = new BankInfo();
			Bnk.Savings();
			Bnk.Fixed();
			Bnk.Deposit();
		}
		
		

}
