package first_Assignment;

public class Main {

	public static void main(String[] args) {

		Car car = new Car(4);
		Bicycle bicycle = new Bicycle(2);
		car.setBrand("BMW");
		car.setModel("Alpha");
		car.setYear(2019);
		car.display();
		
		

		
	
		bicycle.setBrand("Honda");
		bicycle.setModel("Yaki");
		bicycle.setYear(2020);
		bicycle.display();
	}

}
