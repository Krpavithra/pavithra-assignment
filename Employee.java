package week2.day4;
public class Employee {
	public void printEmployeeName(String empName,int empId) {
		System.out.println("EmployeeName-"+empName);
		System.out.println("EmpId-"+empId);
	}
	public void  getEmpAdress(String empAdress) {
		System.out.println("Emp Adress-"+empAdress);
	}
	public void printEmpSalary(double empSalary) {
		System.out.println("Emp salary-"+empSalary);
	}
	public void empMobileNumber(long MobNum) {	
		System.out.println("Emp Mobile Number-"+MobNum);
	}

	
public static void main(String[] args) {
	Employee employ=new Employee();
	employ.printEmployeeName("pavi",98765);
	employ.getEmpAdress("chennnai");
	employ.printEmpSalary(987654.87655);
	employ.empMobileNumber(9876543210l);
	
}

}
