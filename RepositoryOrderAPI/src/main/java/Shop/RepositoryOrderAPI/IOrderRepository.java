package Shop.RepositoryOrderAPI;


import java.io.IOException;
import java.util.List;

import Shop.domainOrderAPI.Order;

public interface IOrderRepository {
	public Order getOrderByID(int id) throws ClassNotFoundException, IOException;
	public List<Order> getAllOrders() throws ClassNotFoundException, IOException;
	public Order saveOrder(Order order)throws ClassNotFoundException, IOException ;
	public void updateOrder (Order order) throws ClassNotFoundException, IOException;
}
