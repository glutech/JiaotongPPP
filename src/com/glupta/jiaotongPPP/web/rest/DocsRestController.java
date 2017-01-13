package com.glupta.jiaotongPPP.web.rest;

import com.glupta.jiaotongPPP.dao.DocsDAO;

import com.glupta.jiaotongPPP.domain.Docs;

import com.glupta.jiaotongPPP.service.DocsService;

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
 * Spring Rest controller that handles CRUD requests for Docs entities
 * 
 */

@Controller("DocsRestController")
public class DocsRestController {

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
	 * Create a new Docs entity
	 * 
	 */
	@RequestMapping(value = "/Docs", method = RequestMethod.POST)
	@ResponseBody
	public Docs newDocs(@RequestBody Docs docs) {
		docsService.saveDocs(docs);
		return docsDAO.findDocsByPrimaryKey(docs.getDocId());
	}

	/**
	 * Show all Docs entities
	 * 
	 */
	@RequestMapping(value = "/Docs", method = RequestMethod.GET)
	@ResponseBody
	public List<Docs> listDocss() {
		return new java.util.ArrayList<Docs>(docsService.loadDocss());
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
	 * Select an existing Docs entity
	 * 
	 */
	@RequestMapping(value = "/Docs/{docs_docId}", method = RequestMethod.GET)
	@ResponseBody
	public Docs loadDocs(@PathVariable Integer docs_docId) {
		return docsDAO.findDocsByPrimaryKey(docs_docId);
	}

	/**
	 * Delete an existing Docs entity
	 * 
	 */
	@RequestMapping(value = "/Docs/{docs_docId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDocs(@PathVariable Integer docs_docId) {
		Docs docs = docsDAO.findDocsByPrimaryKey(docs_docId);
		docsService.deleteDocs(docs);
	}

	/**
	 * Save an existing Docs entity
	 * 
	 */
	@RequestMapping(value = "/Docs", method = RequestMethod.PUT)
	@ResponseBody
	public Docs saveDocs(@RequestBody Docs docs) {
		docsService.saveDocs(docs);
		return docsDAO.findDocsByPrimaryKey(docs.getDocId());
	}
}