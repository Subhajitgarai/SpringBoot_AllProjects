package com.springsecurity.main.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springsecurity.main.entity.User;

@Service
public class UserServiceImpl {
	List<User> ulist=new ArrayList<>();
	
	public UserServiceImpl() {
		ulist.add(new User("Subhajit","Subhajit@123","Subhajit@gamil.com"));
		ulist.add(new User("Sayan","Sayan@123","Sayan@gamil.com"));
	}
	//Get all users
	public List<User> getAllUser() {
		return this.ulist;
	}
	//Get Single User
	public User getSingleUser(String uName) {
		int f=0;
		User user=new User();
		Iterator<User> itr=ulist.iterator();
		while(itr.hasNext()){
			user=itr.next();
			if(user.getUserName().equals(uName)) {
				f=1;
				break;
				
			}
			
		}
		if(f==1) {
			return user;
		}
		else {
			return null;
		}
	}
	// Add User
	public User addUser(User user) {
		this.ulist.add(user);
		return user;
	}

}
