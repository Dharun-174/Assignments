package assignment15;

public class Automation extends MultipleLanguage implements TestTool,Language{

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Language:JAVA");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Tool:Selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Language:RUBY");
	}
	public static void main(String[] args) {
		Automation get=new Automation();
		get.java();
		get.python();
		get.ruby();
		get.Selenium();
	}

}
