package assignment1;

public class car {

 public void driveCar() {
	 System.out.println("1.User Drives the Car");
 }
 public void soundHorn()  {
	 System.out.println("2.User can Horn It");
 }
 public void applyBreak() {
	 System.out.println("3.User can apply Break to stop the car");
 }
 public void applyAccelerator() {
	 System.out.println("4.User can apply Accelatator to increase the speed");
 }
 public void turnonHeadlight() {
	 System.out.println("5.User can TurnOn Headlight at dark site");
 }
 public void onWiper() {
	 System.out.println("6.User can TurnOn Wiper when it rains");
 }
 public void turnonIndicator() {
	 System.out.println("7.User can TurnOn Indicator when he/she turns the car at any side");
 }
 public void seatAdjustment() {
	 System.out.println("8.User can adjust the Seat when he feels sleepy");
 }
 public void turnonAc() {
	 System.out.println("9.User can TurnON the AC");
 }
 public void openWindow() {
	 System.out.println("10.User can Open the Window");
 }
 public void adjustSidemirror() {
	 System.out.println("11.User can adjust the Side Mirror at thier wish");
 }
 public void openRooftop() {
	 System.out.println("12.User can Open the Rooftop at any time");
 }
	public static void main(String[] args) {
		car object=new car();
	 object.driveCar();
	 object.soundHorn();
	 object.applyBreak();
	 object.applyAccelerator();
	 object.turnonHeadlight();
	 object.onWiper();
	 object.turnonIndicator();
	 object.seatAdjustment();
	 object.turnonAc();
	 object.openWindow();
	 object.adjustSidemirror();
	 object.openRooftop();
	}
}
