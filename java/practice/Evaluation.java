class Marks
{
	private String name;
	private double marks;

	public void setName(String name)
	{
		this.name = name;
	}
	public void setMarks(double marks)
	{
		if(marks > 100 || marks < 0)
		{
			this.marks = 0;
			return;
		}
		this.marks = marks;
	}
	
	public String getName()
	{
		return name;		
	}
	public double getMarks()
	{
		return marks;
	}
}

public class Evaluation
{
	public static void main(String[] args)
	{
		Marks m1 = new Marks();
		m1.setName("Mehul");
		m1.setMarks(100);
		Marks m2 = new Marks();
		m2.setName("Rahul");
		m2.setMarks(101);
		System.out.println(m1.getName());
		System.out.println(m1.getMarks());
		System.out.println(m2.getName());
		System.out.println(m2.getMarks());
	}
}