package Shop.OrderFactoryAPI;

import Shop.domainOrderAPI.Order;

public interface IOrderFactory {

	public Order createOrder (int userId, int productID);
}
