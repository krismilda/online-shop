package Shop.facadeServicesUserAPI;

import java.io.IOException;
import java.util.List;

import Shop.domainUserAPI.User;

public interface IUserService {
	public User GetUserByID(int id) throws ClassNotFoundException, IOException;
	public List<User> GetAllUsers() throws ClassNotFoundException, IOException;
	public String CreateUser(String name, String email, String address, String surname,boolean isPremium) throws IOException, ClassNotFoundException;
}
