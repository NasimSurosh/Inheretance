package third_Assignment;

public class Main {

	public static void main(String[] args) {

		Manager manager = new Manager(3500, 400);

		manager.SetName("Ana");
		manager.setEmployeeID(456);
		manager.display();
		manager.calculateSalary();
		
		System.out.println("======================");
		
		Developer developer = new Developer(45.6, 6.5);
		developer.SetName("Brian");
		developer.setEmployeeID(54343);
		developer.display();
		developer.calculateSalary();
	}

}
