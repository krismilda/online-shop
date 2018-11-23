package Shop.domainPremiumFacebookUser;

import Shop.domainPremiumUserAPI.PremiumUser;

public class PremiumFacebookUser extends PremiumUser
{
	
	public PremiumFacebookUser(String name, String email, String address, String surname){
		super(name, email, address, surname);
	}
	
	public String getType() {
		return "Facebook";
	}

	public void sendNotification() {
		System.out.println("Sending message to the user...");
	}
}
