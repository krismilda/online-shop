package Shop.repositoryProductFileImplementation;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Shop.domainProductAPI.IProduct;
import Shop.repositoryProductAPI.IProductRepository;

public class ProductRepositoryFileImplementation implements IProductRepository
{
	public IProduct getProductByID(int id) throws ClassNotFoundException, IOException {  
		List<IProduct> products=getAllProducts();
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getID()==id) {
				return products.get(i);
			}
		}
		return null;
	}

	public List<IProduct> getAllProducts() throws IOException, ClassNotFoundException {
		
	List<IProduct> products=new ArrayList<IProduct>();
		 FileInputStream fileIn = new FileInputStream("C:\\Users\\Milda\\eclipse-workspace2\\configurations\\products.bin");
         ObjectInputStream in = new ObjectInputStream(fileIn);
	    while (true) {
			    try {
			      IProduct obj = (IProduct) in.readObject();
			      products.add(obj);
			    } 
			    catch (EOFException e) {
			      break;
			    }
	    }
		return products;
	}

	public void saveProduct(IProduct product) throws IOException, ClassNotFoundException {
    List<IProduct> allProducts=getAllProducts();
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Milda\\eclipse-workspace2\\configurations\\products.bin");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for(int i=0; i<allProducts.size(); i++) {
    	oos.writeObject(allProducts.get(i));
    }
    oos.writeObject(product);
    oos.close();		
	}

}
