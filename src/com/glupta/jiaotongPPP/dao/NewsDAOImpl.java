package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.News;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage News entities.
 * 
 */
@Repository("NewsDAO")
@Transactional
public class NewsDAOImpl extends AbstractJpaDao<News> implements NewsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { News.class }));

	/**
	 * EntityManager injected by Spring for persistence unit PPP_database_Connection
	 *
	 */
	@PersistenceContext(unitName = "PPP_database_Connection")
	private EntityManager entityManager;

	/**
	 * Instantiates a new NewsDAOImpl
	 *
	 */
	public NewsDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findNewsByNewsTitleContaining
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsTitleContaining(String newsTitle) throws DataAccessException {

		return findNewsByNewsTitleContaining(newsTitle, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsTitleContaining(String newsTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsTitleContaining", startResult, maxRows, newsTitle);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByNewsType
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsType(String newsType) throws DataAccessException {

		return findNewsByNewsType(newsType, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsType(String newsType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsType", startResult, maxRows, newsType);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByNewsContent
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsContent(String newsContent) throws DataAccessException {

		return findNewsByNewsContent(newsContent, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsContent(String newsContent, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsContent", startResult, maxRows, newsContent);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByNewsId
	 *
	 */
	@Transactional
	public News findNewsByNewsId(Integer newsId) throws DataAccessException {

		return findNewsByNewsId(newsId, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsId
	 *
	 */

	@Transactional
	public News findNewsByNewsId(Integer newsId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findNewsByNewsId", startResult, maxRows, newsId);
			return (com.glupta.jiaotongPPP.domain.News) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findNewsByNewsTime
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsTime(java.util.Calendar newsTime) throws DataAccessException {

		return findNewsByNewsTime(newsTime, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsTime(java.util.Calendar newsTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsTime", startResult, maxRows, newsTime);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByNewsTypeContaining
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsTypeContaining(String newsType) throws DataAccessException {

		return findNewsByNewsTypeContaining(newsType, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsTypeContaining(String newsType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsTypeContaining", startResult, maxRows, newsType);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByPrimaryKey
	 *
	 */
	@Transactional
	public News findNewsByPrimaryKey(Integer newsId) throws DataAccessException {

		return findNewsByPrimaryKey(newsId, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByPrimaryKey
	 *
	 */

	@Transactional
	public News findNewsByPrimaryKey(Integer newsId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findNewsByPrimaryKey", startResult, maxRows, newsId);
			return (com.glupta.jiaotongPPP.domain.News) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllNewss
	 *
	 */
	@Transactional
	public Set<News> findAllNewss() throws DataAccessException {

		return findAllNewss(-1, -1);
	}

	/**
	 * JPQL Query - findAllNewss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findAllNewss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllNewss", startResult, maxRows);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByNewsAuthor
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsAuthor(Integer newsAuthor) throws DataAccessException {

		return findNewsByNewsAuthor(newsAuthor, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsAuthor
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsAuthor(Integer newsAuthor, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsAuthor", startResult, maxRows, newsAuthor);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * JPQL Query - findNewsByNewsTitle
	 *
	 */
	@Transactional
	public Set<News> findNewsByNewsTitle(String newsTitle) throws DataAccessException {

		return findNewsByNewsTitle(newsTitle, -1, -1);
	}

	/**
	 * JPQL Query - findNewsByNewsTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<News> findNewsByNewsTitle(String newsTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNewsByNewsTitle", startResult, maxRows, newsTitle);
		return new LinkedHashSet<News>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(News entity) {
		return true;
	}
}
