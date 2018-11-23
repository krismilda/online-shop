package Shop.domainServiceOrderImplementation;

import Shop.domainOrderAPI.Order;
import Shop.domainServiceOrderAPI.IOrderServiceAPI;

public class OrderServiceImplementation implements IOrderServiceAPI
{
	public void setDeliveryPayment(Order order, String delivery, String payment){
		order.setPaymentDetails(payment);
		order.setDeliveryDetails(delivery);
	}

}
