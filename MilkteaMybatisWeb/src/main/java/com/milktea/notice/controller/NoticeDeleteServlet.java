package com.milktea.notice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.milktea.member.common.NavigationUtil;
import com.milktea.notice.model.service.NoticeService;
import com.milktea.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeDeleteServlet
 */
@WebServlet("/notice/delete")
public class NoticeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService nService = new NoticeService();
		int noticeNo = (request.getParameter("noticeNo") != null)   
					? Integer.parseInt(request.getParameter("noticeNo")) : 0;
		int result = nService.deleteNotice(noticeNo);
		
		if(result > 0) {
			// 성공시 목록 페이지로 이동
			response.sendRedirect("/notice/list");
		}else {
			// 실패시 에러페이지로 이동
			NavigationUtil.navigateToError(request, response, "500","서비스가 완료되지 않았습니다.");
		}
	}

}
