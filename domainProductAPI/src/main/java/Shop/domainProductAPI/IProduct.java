package Shop.domainProductAPI;

public interface IProduct {
	public String getName();
	public int getID();
	public String getCountry();
	public String getType();
	public double getPrimeCost();
	public double getMarkupPricePrecentage();
}
