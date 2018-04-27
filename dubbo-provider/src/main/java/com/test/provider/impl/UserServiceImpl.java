package com.test.provider.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.api.entity.UserInfo;
import com.test.api.service.IUserService;
import com.test.provider.dao.IUserDao;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	@Override
	public List<UserInfo> findUser() {
//		List<UserInfo> listUser = new ArrayList<UserInfo>();  
//		UserInfo user1 = new UserInfo();  
//		user1.setName("张三");
//		user1.setAge("21");
//		UserInfo user2 = new UserInfo();  
//		user2.setName("李四");
//		user2.setAge("24");
//        listUser.add(user1);  
//        listUser.add(user2);  
//        
//        return listUser; 
		return userDao.findUser();
	}

}
