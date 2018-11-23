package Shop.facadeServicesProductImplementation;

import java.io.IOException;
import java.util.List;

import Shop.domainProductAPI.IProduct;
import Shop.domainServiceProductAPI.ProductServiceAPI;
import Shop.facadeServicesProductAPI.IProductService;
import Shop.productFactoryAPI.IProductFactory;
import Shop.repositoryProductAPI.IProductRepository;

public class ProductService implements IProductService {
	private ProductServiceAPI productServiceApi;
	private IProductRepository productRepository;
	private IProductFactory productFactory;

	public ProductService(ProductServiceAPI productServiceApi, IProductRepository productRepository,
			IProductFactory productFactory) {
		this.productServiceApi = productServiceApi;
		this.productRepository = productRepository;
		this.productFactory = productFactory;
	}

	public IProduct getProductByID(int id) throws ClassNotFoundException, IOException {
		return productRepository.getProductByID(id);
	}

	public List<IProduct> getAllProducts() throws ClassNotFoundException, IOException {
		return productRepository.getAllProducts();
	}

	public void createProduct(double primeCost, String name, String type) throws IOException, ClassNotFoundException {
		IProduct product = null;
		switch (type) {
		case "TV":
			product=productFactory.createTV(primeCost, name);
			break;
		case "Computer":
			product=productFactory.createComputer(primeCost, name);
			break;
		}
		System.out.println("res");
		System.out.println(product.getID());
		productRepository.saveProduct(product);
	}
}
