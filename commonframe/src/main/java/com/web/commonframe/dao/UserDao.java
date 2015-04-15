package com.web.commonframe.dao;

import java.util.List;

import com.web.commonframe.common.dao.BaseDao;
import com.web.commonframe.entity.User;

/**
 * 
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 5, 2015 9:43:27 AM 
 * <p>@version:  V1.0
 */
public interface UserDao extends BaseDao<User,Long>{
	
	User findByUsername(String username);
}
