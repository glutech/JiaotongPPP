package com.glupta.jiaotongPPP.web.rest;

import com.glupta.jiaotongPPP.dao.ProjectsDAO;

import com.glupta.jiaotongPPP.domain.Projects;

import com.glupta.jiaotongPPP.service.ProjectsService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Projects entities
 * 
 */

@Controller("ProjectsRestController")
public class ProjectsRestController {

	/**
	 * DAO injected by Spring that manages Projects entities
	 * 
	 */
	@Autowired
	private ProjectsDAO projectsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Projects entities
	 * 
	 */
	@Autowired
	private ProjectsService projectsService;

	/**
	 * Select an existing Projects entity
	 * 
	 */
	@RequestMapping(value = "/Projects/{projects_projectId}", method = RequestMethod.GET)
	@ResponseBody
	public Projects loadProjects(@PathVariable Integer projects_projectId) {
		return projectsDAO.findProjectsByPrimaryKey(projects_projectId);
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Show all Projects entities
	 * 
	 */
	@RequestMapping(value = "/Projects", method = RequestMethod.GET)
	@ResponseBody
	public List<Projects> listProjectss() {
		return new java.util.ArrayList<Projects>(projectsService.loadProjectss());
	}

	/**
	 * Delete an existing Projects entity
	 * 
	 */
	@RequestMapping(value = "/Projects/{projects_projectId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProjects(@PathVariable Integer projects_projectId) {
		Projects projects = projectsDAO.findProjectsByPrimaryKey(projects_projectId);
		projectsService.deleteProjects(projects);
	}

	/**
	 * Create a new Projects entity
	 * 
	 */
	@RequestMapping(value = "/Projects", method = RequestMethod.POST)
	@ResponseBody
	public Projects newProjects(@RequestBody Projects projects) {
		projectsService.saveProjects(projects);
		return projectsDAO.findProjectsByPrimaryKey(projects.getProjectId());
	}

	/**
	 * Save an existing Projects entity
	 * 
	 */
	@RequestMapping(value = "/Projects", method = RequestMethod.PUT)
	@ResponseBody
	public Projects saveProjects(@RequestBody Projects projects) {
		projectsService.saveProjects(projects);
		return projectsDAO.findProjectsByPrimaryKey(projects.getProjectId());
	}
}