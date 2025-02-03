package com.milktea.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.milktea.member.common.NavigationUtil;
import com.milktea.member.model.service.MemberService;
import com.milktea.member.model.vo.Member;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/member/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/signup.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId 	= request.getParameter("memberId");
		String memberPwd	= request.getParameter("memberPwd");
		String memberName	= request.getParameter("memberName");
		String gender		= request.getParameter("gender");
		int    age			= Integer.parseInt(request.getParameter("age"));
		String email		= request.getParameter("email");
		String phone		= request.getParameter("phone");
		String address		= request.getParameter("address");
		String hobby		= request.getParameter("hobby");
		Member member = new Member(memberId, memberPwd, memberName, gender, age, email, phone, address, hobby);
		int result = new MemberService().insertMember(member);
		if(result > 0) {
			response.sendRedirect("/member/login");
		}else {
			NavigationUtil.navigateToError(request, response, "500", "서비스처리가 완료되지 않았습니다.");
//			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}
		
	}

}
