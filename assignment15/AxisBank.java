package assignment15;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("DEPOSIT");
	}
	public static void main(String[] args) {
		AxisBank get=new AxisBank();
		get.savings();
		get.fixed();
		get.deposit();
	}

}
