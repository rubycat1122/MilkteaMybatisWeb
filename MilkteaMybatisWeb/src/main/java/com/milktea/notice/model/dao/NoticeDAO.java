package com.milktea.notice.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.milktea.notice.model.vo.Notice;

public class NoticeDAO {

	public int insertNotice(SqlSession session, Notice notice) {
		int result = session.insert("NoticeMapper.insertNotice", notice);
		return result;
	}

}
