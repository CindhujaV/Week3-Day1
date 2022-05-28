package org.system;

public class Desktop extends Computer {

	public void DesktopSize()
	{
	System.out.println("Desktop single inheritance");
	}
	public static void main(String[] args) {

		Desktop DTop = new Desktop();
		DTop.ComputerMethod();
		DTop.DesktopSize();

	}

}
