package Shop.integrationServicesSwedbank;

import Shop.integrationServicesBankAPI.IBankService;

public class Swedbank implements IBankService
{
	public boolean pay() {
		return true;
	}
	public String getPaymentDetails(int productID) {
		return "Gautas apmokėjimas iš Swedbank už prekę ID:"+productID;
	}

}
