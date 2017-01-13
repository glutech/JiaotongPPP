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
 * Unit test for the <code>ExpertsController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.ExpertsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class ExpertsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteExperts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteExperts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteExperts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>expertsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetexpertsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/expertsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ExpertsController controller = (ExpertsController) context.getBean("ExpertsController");

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