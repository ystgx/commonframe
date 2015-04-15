package com.web.commonframe.common.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.commonframe.common.dao.BaseDao;
import com.web.commonframe.common.entity.AbstractEntity;

/**
 * <p>抽象service层基类 提供一些简便方法
 * <p/>
 * <p>泛型 ： M 表示实体类型；ID表示主键类型
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 7, 2015 3:34:21 PM 
 * <p>@version:  V1.0
 */
public abstract class BaseService<M extends AbstractEntity<?>,ID extends Serializable> {
	
	protected BaseDao<M,ID> baseDao;
	

	@Autowired
	public void setBaseDao(BaseDao<M, ID> baseDao) {
		this.baseDao = baseDao;
	 }
	
	public BaseDao<M, ID> getBaseDao() {
		return baseDao;
	}

	public M create(M m){
		return baseDao.create(m);
	}
	
	
	public void delete(ID id){
		baseDao.delete(id);
	}
	
	public M update(M m){
		return baseDao.update(m);
	}
	
	
	public M findByID(ID id){
		return baseDao.findById(id);
	}
	
	public List<M> findAll(){
		return baseDao.findAll();
	}
}
