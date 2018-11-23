package Shop.facadeServicesLithuanianDeliveryService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Shop.facadeServicesDeliveryAPI.IDeliveryServiceAPI;
import Shop.integrationServicesDeliveryAPI.IDeliveryService;

public class LithuanianDeliveryService implements IDeliveryServiceAPI
{
	private IDeliveryService deliveryCompany;
	
	public LithuanianDeliveryService (IDeliveryService deliveryCompany) {
		this.deliveryCompany=deliveryCompany;
	}
	
	public String getDeliveryDate() {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        Date currentDate = new Date();
	        Calendar c = Calendar.getInstance();
	        c.setTime(currentDate);
	        c.add(Calendar.DATE, 3);
	        Date currentDatePlusOne = c.getTime();
	        return dateFormat.format(currentDatePlusOne);
	}

	
	public String deliveryDetails(String address, String productName) {
		String delivery=deliveryCompany.deliver(address, productName);
		return delivery+this.getDeliveryDate();
	}
}
