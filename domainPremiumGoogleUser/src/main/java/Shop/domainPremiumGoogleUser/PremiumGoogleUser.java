package Shop.domainPremiumGoogleUser;

import Shop.domainPremiumUserAPI.PremiumUser;

public class PremiumGoogleUser extends PremiumUser
{

	public PremiumGoogleUser(String name, String email, String address, String surname){
		super(name, email, address, surname);
	}
	
	public String getType() {
		return "Google";
	}

	public void sendNotification() {
		System.out.println("Sending email to the user...");
	}
}
