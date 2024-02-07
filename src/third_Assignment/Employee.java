package third_Assignment;

public class Employee {

	String name;
	int employeeID;
	public void SetName(String name) {
		this.name = name;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public void calculateSalary() {
		
	}
	public void display() {
		System.out.println("Employee name is : " + name + " employee ID is : " + employeeID);
	}
}
