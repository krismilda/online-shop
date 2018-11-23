package Shop.userFactoryAPI;

import Shop.domainUserAPI.User;

public interface IUserFactory
{
	public User createSimpleUser(String name, String email, String address, String surname);
	public User createPremiumUser(String name, String email, String address, String surname);
}
