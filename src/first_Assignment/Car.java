package first_Assignment;

public class Car extends Vehicle{
	int doors;

	public  Car(int doors) {
		this.doors = doors;
	}
	

	@Override
	public void display() {
		super.display();
		System.out.println("has " + doors + " doors");
	}
	

}
