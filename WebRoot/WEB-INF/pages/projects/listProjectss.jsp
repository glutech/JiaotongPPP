<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.projects-resources"/>
<html>
<head>
<title>List <fmt:message key="projects.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="projects.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProjects"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="projects.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="projects.projectid.title"/></th>
					<th class="thead"><fmt:message key="projects.projectname.title"/></th>
					<th class="thead"><fmt:message key="projects.projectarea.title"/></th>
					<th class="thead"><fmt:message key="projects.projectinvestment.title"/></th>
					<th class="thead"><fmt:message key="projects.projectcooptime.title"/></th>
					<th class="thead"><fmt:message key="projects.projectmode.title"/></th>
					<th class="thead"><fmt:message key="projects.projectrewardtype.title"/></th>
					<th class="thead"><fmt:message key="projects.projectstarttime.title"/></th>
					<th class="thead"><fmt:message key="projects.projectstarttype.title"/></th>
					<th class="thead"><fmt:message key="projects.projectoverview.title"/></th>
					<th class="thead"><fmt:message key="projects.projectcontact.title"/></th>
					<th class="thead"><fmt:message key="projects.projectcontactphone.title"/></th>
					<th class="thead"><fmt:message key="projects.projectrecomlevel.title"/></th>
					<th class="thead"><fmt:message key="projects.projectpilotnum.title"/></th>
					<th class="thead"><fmt:message key="projects.projecttype.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${projectss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProjects?projectIdKey=${current.projectId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProjects?projectIdKey=${current.projectId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProjects?projectIdKey=${current.projectId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectArea}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectInvestment}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectCooptime}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectMode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectRewardType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.projectStartTime.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectStartType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectOverview}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectContact}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectContactPhone}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectRecomLevel}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectPilotNum}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.projectType}
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