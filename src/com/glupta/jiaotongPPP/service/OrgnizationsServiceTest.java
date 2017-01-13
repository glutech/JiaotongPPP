package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Orgnizations;

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
public class OrgnizationsServiceTest {

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
	protected OrgnizationsService service;

	/**
	 * Instantiates a new OrgnizationsServiceTest.
	 *
	 */
	public OrgnizationsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Orgnizations entity
	 * 
	 */
	@Test
	public void findAllOrgnizationss() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrgnizationss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Orgnizations> response = null;
		response = service.findAllOrgnizationss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrgnizationss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrgnizationsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrgnizationsByPrimaryKey 
		Integer orgId = 0;
		Orgnizations response = null;
		response = service.findOrgnizationsByPrimaryKey(orgId);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrgnizationsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Orgnizations entity
	 * 
	 */
	@Test
	public void deleteOrgnizations() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrgnizations 
		Orgnizations orgnizations = new com.glupta.jiaotongPPP.domain.Orgnizations();
		service.deleteOrgnizations(orgnizations);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Orgnizations entity
	 * 
	 */
	@Test
	public void countOrgnizationss() {
		Integer response = null;
		response = service.countOrgnizationss();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrgnizationss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Orgnizations entity
	 * 
	 */
	@Test
	public void saveOrgnizations() {
		// TODO: JUnit - Populate test inputs for operation: saveOrgnizations 
		Orgnizations orgnizations_1 = new com.glupta.jiaotongPPP.domain.Orgnizations();
		service.saveOrgnizations(orgnizations_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Orgnizations entity
	 * 
	 */
	@Test
	public void loadOrgnizationss() {
		Set<Orgnizations> response = null;
		response = service.loadOrgnizationss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrgnizationss
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
