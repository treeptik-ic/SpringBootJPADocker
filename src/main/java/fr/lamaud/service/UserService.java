package fr.lamaud.service;

import java.util.Collection;

import fr.lamaud.pojo.User;

public interface UserService {

	
	User createUser(User user);
	Collection<User> getAllUser();
}
