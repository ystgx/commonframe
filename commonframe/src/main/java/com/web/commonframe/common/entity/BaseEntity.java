package com.web.commonframe.common.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/**
 * <p> 抽象实体基类，提供统一的ID和相关的基本功能方法
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 7, 2015 4:04:14 PM 
 * <p>@version:  V1.0
 */
@MappedSuperclass
public class BaseEntity<ID extends Serializable> extends AbstractEntity<ID>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;
	

	@Override
	public ID getId() {
		
		return this.id;
	}

	@Override
	public void setId(ID id) {
		this.id = id;
	}
	
}
