class Student
{
	private String name;
	private int age;
	private double marks;
	private static final String college = "RIT";

	public Student(String name, int age, double marks)
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
		System.out.println("Student added into memeory but will get deleted");
	}

	public void displayDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Marks : " + marks);
		System.out.println("College : " + college);
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args)
	{
		Student s1 = new Student("Mehul",22,96);
		Student s2 = new Student("Mohit",25,90);
		Student s3 = new Student("Rahul",23,85);

		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
}