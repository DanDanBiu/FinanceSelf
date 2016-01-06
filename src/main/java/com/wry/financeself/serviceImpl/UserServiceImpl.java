package com.wry.financeself.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wry.financeself.dao.UserDao;
import com.wry.financeself.entity.User;
import com.wry.financeself.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
		
	}

}
