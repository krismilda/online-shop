package Shop.productFactoryAPI;

import Shop.domainProductAPI.IProduct;


public interface IProductFactory
{
	public IProduct createTV(double primeCost, String name);
	public IProduct createComputer (double primeCost, String name);
}
