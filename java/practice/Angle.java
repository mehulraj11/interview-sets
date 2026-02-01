class Shape
{
	public void area()
	{
		System.out.println("In shape");
	}
}
class Circle extends Shape
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public void area()
	{
		System.out.println(radius * 2 * 3.17);
	}
}
class Rectangle extends Shape
{
	double length;
	double breadth;

	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area()
	{
		System.out.println(length * breadth);
	}
}

public class Angle
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(3.5);
		c1.area();
	
		Rectangle r1 = new Rectangle(2,3);	
		r1.area();
	}
}