package Shop.noDiscount_Implementation;

import Shop.discountAPI.IDiscount;

public class NoDiscount implements IDiscount
{
	public double calculateDiscount(double price) {
		return 0;
	}

}
