package Shop.repositoryUserAPI;

import java.io.IOException;
import java.util.List;

import Shop.domainUserAPI.User;

public interface IUserRepository {
	public User getUserByID(int id) throws ClassNotFoundException, IOException;
	public List<User> getAllUsers() throws IOException, ClassNotFoundException;
	public void saveUser(User user) throws IOException, ClassNotFoundException;
}
