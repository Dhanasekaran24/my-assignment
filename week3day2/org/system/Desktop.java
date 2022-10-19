package org.system;

public class Desktop extends computer {
	
	public void desktopSize()  {
		System.out.println("The size of the Desktop is 14 ");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
