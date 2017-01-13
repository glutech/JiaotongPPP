package com.glupta.jiaotongPPP.web;

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
 * Unit test for the <code>ProjectsController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.ProjectsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class ProjectsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProjects()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProjects() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProjects");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>projectsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetprojectsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/projectsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProjectsController controller = (ProjectsController) context.getBean("ProjectsController");

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