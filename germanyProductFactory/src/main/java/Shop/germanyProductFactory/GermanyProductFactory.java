package Shop.germanyProductFactory;

import Shop.domainComputerFromGermany.ComputerFromGermany;
import Shop.domainProductAPI.IProduct;
import Shop.domainTVFromGermany.TVFromGermany;
import Shop.productFactoryAPI.IProductFactory;


public class GermanyProductFactory implements IProductFactory
{
	public IProduct createComputer(double primeCost, String name) {
		return new ComputerFromGermany(name, primeCost);
	}

	public IProduct createTV(double primeCost, String name) {
		return new TVFromGermany(name, primeCost);
	}

}
