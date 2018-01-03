package fr.lamaud.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.stereotype.Service;

import fr.lamaud.pojo.User;
import fr.lamaud.repo.UserRepository;
import fr.lamaud.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Collection<User> getAllUser() {
		userRepository.findAll().iterator();
		return IteratorUtils.toList(userRepository.findAll().iterator());
	}
}
