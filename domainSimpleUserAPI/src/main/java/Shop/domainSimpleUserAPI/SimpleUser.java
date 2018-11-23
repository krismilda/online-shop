package Shop.domainSimpleUserAPI;

import Shop.domainUserAPI.User;

public abstract class SimpleUser extends User
{
	public SimpleUser (String name, String email, String address, String surname){
		super (name, email, address, surname);
	}

	public boolean checkIsPremium() {
		return false;
	}
	
	public abstract String getType();
	public abstract void sendNotification();
}
