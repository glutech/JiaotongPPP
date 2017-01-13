package com.glupta.jiaotongPPP.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>ProjectsRestController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.rest.ProjectsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class ProjectsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Projects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Projects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsRestController controller = (ProjectsRestController) context.getBean("ProjectsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Projectsprojects_projectId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProjectsprojects_projectId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Projects/{projects_projectId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsRestController controller = (ProjectsRestController) context.getBean("ProjectsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Projects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Projects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsRestController controller = (ProjectsRestController) context.getBean("ProjectsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Projects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Projects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsRestController controller = (ProjectsRestController) context.getBean("ProjectsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Projectsprojects_projectId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProjectsprojects_projectId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Projects/{projects_projectId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsRestController controller = (ProjectsRestController) context.getBean("ProjectsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}