package asignment3;

public class EmployeeDetails {
	public void EmployeeName(String empName) {
            
            System.out.println("1.Employee Name:"+empName);
	}
	 public void EmployeeId(int empId) {
		   System.out.println("2.Employee ID:"+empId);
	 }
	 public void EmployeeAddress(String empAdd) {
		 System.out.println("3.Employee Address:"+empAdd);
	 }
	 public void EmployeeSalary(double empSal) {
		 System.out.println("4.Employee Salary:"+empSal);
	 }
	 public void EmployeeNumber(long empNum) {
		 System.out.println("5.Employee Mobile.NO:"+empNum);
	 }
	 public static void main(String[] args) {
		 EmployeeDetails emp=new EmployeeDetails();
		  emp.EmployeeName("DHARUN");
		  emp.EmployeeId(07);
		  emp.EmployeeAddress("ERODE");
		  emp.EmployeeSalary(25000.50);
		  emp.EmployeeNumber(9442583510l);
	}

}
