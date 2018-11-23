package Shop.facadeServicesTotalPriceImplementation;

import java.io.IOException;

import Shop.domainProductAPI.IProduct;
import Shop.domainServiceProductAPI.ProductServiceAPI;
import Shop.facadeServicesTotalPriceAPI.ITotalPriceFacadeService;
import Shop.repositoryProductAPI.IProductRepository;

public class TotalPriceFacadeService implements ITotalPriceFacadeService
{
	private ProductServiceAPI productServiceApi;
	private IProductRepository productRepository;

	public TotalPriceFacadeService(ProductServiceAPI productServiceApi,IProductRepository productRepository) {
		this.productServiceApi=productServiceApi;
		this.productRepository=productRepository;
	}
	
	public double getTotalPrice(int id) throws ClassNotFoundException, IOException {
		IProduct product = productRepository.getProductByID(id);
		double price=productServiceApi.getTotalPrice(product);
		return price;
	}

}
