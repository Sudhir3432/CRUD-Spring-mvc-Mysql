package cruduserapp.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import cruduserapp.model.User;

@Component
public class Userdao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void SaveUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
   public List<User> getUsers() {
		
	 List<User> users= this.hibernateTemplate.loadAll(User.class);
   return users;
   }
   
   public User getUser(int pid) {
		return this.hibernateTemplate.get(User.class,pid);
	}

   @Transactional
   public void deleteUser(int pid) {
	 User p=  this.hibernateTemplate.load(User.class,pid);
	   this.hibernateTemplate.delete(p);
   }
	
}
