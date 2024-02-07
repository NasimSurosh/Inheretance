package third_Assignment;

public class Manager extends Employee {

	double baseSalary;
	double bonus;

	public Manager(double baseSalary, double bonus) {
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	@Override
	public void calculateSalary() {
		System.out.println("total salary of manager is = " + (baseSalary + bonus));
	}
	@Override
	public void display() {
		super.display();
		System.out.println("the base salary is: " + baseSalary + "\u20ac , and bonus is: "+ bonus+ "\u20ac");
	}
	
}
