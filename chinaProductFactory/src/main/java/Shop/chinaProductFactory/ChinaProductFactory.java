package Shop.chinaProductFactory;

import Shop.domainComputerFromChina.ComputerFromChina;
import Shop.domainProductAPI.IProduct;
import Shop.domainTVFromChina.TVFromChina;
import Shop.productFactoryAPI.IProductFactory;

public class ChinaProductFactory implements IProductFactory
{

	public IProduct createTV(double primeCost, String name) {
		return new TVFromChina(name, primeCost);
	}

	public IProduct createComputer(double primeCost, String name) {
		return new ComputerFromChina(name, primeCost);
	}

}
