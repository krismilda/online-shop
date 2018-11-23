package Shop.EstonianPVM_Implementation;

import Shop.PVM_API.IPVM;

public class EstonianPVM implements IPVM
{
	public double calculatePVM(double price) {
		return 0.09*price;
	}

}
