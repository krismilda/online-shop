package Shop.integrationServicesSiauliuBankas;

import Shop.integrationServicesBankAPI.IBankService;

public class SiauliuBankas implements IBankService
{
	public boolean pay() {
		return true;
	}
	public String getPaymentDetails(int productID) {
		return "Gautas apmokėjimas iš Siauliu banko už prekę ID:"+productID;
	}

}