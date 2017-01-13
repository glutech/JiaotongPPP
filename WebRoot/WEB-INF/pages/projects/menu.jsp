<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.projects-resources"/>
<a class="button" href="${pageContext.request.contextPath}/indexProjects"><span><img src="images/icons/view.gif" /><fmt:message key="navigation.view"/> <fmt:message key="projects.title"/>s</span></a>
