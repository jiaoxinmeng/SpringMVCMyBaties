package com.xhay1122.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xhay1122.dao.user.UserDao;
import com.xhay1122.entity.user.User;

@Service
public class UserService implements IUserService {
	@Resource(name="userDao")
	UserDao dao;

	public boolean loginCheck(User user) {
		// TODO Auto-generated method stub
		User result = dao.selectUserByNameAndPassword(user);
		if(null!=result&&0!=result.getUserId()){
			return true;
		}
		return false;
	}
	
	
}
