package com.web.commonframe.common.entity;

import java.io.Serializable;

/**
 * 抽象实体类
 * <p>@author:  Tianguang Xin 
 * <p>@data:  Mar 7, 2015 3:51:30 PM 
 * <p>@version:  V1.0
 */
public abstract class AbstractEntity<ID extends Serializable> {
	
	public abstract ID getId();
	
	public abstract void setId(final ID id);

	
	
	@Override
	public int hashCode() {
		 int hashCode = 17;

	        hashCode += null == getId() ? 0 : getId().hashCode() * 31;

	        return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		 if (null == obj) {
	            return false;
	        }

	        if (this == obj) {
	            return true;
	        }

	        if (!getClass().equals(obj.getClass())) {
	            return false;
	        }

	        AbstractEntity<?> that = (AbstractEntity<?>) obj;

	        return null == this.getId() ? false : this.getId().equals(that.getId());
	}
	
	
}
