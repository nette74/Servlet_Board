<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="com.ll.board.article.dto.ArticleDto" %>




<h1>
    게시물 작성 , WRITE
</h1>

<script>
function ArticleSave__submitForm(form) {
    form.title.value = form.title.value.trim();
    if ( form.title.value.length == 0 ) {
        form.title.value = '제목을 입력해주세요.';
        form.title.focus();
        return;
    }
    form.body.value = form.body.value.trim();
    if ( form.body.value.length == 0 ) {
        form.body.value='내용을 입력해주세요.';
        form.body.focus();
        return;
    }
    form.submit();
}
</script>

<form method="POST" onsubmit="ArticleSave__submitForm(this); return false;">
<div>
    <span>제목</span>
    <div>
        <input name="title" type="text" maxlength="300" placeholder="입력해주세요" />
    </div>


    <span>제목</span>
    <div>
        <input name="body" type="text" maxlength="300" placeholder="입력해주세요" />
    </div>
</div>

<div>
    <span>작성</span>
    <div>
        <input type="submit" value="작성" />
    </div>
</div>

</form>
