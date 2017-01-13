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
 * Unit test for the <code>DocsController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.DocsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class DocsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDocs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDocs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDocs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>docsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdocsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/docsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocsController controller = (DocsController) context.getBean("DocsController");

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