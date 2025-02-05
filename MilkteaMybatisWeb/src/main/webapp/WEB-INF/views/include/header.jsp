<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="header">
   <div id="logo">
       <h1><a href="/">Dream Jeju</a></h1>
   </div>        
   <nav id="nav">
       <ul>
          <li><a href="#">단체여행</a></li>
          <li><a href="#">맞춤여행</a></li>
          <li><a href="#">갤러리</a></li>
          <li><a href="/notice/list">공지사항</a></li>
          <!--  만약에 memberId가 없으면 로그인 버튼 보이고 -->
          <c:if test="${sessionScope.result.memberId == null}">
          	<li><a href="/member/login">로그인</a></li>
          </c:if>
          <c:if test="${sessionScope.result.memberId != null}">
          	<li><a href="/member/mypage">마이페이지</a></li>
          	<li><a href="/member/logout">로그아웃</a></li>
          </c:if>
          <!-- 만약에 memberId가 있으면 로그인 버튼이 안 보이도록 해야 함 -->
        </ul>  
    </nav>
</header>   