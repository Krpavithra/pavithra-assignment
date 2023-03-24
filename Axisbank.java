package week5.day5;

public class Axisbank extends Bankinfo{
	public void deposit() {
		System.out.println("deposit the money 20000");
	}
	public static void main(String[] args) {
		Axisbank  money=new Axisbank();
		money.Deposit();
		money.Saving();
		money.Fixed();
	}

}