class Circle
{
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return radius * 2 * 3.17;	
	}
	public static void main(String[] args)
	{
		Circle c = new Circle(5.4);
		System.out.println(c.getArea());
	}
}