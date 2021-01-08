package cruduserapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cruduserapp.dao.Userdao;
import cruduserapp.model.User;

@Service
public class UserService {

	
	@Autowired
	private Userdao userdao;
	
	public  List<User> getUsers() {
		
		  List<User> users= userdao.getUsers();
		 return users;
	}
	
	public void SaveUser(User user) {
	userdao.SaveUser(user);
	}
	  public void deleteUser(int pid) {
			userdao.deleteUser(pid);
		   }

	public User getUser(int id) {
		
		return userdao.getUser(id);
	}

	
	
}
