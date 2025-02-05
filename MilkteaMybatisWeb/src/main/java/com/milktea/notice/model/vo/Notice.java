package com.milktea.notice.model.vo;

import java.sql.Timestamp;

public class Notice {
	// 캐멀케이스를 이용해 변수명 작성, 자바용 자료형으로 변형해서 작성
	private int noticeNo;
	private String noticeSubject;
	private String noticeContent;
	private String noticeWriter;
	private Timestamp writeDate;
	private int viewCount;
	private String attachmentName;
	private String attachmentPath;
	private Timestamp attachmentDate;
	
	public Notice() {}

	public Notice(String noticeSubject, String noticeContent, String noticeWriter) {
		super();
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeWriter = noticeWriter;
	}

	public Notice(int noticeNo, String noticeSubject, String noticeContent) {
		super();
		this.noticeNo = noticeNo;
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public String getNoticeWriter() {
		return noticeWriter;
	}

	public Timestamp getWriteDate() {
		return writeDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public String getAttachmentPath() {
		return attachmentPath;
	}

	public Timestamp getAttachmentDate() {
		return attachmentDate;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticesubject=" + noticeSubject + ", noticeContent=" + noticeContent
				+ ", noticeWriter=" + noticeWriter + ", writeDate=" + writeDate + ", viewCount=" + viewCount
				+ ", attachmentName=" + attachmentName + ", attachmentPath=" + attachmentPath + ", attachmentDate="
				+ attachmentDate + "]";
	}
	
}
