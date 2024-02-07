package first_Assignment;

public class Bicycle extends Vehicle{
	int wheels;
	public Bicycle(int wheels) {
		this.wheels = wheels; 
	}
	@Override
	public void display() {
		super.display();
		System.out.println("has " + wheels +" wheels");
	}
}
