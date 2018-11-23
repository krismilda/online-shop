package Shop.domainComputerFromChina;

import Shop.domainComputerAPI.IComputer;

public class ComputerFromChina extends IComputer
{

	public ComputerFromChina(String name, double primeCost) {
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
