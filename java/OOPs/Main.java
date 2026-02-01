abstract class Helper
{
	static void demo()
	{
		System.out.println("Demoo");
	}
	abstract void demo2();
}
class Example extends Helper
{
	void demo2()
	{
		System.out.println("Demoo2");
		demo();	
	}	
}
public class Main
{
	public static void main(String[] args)
	{
		// Helper.demo();
		Example e = new Example();
		e.demo2();
	}
}