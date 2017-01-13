<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.projects-resources"/>
<html>
<head>
<title>View <fmt:message key="projects.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="projects.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProjects"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectid.title"/>:
						</td>
						<td>
							${projects.projectId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectname.title"/>:
						</td>
						<td>
							${projects.projectName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectarea.title"/>:
						</td>
						<td>
							${projects.projectArea}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectinvestment.title"/>:
						</td>
						<td>
							${projects.projectInvestment}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectcooptime.title"/>:
						</td>
						<td>
							${projects.projectCooptime}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectmode.title"/>:
						</td>
						<td>
							${projects.projectMode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectrewardtype.title"/>:
						</td>
						<td>
							${projects.projectRewardType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectstarttime.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${projects.projectStartTime.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectstarttype.title"/>:
						</td>
						<td>
							${projects.projectStartType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectoverview.title"/>:
						</td>
						<td>
							${projects.projectOverview}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectcontact.title"/>:
						</td>
						<td>
							${projects.projectContact}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectcontactphone.title"/>:
						</td>
						<td>
							${projects.projectContactPhone}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectrecomlevel.title"/>:
						</td>
						<td>
							${projects.projectRecomLevel}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projectpilotnum.title"/>:
						</td>
						<td>
							${projects.projectPilotNum}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="projects.projecttype.title"/>:
						</td>
						<td>
							${projects.projectType}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>