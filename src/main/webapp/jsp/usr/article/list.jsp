<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="com.ll.board.article.dto.ArticleDto" %>


<%
    List<ArticleDto> articleDtos = (List<ArticleDto>)request.getAttribute("articleDtos");
%>



<h1>
    게시물 리스트 , LIST
</h1>

<%for(ArticleDto article : articleDtos) { %>
    <div>번호 :<%=article.getId()%> 제목 : <%=article.getTitle()%> 내용 : <%=article.getBody()%> </div><br/>
<%}%>