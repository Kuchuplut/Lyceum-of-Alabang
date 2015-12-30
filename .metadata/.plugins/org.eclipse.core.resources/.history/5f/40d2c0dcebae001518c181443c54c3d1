package com.lyceum.dao.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lyceum.dao.ConnectionManager;

public class MybatisConnectionManager implements ConnectionManager {

	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public void establishConnection() throws Exception {
		if (sqlSessionFactory == null) {
			String resource = "com/practiceweb/dao/mybatis/conf/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}
	}

	@Override
	public void stopConnection() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		return this.sqlSessionFactory;
	}

}
