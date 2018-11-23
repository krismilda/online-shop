package Shop.integrationServicesBankAPI;

public interface IBankService {
	
	public boolean pay();
	public String getPaymentDetails(int productID);
	
}
