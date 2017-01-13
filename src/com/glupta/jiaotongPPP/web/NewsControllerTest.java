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
 * Unit test for the <code>NewsController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.NewsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class NewsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteNews()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteNews");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsController controller = (NewsController) context.getBean("NewsController");

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