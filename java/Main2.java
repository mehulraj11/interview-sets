import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Collections;

class Student
{
	String name;
	int marks;
	int id;
	
	Student(String name, int marks, int id)
	{
		this.name = name;
		this.marks= marks;
		this.id = id;
	}
	@Override
	public String toString()
	{
		return id + "->" +name + "(" + marks+ ")";
	}
}
public class Main2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(3,4,5,6));
		ArrayList<Integer> merged = new ArrayList<>();
		ArrayList<String> als = new ArrayList<>(Arrays.asList("Mehul", "Rahul","Sanni"));
		ArrayList<String> als1 = new ArrayList<>(Arrays.asList("Mehul","Rahul", "Sanni","Abid","Mohit"));
		ArrayList<Student> s = new ArrayList<>();

		s.add(new Student("mehul", 80, 1));
		s.add(new Student("rahul", 24, 2));
		
		System.out.println(al);

		Iterator<Integer> it = al.iterator();
		Iterator<Integer> it3 = al2.iterator();
		Iterator<String> it1 = als.iterator();
		Iterator<String> it2 = als1.iterator();
		Iterator<Student> stu = s.iterator();
		while(stu.hasNext())
		{	
			Integer marks = stu.next().marks;
			if(marks < 40)
			{
				stu.remove();
			}
		}
		System.out.println(s);
		ListIterator<Integer> l1 = al.listIterator();

		while(l1.hasNext())
		{
			Integer val = l1.next();
			
			l1.set(val + 1000);
		}
		while(it.hasNext())
		{
			Integer val1 = it.next();

			if(!merged.contains(val1))
			{
				merged.add(val1);
			}
		}
		while(it3.hasNext())
		{
			Integer val = it3.next();
			
			if(!merged.contains(val))
			{
				merged.add(val);
			}
		}
		System.out.println(merged);
		while(it1.hasNext())
		{
		
			if(it1.next().equals(it2.next()))
			{
				it2.remove();
			}
		}
		
		System.out.println(als);
		System.out.println(als1);
		while(it.hasNext())
		{
			Integer val = (Integer) it.next();
			if(val % 2 == 0)
			{
				System.out.println(val);
			}
			else
			{
				it.remove();
			}
		}
		System.out.println(al);
	}
}