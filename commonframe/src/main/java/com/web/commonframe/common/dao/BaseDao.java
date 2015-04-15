package com.web.commonframe.common.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



/**
 * <p>抽象DAO层基类 提供一些简便方法<br/>
 * <p>泛型 ： M 表示实体类型；ID表示主键类型
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 7, 2015 4:18:10 PM 
 * <p>@version:  V1.0
 */

public interface BaseDao<M,ID extends Serializable> {
	
	/**
	 * 根据主键删除
	 * @param id
	 */
	void delete(ID id);
	
	/**
	 * 创建新实体
	 * @param m
	 * @return
	 */
	M create(M m);
	
	/**
	 * 修改实体
	 * @param m
	 * @return
	 */
	M update(M m);
	
	/**
	 * 根据id查找实体
	 * @param id
	 * @return
	 */
	M findById(ID id);
	
	/**
	 * 查找所有实体
	 * @return
	 */
	List<M> findAll();
	
	
	 /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    Page<M> findAll(Pageable pageable);

    /**
     * 根据条件查询所有
     * 条件 + 分页 + 排序
     *
     * @param searchable
     * @return
     */
    
	
}
