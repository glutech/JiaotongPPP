package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.News;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage News entities.
 * 
 */
public interface NewsDAO extends JpaDao<News> {

	/**
	 * JPQL Query - findNewsByNewsTitleContaining
	 *
	 */
	public Set<News> findNewsByNewsTitleContaining(String newsTitle) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTitleContaining
	 *
	 */
	public Set<News> findNewsByNewsTitleContaining(String newsTitle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsType
	 *
	 */
	public Set<News> findNewsByNewsType(String newsType) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsType
	 *
	 */
	public Set<News> findNewsByNewsType(String newsType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsContent
	 *
	 */
	public Set<News> findNewsByNewsContent(String newsContent) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsContent
	 *
	 */
	public Set<News> findNewsByNewsContent(String newsContent, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsId
	 *
	 */
	public News findNewsByNewsId(Integer newsId) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsId
	 *
	 */
	public News findNewsByNewsId(Integer newsId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTime
	 *
	 */
	public Set<News> findNewsByNewsTime(java.util.Calendar newsTime) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTime
	 *
	 */
	public Set<News> findNewsByNewsTime(Calendar newsTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTypeContaining
	 *
	 */
	public Set<News> findNewsByNewsTypeContaining(String newsType_1) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTypeContaining
	 *
	 */
	public Set<News> findNewsByNewsTypeContaining(String newsType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByPrimaryKey
	 *
	 */
	public News findNewsByPrimaryKey(Integer newsId_1) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByPrimaryKey
	 *
	 */
	public News findNewsByPrimaryKey(Integer newsId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllNewss
	 *
	 */
	public Set<News> findAllNewss() throws DataAccessException;

	/**
	 * JPQL Query - findAllNewss
	 *
	 */
	public Set<News> findAllNewss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsAuthor
	 *
	 */
	public Set<News> findNewsByNewsAuthor(Integer newsAuthor) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsAuthor
	 *
	 */
	public Set<News> findNewsByNewsAuthor(Integer newsAuthor, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTitle
	 *
	 */
	public Set<News> findNewsByNewsTitle(String newsTitle_1) throws DataAccessException;

	/**
	 * JPQL Query - findNewsByNewsTitle
	 *
	 */
	public Set<News> findNewsByNewsTitle(String newsTitle_1, int startResult, int maxRows) throws DataAccessException;

}