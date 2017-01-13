<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orgnizations-resources"/>
<html>
<head>
<title>List <fmt:message key="orgnizations.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="orgnizations.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrgnizations"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orgnizations.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="orgnizations.orgid.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgname.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgtype.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgtrustnum.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgrep.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgindustry.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgphone.title"/></th>
					<th class="thead"><fmt:message key="orgnizations.orgoverview.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${orgnizationss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrgnizations?orgIdKey=${current.orgId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrgnizations?orgIdKey=${current.orgId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrgnizations?orgIdKey=${current.orgId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgTrustnum}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgRep}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgIndustry}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgPhone}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orgOverview}
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