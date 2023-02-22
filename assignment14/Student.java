package assignment14;

public class Student {
	public void getStudentInfo(String idandname) {
		System.out.println("Nmae & ID:"+idandname);
	}
	public void getStudentinfo(String emailandphnop) {
        System.out.println("E-mail & Phone Number:"+emailandphnop);
}
	 public static void main(String[] args) {
		Student info=new Student();
		info.getStudentInfo("DHARUN,048");
		info.getStudentinfo("xyz@gmail.com,900007890");
	}
}