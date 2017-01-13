package com.glupta.jiaotongPPP.web;

import com.glupta.jiaotongPPP.dao.ExpertsDAO;

import com.glupta.jiaotongPPP.domain.Experts;

import com.glupta.jiaotongPPP.service.ExpertsService;

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
 * Spring MVC controller that handles CRUD requests for Experts entities
 * 
 */

@Controller("ExpertsController")
public class ExpertsController {

	/**
	 * DAO injected by Spring that manages Experts entities
	 * 
	 */
	@Autowired
	private ExpertsDAO expertsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Experts entities
	 * 
	 */
	@Autowired
	private ExpertsService expertsService;

	/**
	 * Save an existing Experts entity
	 * 
	 */
	@RequestMapping("/saveExperts")
	public String saveExperts(@ModelAttribute Experts experts) {
		expertsService.saveExperts(experts);
		return "forward:/indexExperts";
	}

	/**
	 * Edit an existing Experts entity
	 * 
	 */
	@RequestMapping("/editExperts")
	public ModelAndView editExperts(@RequestParam Integer expertIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("experts", expertsDAO.findExpertsByPrimaryKey(expertIdKey));
		mav.setViewName("experts/editExperts.jsp");

		return mav;
	}

	/**
	 * Select the Experts entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteExperts")
	public ModelAndView confirmDeleteExperts(@RequestParam Integer expertIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("experts", expertsDAO.findExpertsByPrimaryKey(expertIdKey));
		mav.setViewName("experts/deleteExperts.jsp");

		return mav;
	}

	/**
	 * Create a new Experts entity
	 * 
	 */
	@RequestMapping("/newExperts")
	public ModelAndView newExperts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("experts", new Experts());
		mav.addObject("newFlag", true);
		mav.setViewName("experts/editExperts.jsp");

		return mav;
	}

	/**
	 * Select an existing Experts entity
	 * 
	 */
	@RequestMapping("/selectExperts")
	public ModelAndView selectExperts(@RequestParam Integer expertIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("experts", expertsDAO.findExpertsByPrimaryKey(expertIdKey));
		mav.setViewName("experts/viewExperts.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/expertsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Experts entities
	 * 
	 */
	@RequestMapping("/indexExperts")
	public ModelAndView listExpertss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("expertss", expertsService.loadExpertss());

		mav.setViewName("experts/listExpertss.jsp");

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
	 * Entry point to show all Experts entities
	 * 
	 */
	public String indexExperts() {
		return "redirect:/indexExperts";
	}

	/**
	 * Delete an existing Experts entity
	 * 
	 */
	@RequestMapping("/deleteExperts")
	public String deleteExperts(@RequestParam Integer expertIdKey) {
		Experts experts = expertsDAO.findExpertsByPrimaryKey(expertIdKey);
		expertsService.deleteExperts(experts);
		return "forward:/indexExperts";
	}
}