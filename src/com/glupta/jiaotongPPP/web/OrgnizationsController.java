package com.glupta.jiaotongPPP.web;

import com.glupta.jiaotongPPP.dao.OrgnizationsDAO;

import com.glupta.jiaotongPPP.domain.Orgnizations;

import com.glupta.jiaotongPPP.service.OrgnizationsService;

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
 * Spring MVC controller that handles CRUD requests for Orgnizations entities
 * 
 */

@Controller("OrgnizationsController")
public class OrgnizationsController {

	/**
	 * DAO injected by Spring that manages Orgnizations entities
	 * 
	 */
	@Autowired
	private OrgnizationsDAO orgnizationsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Orgnizations entities
	 * 
	 */
	@Autowired
	private OrgnizationsService orgnizationsService;

	/**
	 * Save an existing Orgnizations entity
	 * 
	 */
	@RequestMapping("/saveOrgnizations")
	public String saveOrgnizations(@ModelAttribute Orgnizations orgnizations) {
		orgnizationsService.saveOrgnizations(orgnizations);
		return "forward:/indexOrgnizations";
	}

	/**
	 * Create a new Orgnizations entity
	 * 
	 */
	@RequestMapping("/newOrgnizations")
	public ModelAndView newOrgnizations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgnizations", new Orgnizations());
		mav.addObject("newFlag", true);
		mav.setViewName("orgnizations/editOrgnizations.jsp");

		return mav;
	}

	/**
	 * Select the Orgnizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrgnizations")
	public ModelAndView confirmDeleteOrgnizations(@RequestParam Integer orgIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgnizations", orgnizationsDAO.findOrgnizationsByPrimaryKey(orgIdKey));
		mav.setViewName("orgnizations/deleteOrgnizations.jsp");

		return mav;
	}

	/**
	 * Show all Orgnizations entities
	 * 
	 */
	@RequestMapping("/indexOrgnizations")
	public ModelAndView listOrgnizationss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgnizationss", orgnizationsService.loadOrgnizationss());

		mav.setViewName("orgnizations/listOrgnizationss.jsp");

		return mav;
	}

	/**
	 * Edit an existing Orgnizations entity
	 * 
	 */
	@RequestMapping("/editOrgnizations")
	public ModelAndView editOrgnizations(@RequestParam Integer orgIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgnizations", orgnizationsDAO.findOrgnizationsByPrimaryKey(orgIdKey));
		mav.setViewName("orgnizations/editOrgnizations.jsp");

		return mav;
	}

	/**
	 * Select an existing Orgnizations entity
	 * 
	 */
	@RequestMapping("/selectOrgnizations")
	public ModelAndView selectOrgnizations(@RequestParam Integer orgIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgnizations", orgnizationsDAO.findOrgnizationsByPrimaryKey(orgIdKey));
		mav.setViewName("orgnizations/viewOrgnizations.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Orgnizations entities
	 * 
	 */
	public String indexOrgnizations() {
		return "redirect:/indexOrgnizations";
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
	 * Delete an existing Orgnizations entity
	 * 
	 */
	@RequestMapping("/deleteOrgnizations")
	public String deleteOrgnizations(@RequestParam Integer orgIdKey) {
		Orgnizations orgnizations = orgnizationsDAO.findOrgnizationsByPrimaryKey(orgIdKey);
		orgnizationsService.deleteOrgnizations(orgnizations);
		return "forward:/indexOrgnizations";
	}

	/**
	 */
	@RequestMapping("/orgnizationsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}