package Shop.integrationServicesDeliveryPostOffice;

import Shop.integrationServicesDeliveryAPI.IDeliveryService;

public class PostOffice implements IDeliveryService
{
	public String deliver(String address, String productName) {
		return productName+" bus pristatytas į artimiausią " +address+" pašto skyrių";
	}
}
