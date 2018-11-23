package Shop.LithuanianPVM_Implementation;

import Shop.PVM_API.IPVM;

public class LithuanianPVM implements IPVM
{
	public double calculatePVM(double price) {
		return 0.21*price;
	}

}
