package com.glupta.jiaotongPPP.web.rest;

import com.glupta.jiaotongPPP.dao.NewsDAO;

import com.glupta.jiaotongPPP.domain.News;

import com.glupta.jiaotongPPP.service.NewsService;

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
 * Spring Rest controller that handles CRUD requests for News entities
 * 
 */

@Controller("NewsRestController")
public class NewsRestController {

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
	 * Create a new News entity
	 * 
	 */
	@RequestMapping(value = "/News", method = RequestMethod.POST)
	@ResponseBody
	public News newNews(@RequestBody News news) {
		newsService.saveNews(news);
		return newsDAO.findNewsByPrimaryKey(news.getNewsId());
	}

	/**
	 * Delete an existing News entity
	 * 
	 */
	@RequestMapping(value = "/News/{news_newsId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteNews(@PathVariable Integer news_newsId) {
		News news = newsDAO.findNewsByPrimaryKey(news_newsId);
		newsService.deleteNews(news);
	}

	/**
	 * Show all News entities
	 * 
	 */
	@RequestMapping(value = "/News", method = RequestMethod.GET)
	@ResponseBody
	public List<News> listNewss() {
		return new java.util.ArrayList<News>(newsService.loadNewss());
	}

	/**
	 * Save an existing News entity
	 * 
	 */
	@RequestMapping(value = "/News", method = RequestMethod.PUT)
	@ResponseBody
	public News saveNews(@RequestBody News news) {
		newsService.saveNews(news);
		return newsDAO.findNewsByPrimaryKey(news.getNewsId());
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
	 * Select an existing News entity
	 * 
	 */
	@RequestMapping(value = "/News/{news_newsId}", method = RequestMethod.GET)
	@ResponseBody
	public News loadNews(@PathVariable Integer news_newsId) {
		return newsDAO.findNewsByPrimaryKey(news_newsId);
	}
}