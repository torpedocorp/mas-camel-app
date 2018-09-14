package kr.co.bizframe.camel.rest.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	public void createUser(User user){
		System.out.println("call createUser");
		System.out.println("create user =" + user.toString());
		System.out.println("create user id =" + user.getId());
		System.out.println("create user name =" + user.getName());
	}
			
			
	public User getUser(int id){
		
		System.out.println("call UserService:getUser");
		User user = new User();
		user.setId(id);
		user.setName("test name");
		return user;
	}
	
	
	public List<User> getUserList(){
		
		System.out.println("call UserService:getUserList");
		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("1 test name");
		users.add(user1);
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("2 test name");
		
		users.add(user2);
		return users;
		
	}
}
