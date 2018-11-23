package Shop.domainOrderAPI;

import java.io.Serializable;
import java.util.Random;

public abstract class Order implements Serializable
{

	private int userID;
	private int productID;
	private String deliveryDetails;
	private String paymentDetails;
	protected double deliveryPrice;
	private int id;
	
	public Order (int userID, int productID) {
		this.userID=userID;
		this.productID=productID;
		Random r=new Random();
		this.id=r.nextInt(1000000);
	}
	public int getID() {
		return id;
	}
	public int getUserID() {
		return userID;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public void setDeliveryDetails(String deliveryDetails) {
		this.deliveryDetails=deliveryDetails;
	}
	public String getDeliveryDetails () {
		return this.deliveryDetails;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails=paymentDetails;
	}
	
	public abstract double getDeliveryPrice();
	public abstract String getOrderType();
}
