<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.ll.board.article.dto.ArticleDto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
    List<ArticleDto> articleDtos = (List<articleDto>)request.getAttribute("");
%>



<h1>
    Wonder if JSP working ?
</h1>

<%for(ArticleDto article : articleDtos) { %>
    <div>번호 :<%=article.gitId()%> 제목 : <%=article.getTitle()%> 내용 : <%=article.getBody()%> </div><br/>
<%}%>