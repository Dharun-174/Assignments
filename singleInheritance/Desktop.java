package singleInheritance;

public class Desktop extends Computer{
    public void desktopSize(String inc) {
    	System.out.println("SIZE:"+inc);
    }
    public void desktopSize(int windows) {
    	System.out.println("WINDOWS:"+windows);
    }
    public static void main(String[] args) {
		Desktop get=new Desktop();
		get.computerModel(707);
		get.computerModel("ASUS");
		get.desktopSize("14inc");
		get.desktopSize(11);
		
	}
}
