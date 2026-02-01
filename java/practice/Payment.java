interface PaymentMode
{
	void pay();	
	void refund();
}
class UPIPayment implements PaymentMode
{
	@Override
	public void pay()
	{
		System.out.println("upi pay");
	}

	@Override
	public void refund()
	{
		System.out.println("upi refund");
	}
}
class CardPayment implements PaymentMode
{
	@Override
	public void pay()
	{
		System.out.println("card pay");
	}
	@Override
	public void refund()
	{
		System.out.println("card refund");
	}
}
public class Payment
{
	public static void main(String[] args)
	{	
		UPIPayment u = new UPIPayment();
		u.pay();
		u.refund();

		CardPayment c = new CardPayment();
		c.pay();
		c.refund();		
	}
}