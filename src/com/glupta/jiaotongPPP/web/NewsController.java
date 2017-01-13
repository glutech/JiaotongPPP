package com.glupta.jiaotongPPP.web;

import com.glupta.jiaotongPPP.dao.NewsDAO;

import com.glupta.jiaotongPPP.domain.News;

import com.glupta.jiaotongPPP.service.NewsService;

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
 * Spring MVC controller that handles CRUD requests for News entities
 * 
 */

@Controller("NewsController")
public class NewsController {

	/**
	 * DAO injected by Spring that manages News entities
	 * 
	 */
	@Autowired
	private NewsDAO newsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for News entities
	 * 
	 */
	@Autowired
	private NewsService newsService;

	/**
	 * Entry point to show all News entities
	 * 
	 */
	public String indexNews() {
		return "redirect:/indexNews";
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
	 */
	@RequestMapping("/newsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the News entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteNews")
	public ModelAndView confirmDeleteNews(@RequestParam Integer newsIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("news", newsDAO.findNewsByPrimaryKey(newsIdKey));
		mav.setViewName("news/deleteNews.jsp");

		return mav;
	}

	/**
	 * Delete an existing News entity
	 * 
	 */
	@RequestMapping("/deleteNews")
	public String deleteNews(@RequestParam Integer newsIdKey) {
		News news = newsDAO.findNewsByPrimaryKey(newsIdKey);
		newsService.deleteNews(news);
		return "forward:/indexNews";
	}

	/**
	 * Show all News entities
	 * 
	 */
	@RequestMapping("/indexNews")
	public ModelAndView listNewss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("newss", newsService.loadNewss());

		mav.setViewName("news/listNewss.jsp");

		return mav;
	}

	/**
	 * Save an existing News entity
	 * 
	 */
	@RequestMapping("/saveNews")
	public String saveNews(@ModelAttribute News news) {
		newsService.saveNews(news);
		return "forward:/indexNews";
	}

	/**
	 * Select an existing News entity
	 * 
	 */
	@RequestMapping("/selectNews")
	public ModelAndView selectNews(@RequestParam Integer newsIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("news", newsDAO.findNewsByPrimaryKey(newsIdKey));
		mav.setViewName("news/viewNews.jsp");

		return mav;
	}

	/**
	 * Create a new News entity
	 * 
	 */
	@RequestMapping("/newNews")
	public ModelAndView newNews() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("news", new News());
		mav.addObject("newFlag", true);
		mav.setViewName("news/editNews.jsp");

		return mav;
	}

	/**
	 * Edit an existing News entity
	 * 
	 */
	@RequestMapping("/editNews")
	public ModelAndView editNews(@RequestParam Integer newsIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("news", newsDAO.findNewsByPrimaryKey(newsIdKey));
		mav.setViewName("news/editNews.jsp");

		return mav;
	}
}