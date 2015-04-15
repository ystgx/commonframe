package com.web.commonframe.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.web.commonframe.common.entity.BaseEntity;


/**
 * 
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 7, 2015 11:25:01 AM 
 * <p>@version:  V1.0
 */


@Entity
@Table(name = "sys_role")
public class Role extends BaseEntity<Long> implements Serializable {

	private static final long serialVersionUID = 1677257617687342581L;

	private String name;
	private String role;
	private String description;

	@Column(name = "is_show")
	private Boolean isShow;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

}
