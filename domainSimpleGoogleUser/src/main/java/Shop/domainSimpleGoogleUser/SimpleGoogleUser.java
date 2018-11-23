package Shop.domainSimpleGoogleUser;

import Shop.domainSimpleUserAPI.SimpleUser;

public class SimpleGoogleUser extends SimpleUser
{
	public SimpleGoogleUser(String name, String email, String address, String surname){
		super(name, email, address, surname);
	}
	
	public String getType() {
		return "Google";
	}

	public void sendNotification() {
		System.out.println("Sending email to the user...");
	}
}
