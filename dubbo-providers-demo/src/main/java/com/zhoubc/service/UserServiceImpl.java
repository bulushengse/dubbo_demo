package com.zhoubc.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService{

	public String sayHello(String name) {
		String tmp = "Hello "+name;
		return tmp;
	}
}
