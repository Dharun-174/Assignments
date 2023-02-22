package multilevelInheritance;

public class Department extends College {
	public void departName(String name) {
		System.out.println("Department Name:"+name);
	}
	public static void main(String[] args) {
		Department get=new Department();
		get.collegeName("KSR");
		get.collegeCode(17);
		get.collegeRank(47);
        get.departName("BCA");
	}

}
