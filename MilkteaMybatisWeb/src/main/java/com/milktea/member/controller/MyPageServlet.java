package com.milktea.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.milktea.member.common.NavigationUtil;
import com.milktea.member.model.service.MemberService;
import com.milktea.member.model.vo.Member;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/member/mypage")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService mService = new MemberService();
		// HttpSession 객체를 가져옴
		HttpSession session = request.getSession();
		// 세션에 저장된 정보를 가져와야 함. getAttribute() 메서드 이용
		Object obj = session.getAttribute("result");
		// getAttribute() 메소드는 리턴형이 Object, 그런데 필요한 것은 Member이므로
		Member searchOne = (Member)session.getAttribute("result"); // 멤버타입의 변수로 형변환
		if(searchOne != null) {
			String memberId = searchOne.getMemberId();
			Member member = mService.selectOneById(memberId);
			//String mId = (String)session.getAttribute("memberId");
			//String memberId = (String)(request.getSession()).getAttribute("memberId");
			if(member != null) {
				request.setAttribute("member", member);			
				request.getRequestDispatcher("/WEB-INF/views/member/mypage.jsp").forward(request, response);
			}else {
				NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
				//request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
			}
		}else {
			NavigationUtil.navigateToError(request, response, "404", "로그인이 필요합니다.");
			//request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}
	}

}
