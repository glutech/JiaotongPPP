package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.News;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for News entities
 * 
 */
public interface NewsService {

	/**
	 * Return all News entity
	 * 
	 */
	public List<News> findAllNewss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing News entity
	 * 
	 */
	public void deleteNews(News news);

	/**
	 * Load an existing News entity
	 * 
	 */
	public Set<News> loadNewss();

	/**
	 */
	public News findNewsByPrimaryKey(Integer newsId);

	/**
	 * Save an existing News entity
	 * 
	 */
	public void saveNews(News news_1);

	/**
	 * Return a count of all News entity
	 * 
	 */
	public Integer countNewss();
}