class Dog
{
	String name;

	//Dog(String name)
	//{
	//	this.name = name;
	//}

	String getDog()
	{
		return name;
	}
	
	void setDog(String name)
	{
		this.name = name;	
	}
}
class Cat
{
	Dog d;
	d.setDog("A");
	// String d1Name = d1.getDog();
	// System.out.println(d1Name);
}
public class Encapsulation
{
	public static void main(String[] args)
		{
			Dog d1 = new Dog();
			// d1.setDog("Abid");
			String d1Name = d1.getDog();
			System.out.println(d1Name);
		}
}
	
