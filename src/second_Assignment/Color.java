package second_Assignment;

public class Color extends Animal{
	String color;
	
	public Color(String color) {
		this.color = color;
	}
@Override
	public void makeSound() {
		System.out.println("Mammal sound");
		
	}
	
	public void display() {
		System.out.println("a bout bird ");
		super.display();
		System.out.println("The bitd has "+ color + " color");
	}


}
