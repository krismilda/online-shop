package Shop.domainTVFromChina;

import Shop.domainTVAPI.ITV;

public class TVFromChina extends ITV
{
	public TVFromChina(String name, double primeCost) {
		super(name, primeCost);
	}

	@Override
	public double getMarkupPricePrecentage() {
		return 1.5;
	}

	@Override
	public String getCountry() {
		return "China";
	}
}
