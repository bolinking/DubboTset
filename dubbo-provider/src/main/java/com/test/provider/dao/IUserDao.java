package com.test.provider.dao;

import java.util.List;

import com.test.api.entity.UserInfo;

public interface IUserDao {

	List<UserInfo> findUser();
}
