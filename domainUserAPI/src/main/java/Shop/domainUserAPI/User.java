package Shop.domainUserAPI;

import java.io.Serializable;
import java.util.Random;

public abstract class User implements Serializable
{
	
	private String name;
	private String email;
	private String address;
	private String surname;
	private int id;
	
	public User (String name, String email, String address, String surname){
		this.name=name;
		this.email=email;
		this.address=address;
		this.surname=surname;
		Random r=new Random();
		this.id=r.nextInt(1000000);
	}
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String gGetSurname() {
		return surname;
	}

	public int getID() {
		return id;
	}
	
	public abstract boolean checkIsPremium();	
	public abstract String getType();
	public abstract void sendNotification();
	
	
}
