package com.milktea.member.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "kh";
	private static final String PASSWORD = "kh";
	// JDBCTemplate 객체 - 싱글톤 적용
	private static JDBCTemplate instance;
	
	private JDBCTemplate() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static JDBCTemplate getInstance() {
		if(instance == null)
			instance = new JDBCTemplate();
		return instance;
	}
	// 연결 생성 메소드 - getConnection() 생성
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
				
	}
}
