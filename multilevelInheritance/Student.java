package multilevelInheritance;

public class Student extends Department {
     public void studentNmae(String name) {
    	 System.out.println("Student Name:"+name);
     }
     public void studentDept(String dept) {
    	 System.out.println("Student Department:"+dept);
     }
     public void studentId(String id) {
    	 System.out.println("Student ID:"+id);
     }
     public static void main(String[] args) {
		Student details=new Student();
		details.departName("BCA");
		details.studentNmae("DHARUN");
		details.studentDept("BCA");
		details.studentId("19048");
	}
}
