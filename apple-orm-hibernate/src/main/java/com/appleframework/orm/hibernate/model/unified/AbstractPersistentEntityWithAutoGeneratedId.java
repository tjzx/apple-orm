/*
 * AbstractPersistentEntityWithAutoGeneratedId.java
 *
 * 深圳广联赛讯有限公司
 *
 * Copyright (C) 2012 WONDERSHARE.COM
 *
 * All Right reserved
 * http://www.glsx.com.cn
 */
package com.appleframework.orm.hibernate.model.unified;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.appleframework.orm.hibernate.common.annotation.Field;

/**
 * abstract parent for all domain classes defined in jvmcluster module. This
 * class contains auto-generated id property.
 * <p/>
 * Clients should use this class instead of inheritance from BO.
 * 
 * @author Cruise.Xu
 * @date: 2011-9-8
 * 
 */
@MappedSuperclass
//@Access(AccessType.FIELD)
public abstract class AbstractPersistentEntityWithAutoGeneratedId extends BO {
	
	private static final long serialVersionUID = -3361584099418414999L;

	private Long id;

	@Field(isId = true)
	@Id
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
}
