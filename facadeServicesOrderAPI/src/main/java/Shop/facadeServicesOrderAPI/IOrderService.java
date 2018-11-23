package Shop.facadeServicesOrderAPI;

import java.io.IOException;
import java.util.List;

import Shop.domainOrderAPI.Order;

public interface IOrderService {
	public List<Order> GetAllOrdersByUserID(int id) throws ClassNotFoundException, IOException;
	public void CreateOrder(int userID, int productID) throws ClassNotFoundException, IOException;
	public String getDelivery (int userID, int productID) throws ClassNotFoundException, IOException;
	public String getPaymentDetails(int productID, Order order) throws ClassNotFoundException, IOException;
}
