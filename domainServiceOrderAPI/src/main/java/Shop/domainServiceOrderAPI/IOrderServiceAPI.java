package Shop.domainServiceOrderAPI;

import java.io.IOException;
import java.util.List;

import Shop.domainOrderAPI.Order;

public interface IOrderServiceAPI {
	public void setDeliveryPayment(Order order, String delivery, String payment) throws ClassNotFoundException, IOException;
}
