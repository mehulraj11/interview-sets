class Employee
{
	Long salary;
	
	public Employee(Long salary)
	{
		this.salary = salary;
	}
	public Long calculate()
	{
		return salary + 5000;
	}
}

class FullTime extends Employee
{
	public FullTime(Long salary)
	{
		super(salary);
	}
	
	@Override
	public Long calculate()
	{
		return salary + 1000;
	}
}

class PartTime extends Employee
{
	public PartTime(Long salary)
	{
		super(salary);
	}

	@Override
	public Long calculate()
	{
		return salary +3000;
	}
}

public class Office
{
	public static void main(String[] args)
	{
		FullTime f1 = new FullTime(1000L);
	}
}