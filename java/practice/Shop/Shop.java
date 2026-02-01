package Shop;

public class Shop
{
	public static void main(String[] args)
	{
	        Cart cart = new Cart();
        	cart.addProduct(1, "Pen", 10);
        	cart.addProduct(2, "Notebook", 50);
        	cart.addProduct(3, "Bag", 500);
        	cart.showCart();
        	System.out.println("Total Amount: " + cart.totalAmount());
	        cart.removeProduct(2);
	        cart.showCart();
	        System.out.println("Total After Removing: " + cart.totalAmount());
	}
}