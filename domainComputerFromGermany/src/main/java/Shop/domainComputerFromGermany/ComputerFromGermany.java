package Shop.domainComputerFromGermany;

import Shop.domainComputerAPI.IComputer;

public class ComputerFromGermany extends IComputer
{
	public ComputerFromGermany(String name, double primeCost) {
		super(name, primeCost);
	}

	@Override
	public double getMarkupPricePrecentage() {
		return 2.5;
	}

	@Override
	public String getCountry() {
		return "Germany";
	}
}
