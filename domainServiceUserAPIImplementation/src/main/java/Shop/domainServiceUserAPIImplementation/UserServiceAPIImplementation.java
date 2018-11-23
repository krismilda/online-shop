package Shop.domainServiceUserAPIImplementation;

import Shop.domainServiceUserAPI.UserServiceAPI;
import Shop.domainUserAPI.User;

public class UserServiceAPIImplementation implements UserServiceAPI
{
	public String GetWelcomeMessage(User user) {
		String welcome = user.getName()+", sveikiname prisijungus prie sistemos";
		return welcome;
	}
}
