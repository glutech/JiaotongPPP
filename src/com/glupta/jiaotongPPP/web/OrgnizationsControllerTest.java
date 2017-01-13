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
 * Unit test for the <code>OrgnizationsController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.OrgnizationsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class OrgnizationsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrgnizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrgnizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrgnizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orgnizationsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorgnizationsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orgnizationsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgnizationsController controller = (OrgnizationsController) context.getBean("OrgnizationsController");

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