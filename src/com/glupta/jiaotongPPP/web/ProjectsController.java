package com.glupta.jiaotongPPP.web;

import com.glupta.jiaotongPPP.dao.ProjectsDAO;

import com.glupta.jiaotongPPP.domain.Projects;

import com.glupta.jiaotongPPP.service.ProjectsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Projects entities
 * 
 */

@Controller("ProjectsController")
public class ProjectsController {

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
	 * Edit an existing Projects entity
	 * 
	 */
	@RequestMapping("/editProjects")
	public ModelAndView editProjects(@RequestParam Integer projectIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("projects", projectsDAO.findProjectsByPrimaryKey(projectIdKey));
		mav.setViewName("projects/editProjects.jsp");

		return mav;
	}

	/**
	 * Save an existing Projects entity
	 * 
	 */
	@RequestMapping("/saveProjects")
	public String saveProjects(@ModelAttribute Projects projects) {
		projectsService.saveProjects(projects);
		return "forward:/indexProjects";
	}

	/**
	 */
	@RequestMapping("/projectsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Projects entity
	 * 
	 */
	@RequestMapping("/newProjects")
	public ModelAndView newProjects() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("projects", new Projects());
		mav.addObject("newFlag", true);
		mav.setViewName("projects/editProjects.jsp");

		return mav;
	}

	/**
	 * Delete an existing Projects entity
	 * 
	 */
	@RequestMapping("/deleteProjects")
	public String deleteProjects(@RequestParam Integer projectIdKey) {
		Projects projects = projectsDAO.findProjectsByPrimaryKey(projectIdKey);
		projectsService.deleteProjects(projects);
		return "forward:/indexProjects";
	}

	/**
	 * Show all Projects entities
	 * 
	 */
	@RequestMapping("/indexProjects")
	public ModelAndView listProjectss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("projectss", projectsService.loadProjectss());

		mav.setViewName("projects/listProjectss.jsp");

		return mav;
	}

	/**
	 * Select the Projects entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProjects")
	public ModelAndView confirmDeleteProjects(@RequestParam Integer projectIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("projects", projectsDAO.findProjectsByPrimaryKey(projectIdKey));
		mav.setViewName("projects/deleteProjects.jsp");

		return mav;
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
	 * Select an existing Projects entity
	 * 
	 */
	@RequestMapping("/selectProjects")
	public ModelAndView selectProjects(@RequestParam Integer projectIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("projects", projectsDAO.findProjectsByPrimaryKey(projectIdKey));
		mav.setViewName("projects/viewProjects.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Projects entities
	 * 
	 */
	public String indexProjects() {
		return "redirect:/indexProjects";
	}
}