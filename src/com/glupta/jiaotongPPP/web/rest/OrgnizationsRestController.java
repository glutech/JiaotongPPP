package com.glupta.jiaotongPPP.web.rest;

import com.glupta.jiaotongPPP.dao.OrgnizationsDAO;

import com.glupta.jiaotongPPP.domain.Orgnizations;

import com.glupta.jiaotongPPP.service.OrgnizationsService;

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
 * Spring Rest controller that handles CRUD requests for Orgnizations entities
 * 
 */

@Controller("OrgnizationsRestController")
public class OrgnizationsRestController {

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
	 * Delete an existing Orgnizations entity
	 * 
	 */
	@RequestMapping(value = "/Orgnizations/{orgnizations_orgId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrgnizations(@PathVariable Integer orgnizations_orgId) {
		Orgnizations orgnizations = orgnizationsDAO.findOrgnizationsByPrimaryKey(orgnizations_orgId);
		orgnizationsService.deleteOrgnizations(orgnizations);
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
	 * Show all Orgnizations entities
	 * 
	 */
	@RequestMapping(value = "/Orgnizations", method = RequestMethod.GET)
	@ResponseBody
	public List<Orgnizations> listOrgnizationss() {
		return new java.util.ArrayList<Orgnizations>(orgnizationsService.loadOrgnizationss());
	}

	/**
	 * Select an existing Orgnizations entity
	 * 
	 */
	@RequestMapping(value = "/Orgnizations/{orgnizations_orgId}", method = RequestMethod.GET)
	@ResponseBody
	public Orgnizations loadOrgnizations(@PathVariable Integer orgnizations_orgId) {
		return orgnizationsDAO.findOrgnizationsByPrimaryKey(orgnizations_orgId);
	}

	/**
	 * Create a new Orgnizations entity
	 * 
	 */
	@RequestMapping(value = "/Orgnizations", method = RequestMethod.POST)
	@ResponseBody
	public Orgnizations newOrgnizations(@RequestBody Orgnizations orgnizations) {
		orgnizationsService.saveOrgnizations(orgnizations);
		return orgnizationsDAO.findOrgnizationsByPrimaryKey(orgnizations.getOrgId());
	}

	/**
	 * Save an existing Orgnizations entity
	 * 
	 */
	@RequestMapping(value = "/Orgnizations", method = RequestMethod.PUT)
	@ResponseBody
	public Orgnizations saveOrgnizations(@RequestBody Orgnizations orgnizations) {
		orgnizationsService.saveOrgnizations(orgnizations);
		return orgnizationsDAO.findOrgnizationsByPrimaryKey(orgnizations.getOrgId());
	}
}