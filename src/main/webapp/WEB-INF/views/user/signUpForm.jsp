<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
    <%@ include file="./include/signUpFormCSS.jsp" %>
    <title>게시글 목록</title>
</head>
<body>
<main>
    <article>
        <form class="before:content-['회원가입']" action="<c:url value="/"/>" method="post" onsubmit="return false">
            <input type="hidden" name="act" value="signUp" />
            <label>
                <font class="before:content-['이메일']" color="red">
                    <c:if test="${errors.hasFieldErrors('email')}">* ${errors.getMessage('email')}</c:if>
                </font>
                <c:choose>
                    <c:when test="${!errors.hasFieldErrors('email')}">
                        <c:set var="value" value="${errors.getFieldValue('email')}" />
                    </c:when>
                    <c:otherwise><c:remove var="value" /></c:otherwise>
                </c:choose>
                <input type="email" name="email" required placeholder="Email" value="${value}" />
            </label>
            <label>
                <span class="before:content-['비밀번호']" style="color: red; ">
                    <c:if test="${errors.hasFieldErrors('password')}">* ${errors.getMessage('password')}</c:if>
                </span>
                <input type="password" name="password" minlength="8" maxlength="20" required placeholder="Password" />
            </label>
            <label>
    <span class="before:content-['비밀번호_확인']" style="color: red; ">
      <c:if test="${errors.hasFieldErrors('rePassword')}">* ${errors.getMessage('rePassword')}</c:if>
    </span>
                <input type="password" name="rePassword" minlength="8" maxlength="20" required placeholder="Password" />
            </label>
            <label>
    <span class="before:content-['이름']" style="color: red; ">
      <c:if test="${errors.hasFieldErrors('name')}">* ${errors.getMessage('name')}</c:if>
    </span>
                <c:choose>
                    <c:when test="${!errors.hasFieldErrors('name')}">
                        <c:set var="value" value="${errors.getFieldValue('name')}" />
                    </c:when>
                    <c:otherwise><c:remove var="value" /></c:otherwise>
                </c:choose>
                <input type="text" name="name" required placeholder="Name" value="${value}" />
            </label>
            <label>
    <span class="before:content-['나이']" style="color: red; ">
      <c:if test="${errors.hasFieldErrors('age')}">* ${errors.getMessage('age')}</c:if>
    </span>
                <c:choose>
                    <c:when test="${!errors.hasFieldErrors('age')}">
                        <c:set var="value" value="${errors.getFieldValue('age')}" />
                    </c:when>
                    <c:otherwise><c:remove var="value" /></c:otherwise>
                </c:choose>
                <input type="number" name="age" required placeholder="age" min="0" value="${value}" />
            </label>
            <button type="submit" class="before:content-['회원가입']"></button>
        </form>
    </article>
</main>
<script>
    document.querySelector('button[type=submit]').addEventListener('click', function() {
        if(document.querySelector('input[name=password]').value !== document.querySelector('input[name=rePassword]').value) {
            return document.querySelector('input[name=rePassword]').setCustomValidity("패스워드가 일치하지 않습니다.");
        }
        document.querySelector('form').submit();
    });
</script>
</body>
</html>