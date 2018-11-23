package Shop.repositoryProductAPI;

import java.io.IOException;
import java.util.List;

import Shop.domainProductAPI.IProduct;

public interface IProductRepository {
	public IProduct getProductByID(int id) throws ClassNotFoundException, IOException;
	public List<IProduct> getAllProducts() throws IOException, ClassNotFoundException;
	public void saveProduct(IProduct product) throws IOException, ClassNotFoundException;
}

