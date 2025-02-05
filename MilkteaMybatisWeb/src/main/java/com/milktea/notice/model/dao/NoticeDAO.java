package com.milktea.notice.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.milktea.notice.model.vo.Notice;

public class NoticeDAO {

	public int insertNotice(SqlSession session, Notice notice) {
		int result = session.insert("NoticeMapper.insertNotice", notice);
		return result;
	}

	public int updateNotice(SqlSession session, Notice notice) {
		int result = session.update("NoticeMapper.updateNotice", notice);
		return result;
	}

	public int deleteNotice(SqlSession session, int noticeNo) {
		int result = session.delete("NoticeMapper.deleteNotice", noticeNo);
		return result;
	}

	public List<Notice> selectListAll(SqlSession session) {
		int offset = 0;
		int limit = 10;
		RowBounds rowBounds = new RowBounds(offset,limit);
//		List<Notice> nList = session.selectList("NoticeMapper.selectListAll");
		List<Notice> nList = session.selectList("NoticeMapper.selectListAll", null, rowBounds);
		return nList;
	}

	public Notice selectOneByNo(SqlSession session, int noticeNo) {
		Notice notice = session.selectOne("NoticeMapper.selectOneByNo", noticeNo);
		return notice;
	}

}
