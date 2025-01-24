package com.milktea.member.model.service;

import java.sql.*;

import org.apache.ibatis.session.SqlSession;

import com.milktea.member.common.JDBCTemplate;
import com.milktea.member.common.SqlSessionTemplate;
import com.milktea.member.model.dao.MemberDAO;
import com.milktea.member.model.vo.Member;

public class MemberService {

	private JDBCTemplate jdbcTemplate;
	private SqlSession conn;
	private MemberDAO mDao;
	
	public MemberService() {
		conn = SqlSessionTemplate.getSqlSession();
		jdbcTemplate =JDBCTemplate.getInstance();
		// private이라서 new 객체 생성이 불가능하므로 클래스에서 받아서 객체 생성
		mDao = new MemberDAO();
	}
	
	public Member selectOneByLogin(Member member) {
		Member result = mDao.selectOneByLogin(conn, member);
		return result;
		
//		Connection conn = null;
//		Member result = null;
//		try {
//			conn = jdbcTemplate.getConnection();
//			result = mDao.selectOneByLogin(conn,member);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return result;
	}

	public int insertMember(Member member) {
		int result = mDao.insertMember(conn, member);
		return result;
	}

}
