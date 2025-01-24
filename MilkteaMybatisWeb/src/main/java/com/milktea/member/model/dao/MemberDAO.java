package com.milktea.member.model.dao;

import java.sql.*;

import org.apache.ibatis.session.SqlSession;

import com.milktea.member.model.vo.Member;

public class MemberDAO {

	public Member selectOneByLogin(SqlSession conn, Member member) {
		Member result = conn.selectOne("MemberMapper.selectOneByLogin", member );
		return result;
	}
//	public Member selectOneByLogin(Connection conn, Member member) throws SQLException {
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		Member result = null;
//		String query = "select * from member_tbl where member_id = ? and member_pwd= ?";
//		pstmt = conn.prepareStatement(query);
//		pstmt.setString(1, member.getMemberId());
//		pstmt.setString(2, member.getMemberPwd());
//		rset = pstmt.executeQuery();
//		if(rset.next()) {
//			String memberId   = rset.getString("member_id");
//			String memberName = rset.getString("member_name");
//			String email	  = rset.getString("email");
//			result = new Member(memberId, memberName, email);
//		}
//		pstmt.close();
//		rset.close();
//		return result;
//	}

	public int insertMember(SqlSession conn, Member member) {
		int result = conn.insert("MemberMapper.insertMember", member);
		return result;
	}

}
