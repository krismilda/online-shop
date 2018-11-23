package Shop.facadeServicesTotalPriceAPI;

import java.io.IOException;

public interface ITotalPriceFacadeService {
	public double getTotalPrice(int id) throws ClassNotFoundException, IOException;
}
