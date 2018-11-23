package Shop.domainServiceProductAPI;

import java.io.IOException;
import java.util.List;

import Shop.domainProductAPI.IProduct;


public interface ProductServiceAPI {
	
	public double getTotalPrice(IProduct product);
}
