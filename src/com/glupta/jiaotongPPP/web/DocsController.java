package com.glupta.jiaotongPPP.web;

import com.glupta.jiaotongPPP.dao.DocsDAO;

import com.glupta.jiaotongPPP.domain.Docs;

import com.glupta.jiaotongPPP.service.DocsService;

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
 * Spring MVC controller that handles CRUD requests for Docs entities
 * 
 */

@Controller("DocsController")
public class DocsController {

	/**
	 * DAO injected by Spring that manages Docs entities
	 * 
	 */
	@Autowired
	private DocsDAO docsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Docs entities
	 * 
	 */
	@Autowired
	private DocsService docsService;

	/**
	 * Delete an existing Docs entity
	 * 
	 */
	@RequestMapping("/deleteDocs")
	public String deleteDocs(@RequestParam Integer docIdKey) {
		Docs docs = docsDAO.findDocsByPrimaryKey(docIdKey);
		docsService.deleteDocs(docs);
		return "forward:/indexDocs";
	}

	/**
	 * Create a new Docs entity
	 * 
	 */
	@RequestMapping("/newDocs")
	public ModelAndView newDocs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("docs", new Docs());
		mav.addObject("newFlag", true);
		mav.setViewName("docs/editDocs.jsp");

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
	 * Save an existing Docs entity
	 * 
	 */
	@RequestMapping("/saveDocs")
	public String saveDocs(@ModelAttribute Docs docs) {
		docsService.saveDocs(docs);
		return "forward:/indexDocs";
	}

	/**
	 * Entry point to show all Docs entities
	 * 
	 */
	public String indexDocs() {
		return "redirect:/indexDocs";
	}

	/**
	 */
	@RequestMapping("/docsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Docs entity
	 * 
	 */
	@RequestMapping("/selectDocs")
	public ModelAndView selectDocs(@RequestParam Integer docIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("docs", docsDAO.findDocsByPrimaryKey(docIdKey));
		mav.setViewName("docs/viewDocs.jsp");

		return mav;
	}

	/**
	 * Edit an existing Docs entity
	 * 
	 */
	@RequestMapping("/editDocs")
	public ModelAndView editDocs(@RequestParam Integer docIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("docs", docsDAO.findDocsByPrimaryKey(docIdKey));
		mav.setViewName("docs/editDocs.jsp");

		return mav;
	}

	/**
	 * Select the Docs entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDocs")
	public ModelAndView confirmDeleteDocs(@RequestParam Integer docIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("docs", docsDAO.findDocsByPrimaryKey(docIdKey));
		mav.setViewName("docs/deleteDocs.jsp");

		return mav;
	}

	/**
	 * Show all Docs entities
	 * 
	 */
	@RequestMapping("/indexDocs")
	public ModelAndView listDocss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("docss", docsService.loadDocss());

		mav.setViewName("docs/listDocss.jsp");

		return mav;
	}
}