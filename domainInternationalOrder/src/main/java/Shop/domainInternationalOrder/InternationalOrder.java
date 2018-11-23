package Shop.domainInternationalOrder;

import Shop.domainOrderAPI.Order;

public class InternationalOrder extends Order {
	
	public InternationalOrder (int userID, int productID) {
			super(userID, productID);
			this.deliveryPrice=7.5;
		}

	@Override
	public double getDeliveryPrice() {
		return this.deliveryPrice;
	}

	@Override
	public String getOrderType() {
		return "International";
	}

}
