package asignment3;

public class Calculator {
	
 public void add(int a,int b) {
	 int ab=a+b;
	System.out.println(ab);
 }
 public void sub(int e,int f) {
	 int ef=e-f;
	 System.out.println(ef);
 }
 public void multi(double i,double j) {
	 double ij=i*j;
	 System.out.println(ij);
 }
 public void div(float x,float y) {
	 float xy=x/y;
	 System.out.println(xy);
 }
  public static void main(String[] args) {
	Calculator calc=new Calculator();
	calc.add(25, 25);
	calc.sub(100, 50);
	calc.multi(2.555,2.555);
	calc.div(12.5f, 12.5f);
}
 
}
