package com.web.commonframe.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.web.commonframe.common.entity.BaseEntity;

/**
 * 
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 7, 2015 11:26:00 AM 
 * <p>@version:  V1.0
 */

@Entity
@Table(name = "sys_resourses")
public class Resourses extends BaseEntity<Long> implements Serializable{
	
	private static final long serialVersionUID = -7630566986922885779L;
	
	private String name;
	private String identity;
	private String url;
	
	@Column(name = "parent_id")
	private String parentId;
	
	@Column(name = "parent_ids")
	private String parentIds;
	
	private String icon;
	
	private Integer weight;
	
	@Column(name = "is_show")
	private Boolean isShow;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentIds() {
		return parentIds;
	}
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Boolean getIsShow() {
		return isShow;
	}
	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}
	
}
