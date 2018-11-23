package Shop.domainComputerAPI;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

import Shop.domainProductAPI.IProduct;

public abstract class IComputer  implements Serializable, IProduct
{
	private String name;
	private double primeCost;
	private int id;
	
	public IComputer(String name, double primeCost) {
		this.name=name;
		this.primeCost=primeCost;
		Random r=new Random();
		this.id=r.nextInt(1000000);
	}

	public String getName() {
		return this.name;
	}
	public int getID() {
		return id;
	}
	public String getType() {
		return "Computer";
	}
	public double getPrimeCost() {
		return this.primeCost;
	}
	public abstract double getMarkupPricePrecentage();
	public abstract String getCountry();
}
