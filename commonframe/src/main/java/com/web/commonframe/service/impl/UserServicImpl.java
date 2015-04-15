package com.web.commonframe.service.impl;



import org.springframework.stereotype.Service;

import com.web.commonframe.common.service.BaseService;
import com.web.commonframe.dao.UserDao;
import com.web.commonframe.entity.User;
import com.web.commonframe.service.UserService;

@Service
public class UserServicImpl extends BaseService<User,Long> implements UserService {
	
	
	private UserDao getUserDao(){
		return (UserDao) super.baseDao;
	};
	
	@Override
	public User createUser(User user) {
		return getUserDao().create(user);
	}

}
