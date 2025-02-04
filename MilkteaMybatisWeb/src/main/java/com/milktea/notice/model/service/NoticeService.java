package com.milktea.notice.model.service;

import org.apache.ibatis.session.SqlSession;

import com.milktea.member.common.SqlSessionTemplate;
import com.milktea.notice.model.dao.NoticeDAO;
import com.milktea.notice.model.vo.Notice;

public class NoticeService {

	private NoticeDAO nDao;
	private SqlSession session;
	
	public NoticeService() {
		nDao = new NoticeDAO();
		session = SqlSessionTemplate.getSqlSession();
	}
	
	public int insertNotice(Notice notice) {
		int result = nDao.insertNotice(session, notice);
		return result;
	}

}
