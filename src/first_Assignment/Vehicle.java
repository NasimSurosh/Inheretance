package first_Assignment;

public class Vehicle {
	String brand;
	String model;
	int year;


	public void setBrand(String brand) {
		this.brand = brand;
		
	}


	public void setModel(String model) {
		this.model = model;
		
	}

	public void setYear(int year) {
		this.year = year;
		
	}
	

	public void display() {
		System.out.println("Brand is " + brand + " the model is " + model + " and the year is " + year);
	}

}
