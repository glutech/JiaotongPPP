package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Projects;

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
public class ProjectsServiceTest {

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
	protected ProjectsService service;

	/**
	 * Instantiates a new ProjectsServiceTest.
	 *
	 */
	public ProjectsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Projects entity
	 * 
	 */
	@Test
	public void saveProjects() {
		// TODO: JUnit - Populate test inputs for operation: saveProjects 
		Projects projects = new com.glupta.jiaotongPPP.domain.Projects();
		service.saveProjects(projects);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProjectsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProjectsByPrimaryKey 
		Integer projectId = 0;
		Projects response = null;
		response = service.findProjectsByPrimaryKey(projectId);
		// TODO: JUnit - Add assertions to test outputs of operation: findProjectsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Projects entity
	 * 
	 */
	@Test
	public void loadProjectss() {
		Set<Projects> response = null;
		response = service.loadProjectss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProjectss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Projects entity
	 * 
	 */
	@Test
	public void countProjectss() {
		Integer response = null;
		response = service.countProjectss();
		// TODO: JUnit - Add assertions to test outputs of operation: countProjectss
	}

	/**
	 * Operation Unit Test
	 * Return all Projects entity
	 * 
	 */
	@Test
	public void findAllProjectss() {
		// TODO: JUnit - Populate test inputs for operation: findAllProjectss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Projects> response = null;
		response = service.findAllProjectss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProjectss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Projects entity
	 * 
	 */
	@Test
	public void deleteProjects() {
		// TODO: JUnit - Populate test inputs for operation: deleteProjects 
		Projects projects_1 = new com.glupta.jiaotongPPP.domain.Projects();
		service.deleteProjects(projects_1);
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
