package com.xhay1122.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhay1122.entity.user.User;

public interface UserDao {
	//新增用户
	public int insertUser(User user);
	//根据用户名和密码查询用户
	public User selectUserByNameAndPassword(User user);
	//查询所有的用户
	public List<User> selectAllUsers();
}