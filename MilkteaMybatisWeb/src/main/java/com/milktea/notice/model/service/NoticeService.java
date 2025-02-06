package com.milktea.notice.model.service;

import java.util.List;

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

	public int updateNotice(Notice notice) {
		int result = nDao.updateNotice(session, notice);
		return result;
	}

	public int deleteNotice(int noticeNo) {
		int result = nDao.deleteNotice(session, noticeNo);
		return result;
	}

	public List<Notice> selectListAll(int currentPage) {
		List<Notice> nList = nDao.selectListAll(session, currentPage);
		return nList;
	}

	public Notice selectOneByNo(int noticeNo) {
		Notice notice = nDao.selectOneByNo(session, noticeNo);
		return notice;
	}

}
