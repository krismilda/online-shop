package Shop.domainSimpleFacebookUser;

import Shop.domainSimpleUserAPI.SimpleUser;

public class SimpleFacebookUser extends SimpleUser
{
	public SimpleFacebookUser(String name, String email, String address, String surname){
		super(name, email, address, surname);
	}
	
	public String getType() {
		return "Facebook";
	}

	public void sendNotification() {
		System.out.println("Sending message to the user...");
	}
}