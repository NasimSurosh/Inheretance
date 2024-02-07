package second_Assignment;

public class Main {

	public static void main(String[] args) {
		
		Color color = new Color("White");
		color.setName("Tiger");
		color.setAge(1);
		color.makeSound();
		color.display();
	
		
		System.out.println("=============================");
		
		Bird bird = new Bird("green and blue");
		
		bird.setName("parrot");
		bird.setAge(2);
		bird.makeSound();
		bird.display();

	}

}
