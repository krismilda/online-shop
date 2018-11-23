package Shop.facebookUserFactory;

import Shop.domainPremiumFacebookUser.PremiumFacebookUser;
import Shop.domainSimpleFacebookUser.SimpleFacebookUser;
import Shop.domainUserAPI.User;
import Shop.userFactoryAPI.IUserFactory;

public class FacebookUserFactory implements IUserFactory 
{

	public User createSimpleUser(String name, String email, String address, String surname) {
		return new SimpleFacebookUser(name, email, address, surname);
	}

	public User createPremiumUser(String name, String email, String address, String surname) {
		return new PremiumFacebookUser(name, email, address, surname);
	}
}
