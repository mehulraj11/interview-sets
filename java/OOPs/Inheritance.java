class GrandFather
{
	String name;
	int age;
	
	void setGrandFather(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void getGrandFather()
	{
		System.out.println("GrandFather Name is : "+ name + " and his age is : "+age);
	}	
}
class Father extends GrandFather
{
	String name;
	int age;

	void setFather(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	void getFather()
	{
		System.out.println("Father Name is : "+ super.name + " and his age is : "+super.age);
	}
}
//Multilevel INHERITANCE

class vehicle
{
	void print()
	{
		System.out.println("This is vehicle class");
	}
}
class fourWheel extends vehicle
{
	void print()
	{
		super.print();
		System.out.println("This is fourwheel class");
	}
}
class car extends fourWheel
{
	void print()
	{	
		// print();
		super.print();
		System.out.println("This is car class");	
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
		// Father f = new Father();
		// f.setGrandFather("C.P. Sinha", 95);
		// f.setFather("Pramod Kumar", 59);
		// f.getFather();
		car c = new car();
		c.print();
		
	}
}