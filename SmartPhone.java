package week3day1;

public class SmartPhone extends AndroidPhone{

	
	public void ConnectWhatsApp()
	{
		System.out.println("WhatsApp");
	}
	public static void main(String[] args) {
		SmartPhone mob = new SmartPhone();
		mob.sendMsg();
		mob.MakeCall();
		mob.SaveContact();
		mob.TakeVideo();

	}

}
