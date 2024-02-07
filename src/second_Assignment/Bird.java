package second_Assignment;

public class Bird extends Animal{

	String featherColor;
	
	public Bird(String featherColor) {
		this.featherColor = featherColor;
	}
	@Override
	public void makeSound() {
		System.out.println("Birtd sound");
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println("The color of feather are "+ featherColor);
	}
}
