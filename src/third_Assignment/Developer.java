package third_Assignment;

public class Developer extends Employee{

	double hourlyRate;
	double hoursWorked;
	
	public Developer(double hourlyRate, double hoursWorked) {
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public void calculateSalary() {
		System.out.println("total salary of manager is = " + (hoursWorked * hourlyRate)+ "\u20ac");
	}
	public void display() {
		super.display();
		System.out.println("hourly rate of developer is : "+ hourlyRate + "\u20ac , worked hours are "+ hoursWorked + " hours");
	}
}
