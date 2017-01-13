package com.glupta.jiaotongPPP.web.rest;

import com.glupta.jiaotongPPP.dao.ExpertsDAO;

import com.glupta.jiaotongPPP.domain.Experts;

import com.glupta.jiaotongPPP.service.ExpertsService;

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
 * Spring Rest controller that handles CRUD requests for Experts entities
 * 
 */

@Controller("ExpertsRestController")
public class ExpertsRestController {

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
	 * Select an existing Experts entity
	 * 
	 */
	@RequestMapping(value = "/Experts/{experts_expertId}", method = RequestMethod.GET)
	@ResponseBody
	public Experts loadExperts(@PathVariable Integer experts_expertId) {
		return expertsDAO.findExpertsByPrimaryKey(experts_expertId);
	}

	/**
	 * Save an existing Experts entity
	 * 
	 */
	@RequestMapping(value = "/Experts", method = RequestMethod.PUT)
	@ResponseBody
	public Experts saveExperts(@RequestBody Experts experts) {
		expertsService.saveExperts(experts);
		return expertsDAO.findExpertsByPrimaryKey(experts.getExpertId());
	}

	/**
	 * Show all Experts entities
	 * 
	 */
	@RequestMapping(value = "/Experts", method = RequestMethod.GET)
	@ResponseBody
	public List<Experts> listExpertss() {
		return new java.util.ArrayList<Experts>(expertsService.loadExpertss());
	}

	/**
	 * Create a new Experts entity
	 * 
	 */
	@RequestMapping(value = "/Experts", method = RequestMethod.POST)
	@ResponseBody
	public Experts newExperts(@RequestBody Experts experts) {
		expertsService.saveExperts(experts);
		return expertsDAO.findExpertsByPrimaryKey(experts.getExpertId());
	}

	/**
	 * Delete an existing Experts entity
	 * 
	 */
	@RequestMapping(value = "/Experts/{experts_expertId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteExperts(@PathVariable Integer experts_expertId) {
		Experts experts = expertsDAO.findExpertsByPrimaryKey(experts_expertId);
		expertsService.deleteExperts(experts);
	}
}