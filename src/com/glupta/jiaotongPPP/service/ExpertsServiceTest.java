package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Experts;

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
public class ExpertsServiceTest {

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
	protected ExpertsService service;

	/**
	 * Instantiates a new ExpertsServiceTest.
	 *
	 */
	public ExpertsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Experts entity
	 * 
	 */
	@Test
	public void loadExpertss() {
		Set<Experts> response = null;
		response = service.loadExpertss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadExpertss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Experts entity
	 * 
	 */
	@Test
	public void countExpertss() {
		Integer response = null;
		response = service.countExpertss();
		// TODO: JUnit - Add assertions to test outputs of operation: countExpertss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Experts entity
	 * 
	 */
	@Test
	public void saveExperts() {
		// TODO: JUnit - Populate test inputs for operation: saveExperts 
		Experts experts = new com.glupta.jiaotongPPP.domain.Experts();
		service.saveExperts(experts);
	}

	/**
	 * Operation Unit Test
	 * Return all Experts entity
	 * 
	 */
	@Test
	public void findAllExpertss() {
		// TODO: JUnit - Populate test inputs for operation: findAllExpertss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Experts> response = null;
		response = service.findAllExpertss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllExpertss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findExpertsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findExpertsByPrimaryKey 
		Integer expertId = 0;
		Experts response = null;
		response = service.findExpertsByPrimaryKey(expertId);
		// TODO: JUnit - Add assertions to test outputs of operation: findExpertsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Experts entity
	 * 
	 */
	@Test
	public void deleteExperts() {
		// TODO: JUnit - Populate test inputs for operation: deleteExperts 
		Experts experts_1 = new com.glupta.jiaotongPPP.domain.Experts();
		service.deleteExperts(experts_1);
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
