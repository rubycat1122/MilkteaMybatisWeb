package com.milktea.member.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		// SessionFactoryBuilder -> SessionFactory -> session
		String resource = "mybatis-config.xml";
		InputStream is;
		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(is);
			session = factory.openSession(true); //true면 자동커밋 false면 수동커밋
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}
}
