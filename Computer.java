package org.system;

public class Computer{
	public void computerModel()
	{
		System.out.println("computer model is dell");
	}
}
class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("desktop size is 32 inches");
	}
	public static void main(String[] args){
		Desktop st=new Desktop();
		st.desktopSize();
		st.computerModel();
	}
}