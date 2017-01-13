package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Docs;

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
public class DocsServiceTest {

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
	protected DocsService service;

	/**
	 * Instantiates a new DocsServiceTest.
	 *
	 */
	public DocsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findDocsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDocsByPrimaryKey 
		Integer docId = 0;
		Docs response = null;
		response = service.findDocsByPrimaryKey(docId);
		// TODO: JUnit - Add assertions to test outputs of operation: findDocsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Docs entity
	 * 
	 */
	@Test
	public void saveDocs() {
		// TODO: JUnit - Populate test inputs for operation: saveDocs 
		Docs docs = new com.glupta.jiaotongPPP.domain.Docs();
		service.saveDocs(docs);
	}

	/**
	 * Operation Unit Test
	 * Return all Docs entity
	 * 
	 */
	@Test
	public void findAllDocss() {
		// TODO: JUnit - Populate test inputs for operation: findAllDocss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Docs> response = null;
		response = service.findAllDocss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDocss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Docs entity
	 * 
	 */
	@Test
	public void countDocss() {
		Integer response = null;
		response = service.countDocss();
		// TODO: JUnit - Add assertions to test outputs of operation: countDocss
	}

	/**
	 * Operation Unit Test
	 * Load an existing Docs entity
	 * 
	 */
	@Test
	public void loadDocss() {
		Set<Docs> response = null;
		response = service.loadDocss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDocss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Docs entity
	 * 
	 */
	@Test
	public void deleteDocs() {
		// TODO: JUnit - Populate test inputs for operation: deleteDocs 
		Docs docs_1 = new com.glupta.jiaotongPPP.domain.Docs();
		service.deleteDocs(docs_1);
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
