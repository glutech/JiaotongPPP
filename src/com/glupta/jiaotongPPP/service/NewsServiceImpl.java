package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.dao.NewsDAO;

import com.glupta.jiaotongPPP.domain.News;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for News entities
 * 
 */

@Service("NewsService")
@Transactional
public class NewsServiceImpl implements NewsService {

	/**
	 * DAO injected by Spring that manages News entities
	 * 
	 */
	@Autowired
	private NewsDAO newsDAO;

	/**
	 * Instantiates a new NewsServiceImpl.
	 *
	 */
	public NewsServiceImpl() {
	}

	/**
	 * Return all News entity
	 * 
	 */
	@Transactional
	public List<News> findAllNewss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<News>(newsDAO.findAllNewss(startResult, maxRows));
	}

	/**
	 * Delete an existing News entity
	 * 
	 */
	@Transactional
	public void deleteNews(News news) {
		newsDAO.remove(news);
		newsDAO.flush();
	}

	/**
	 * Load an existing News entity
	 * 
	 */
	@Transactional
	public Set<News> loadNewss() {
		return newsDAO.findAllNewss();
	}

	/**
	 */
	@Transactional
	public News findNewsByPrimaryKey(Integer newsId) {
		return newsDAO.findNewsByPrimaryKey(newsId);
	}

	/**
	 * Save an existing News entity
	 * 
	 */
	@Transactional
	public void saveNews(News news) {
		News existingNews = newsDAO.findNewsByPrimaryKey(news.getNewsId());

		if (existingNews != null) {
			if (existingNews != news) {
				existingNews.setNewsId(news.getNewsId());
				existingNews.setNewsTitle(news.getNewsTitle());
				existingNews.setNewsContent(news.getNewsContent());
				existingNews.setNewsType(news.getNewsType());
				existingNews.setNewsTime(news.getNewsTime());
				existingNews.setNewsAuthor(news.getNewsAuthor());
			}
			news = newsDAO.store(existingNews);
		} else {
			news = newsDAO.store(news);
		}
		newsDAO.flush();
	}

	/**
	 * Return a count of all News entity
	 * 
	 */
	@Transactional
	public Integer countNewss() {
		return ((Long) newsDAO.createQuerySingleResult("select count(o) from News o").getSingleResult()).intValue();
	}
}
