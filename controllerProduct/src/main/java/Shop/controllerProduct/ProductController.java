package Shop.controllerProduct;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import Shop.facadeServicesProductAPI.IProductService;
import Shop.facadeServicesTotalPriceAPI.ITotalPriceFacadeService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@Autowired
	ITotalPriceFacadeService totalPriceService;
	
	@RequestMapping("/product/create")
	public String createProduct(@RequestParam("name") String name,
			@RequestParam("primeCost") String primeCostString,
			@RequestParam("type") String type) {
		double primeCost = Double.parseDouble(primeCostString);
		try {
			productService.createProduct(primeCost, name, type);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "createdProduct";
	}

	@RequestMapping("/products")
	public String viewAllProducts(Model model) {
		try {
			model.addAttribute("products", productService.getAllProducts());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "products";
	}

	@RequestMapping("/products/{id}")
	public String getProduct(@PathVariable("id") String id, Model model) {
		int product_id = Integer.parseInt(id);
		try {
			model.addAttribute("product", productService.getProductByID(product_id));
			model.addAttribute("price", totalPriceService.getTotalPrice(product_id ));
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "product";
	}
}
