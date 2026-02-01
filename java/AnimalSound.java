abstract class Animal
{
	public abstract void sound();
}
class Lion extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Roar");	
	}
}
class Tiger extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Meoowww");
	}
}
public class AnimalSound
{
	public static void main(String[] args)
	{
		Lion l = new Lion();
		l.sound();
		Animal[] animals = {new Lion(), new Tiger()};
		for(Animal a : animals)
		{
			a.sound();
		}
	}
}