package fr.lamaud.controller;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.lamaud.pojo.User;
import fr.lamaud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public User createPlace(@RequestBody User user) {
	   return this.userService.createUser(user);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<User> getAllUser(){
		return this.userService.getAllUser();
	}
	
}
