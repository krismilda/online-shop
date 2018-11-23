package Shop.facadeServicesDeliveryAPI;

public interface IDeliveryServiceAPI {
	public String getDeliveryDate();
	public String deliveryDetails(String address, String productName);
}
