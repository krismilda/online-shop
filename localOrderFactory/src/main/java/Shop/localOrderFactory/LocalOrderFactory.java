package Shop.localOrderFactory;

import Shop.OrderFactoryAPI.IOrderFactory;
import Shop.domainLocalOrder.LocalOrder;
import Shop.domainOrderAPI.Order;

public class LocalOrderFactory implements IOrderFactory
{
	public Order createOrder(int userId, int productID) {
		return new LocalOrder (userId, productID);
	}

}