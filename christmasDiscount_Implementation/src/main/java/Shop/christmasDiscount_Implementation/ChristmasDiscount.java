package Shop.christmasDiscount_Implementation;

import Shop.discountAPI.IDiscount;

public class ChristmasDiscount implements IDiscount
{
	public double calculateDiscount(double price) {
		return 0.3*price;
	}

	
}
