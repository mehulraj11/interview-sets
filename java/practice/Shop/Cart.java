package Shop;
import java.util.ArrayList;
public class Cart
{
	ArrayList <Product> products = new ArrayList<>();

	public void addProduct(int id, String name, double price)
	{
		Product p = new Product(id, name, price);
		products.add(p);
	}

	public void removeProduct(int id)
	{
		products.removeIf(p -> p.id == id);
	}

	public double totalAmount()
	{
		int sum = 0;
		for(Product p : products)
		{
			sum += p.price;
		}
		return sum;
	}

	public void showCart()
	{
		for(Product p : products)
		{
			p.display();
		}
	}
}