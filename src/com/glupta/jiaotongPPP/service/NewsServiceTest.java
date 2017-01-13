package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.News;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/JiaotongPPP-security-context.xml",
		"file:./resources/JiaotongPPP-service-context.xml",
		"file:./resources/JiaotongPPP-dao-context.xml",
		"file:./resources/JiaotongPPP-web-context.xml" })
@Transactional
public class NewsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected NewsService service;

	/**
	 * Instantiates a new NewsServiceTest.
	 *
	 */
	public NewsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all News entity
	 * 
	 */
	@Test
	public void findAllNewss() {
		// TODO: JUnit - Populate test inputs for operation: findAllNewss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<News> response = null;
		response = service.findAllNewss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllNewss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing News entity
	 * 
	 */
	@Test
	public void deleteNews() {
		// TODO: JUnit - Populate test inputs for operation: deleteNews 
		News news = new com.glupta.jiaotongPPP.domain.News();
		service.deleteNews(news);
	}

	/**
	 * Operation Unit Test
	 * Load an existing News entity
	 * 
	 */
	@Test
	public void loadNewss() {
		Set<News> response = null;
		response = service.loadNewss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadNewss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findNewsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findNewsByPrimaryKey 
		Integer newsId = 0;
		News response = null;
		response = service.findNewsByPrimaryKey(newsId);
		// TODO: JUnit - Add assertions to test outputs of operation: findNewsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing News entity
	 * 
	 */
	@Test
	public void saveNews() {
		// TODO: JUnit - Populate test inputs for operation: saveNews 
		News news_1 = new com.glupta.jiaotongPPP.domain.News();
		service.saveNews(news_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all News entity
	 * 
	 */
	@Test
	public void countNewss() {
		Integer response = null;
		response = service.countNewss();
		// TODO: JUnit - Add assertions to test outputs of operation: countNewss
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
