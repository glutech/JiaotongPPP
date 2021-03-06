<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.users-resources"/>
<html>
<head>
<title>List <fmt:message key="users.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="users.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsers"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="users.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="users.userid.title"/></th>
					<th class="thead"><fmt:message key="users.username.title"/></th>
					<th class="thead"><fmt:message key="users.usertype.title"/></th>
					<th class="thead"><fmt:message key="users.useremail.title"/></th>
					<th class="thead"><fmt:message key="users.usercontact.title"/></th>
					<th class="thead"><fmt:message key="users.useraddress.title"/></th>
					<th class="thead"><fmt:message key="users.userbelong.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userss}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsers?userIdKey=${current.userId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsers?userIdKey=${current.userId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsers?userIdKey=${current.userId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userEmail}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userContact}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userAddress}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userBelong}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>