class Vehicle
{
	String brand;
	String model;
	
	public Vehicle(String brand, String model)
	{
		this.brand = brand;
		this.model = model;
	}
	public void displayInfo()
	{
		System.out.println(brand + "  " + model);
	}
}

class Car extends Vehicle
{
	int seats;
	
	public Car(String brand, String model, int seats)
	{
		super(brand,model);
		this.seats = seats;
	}

	@Override
	public void displayInfo()
	{
		System.out.println(brand + " " + model + " " + seats);
	}
}
class Bike extends Vehicle
{
	int cc;
	public Bike(String brand, String model, int cc)
	{
		super(brand, model);
		this.cc = cc;
	}

	@Override
	public void displayInfo()
	{
		System.out.println(brand + " " + " " + cc);
	}
}
public class Automobile
{
	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle("Honda","city");
		v1.displayInfo();
		Vehicle v2 = new Car("Maruti","dzire",4);
		v2.displayInfo();
		Car c1 = new Car("Hyundai","verna",5);
		String s = c1.brand;
		String s2 = c1.model;

	}
}