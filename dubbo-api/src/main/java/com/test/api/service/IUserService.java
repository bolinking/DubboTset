package com.test.api.service;

import java.util.List;

import com.test.api.entity.UserInfo;

public interface IUserService {

	List<UserInfo> findUser();
}
