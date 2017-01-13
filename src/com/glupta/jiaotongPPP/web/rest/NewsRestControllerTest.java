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
 * Unit test for the <code>NewsRestController</code> controller.
 *
 * @see com.glupta.jiaotongPPP.web.rest.NewsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
public class NewsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>News()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/News");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsRestController controller = (NewsRestController) context.getBean("NewsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Newsnews_newsId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetNewsnews_newsId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/News/{news_newsId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsRestController controller = (NewsRestController) context.getBean("NewsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>News()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/News");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsRestController controller = (NewsRestController) context.getBean("NewsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>News()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostNews() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/News");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsRestController controller = (NewsRestController) context.getBean("NewsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Newsnews_newsId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteNewsnews_newsId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/News/{news_newsId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NewsRestController controller = (NewsRestController) context.getBean("NewsRestController");

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