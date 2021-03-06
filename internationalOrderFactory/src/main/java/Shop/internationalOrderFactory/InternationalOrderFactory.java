package Shop.internationalOrderFactory;

import Shop.OrderFactoryAPI.IOrderFactory;
import Shop.domainInternationalOrder.InternationalOrder;
import Shop.domainOrderAPI.Order;

public class InternationalOrderFactory implements IOrderFactory
{

	public Order createOrder(int userId, int productID) {
		return new InternationalOrder(userId, productID);
	}

}
