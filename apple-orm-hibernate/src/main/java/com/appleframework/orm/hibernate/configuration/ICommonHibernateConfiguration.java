/*
 * ICommonHibernateConfiguration.java
 *
 * 深圳广联赛讯有限公司
 *
 * Copyright (C) 2012 WONDERSHARE.COM
 *
 * All Right reserved
 * http://www.glsx.com.cn
 */
package com.appleframework.orm.hibernate.configuration;

import java.util.List;
import java.util.Properties;
/**
 * Contains common methods(properties) which are needed for session factory.
 * 
 * @author Cruise.Xu
 * @date: 2011-9-8
 * 
 */
public interface ICommonHibernateConfiguration {
	
	void setMappingResources(List<?> list);

	@SuppressWarnings("rawtypes")
	void setAnnotatedClasses(List<Class> list);
	
	void setAnnotatedPackages(List<String> list);

	void setConfigLocations(List<?> list);

	void setHibernateProperties(Properties properties);
}
