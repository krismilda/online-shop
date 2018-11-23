package Shop.integrationServicesDeliveryCourier;

import Shop.integrationServicesDeliveryAPI.IDeliveryService;

public class Courier implements IDeliveryService
{

	public String deliver(String address, String productName) {
		return productName+" bus pristatytas į namus adresu "+address;
	}

}
