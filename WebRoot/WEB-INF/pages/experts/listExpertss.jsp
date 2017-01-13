<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.experts-resources"/>
<html>
<head>
<title>List <fmt:message key="experts.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="experts.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newExperts"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="experts.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="experts.expertid.title"/></th>
					<th class="thead"><fmt:message key="experts.expertname.title"/></th>
					<th class="thead"><fmt:message key="experts.expertfrom.title"/></th>
					<th class="thead"><fmt:message key="experts.expertspeciality.title"/></th>
					<th class="thead"><fmt:message key="experts.expertcontact.title"/></th>
					<th class="thead"><fmt:message key="experts.expertemail.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${expertss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectExperts?expertIdKey=${current.expertId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editExperts?expertIdKey=${current.expertId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteExperts?expertIdKey=${current.expertId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expertId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expertName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expertFrom}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expertSpeciality}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expertContact}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.expertEmail}
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