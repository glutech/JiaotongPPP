package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Docs;

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
 * DAO to manage Docs entities.
 * 
 */
@Repository("DocsDAO")
@Transactional
public class DocsDAOImpl extends AbstractJpaDao<Docs> implements DocsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Docs.class }));

	/**
	 * EntityManager injected by Spring for persistence unit PPP_database_Connection
	 *
	 */
	@PersistenceContext(unitName = "PPP_database_Connection")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DocsDAOImpl
	 *
	 */
	public DocsDAOImpl() {
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
	 * JPQL Query - findDocsByDocId
	 *
	 */
	@Transactional
	public Docs findDocsByDocId(Integer docId) throws DataAccessException {

		return findDocsByDocId(docId, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocId
	 *
	 */

	@Transactional
	public Docs findDocsByDocId(Integer docId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDocsByDocId", startResult, maxRows, docId);
			return (com.glupta.jiaotongPPP.domain.Docs) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDocsByDocContent
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocContent(String docContent) throws DataAccessException {

		return findDocsByDocContent(docContent, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocContent(String docContent, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocContent", startResult, maxRows, docContent);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByDocNameContaining
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocNameContaining(String docName) throws DataAccessException {

		return findDocsByDocNameContaining(docName, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocNameContaining(String docName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocNameContaining", startResult, maxRows, docName);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByDocAttachmentContaining
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocAttachmentContaining(String docAttachment) throws DataAccessException {

		return findDocsByDocAttachmentContaining(docAttachment, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocAttachmentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocAttachmentContaining(String docAttachment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocAttachmentContaining", startResult, maxRows, docAttachment);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByPrimaryKey
	 *
	 */
	@Transactional
	public Docs findDocsByPrimaryKey(Integer docId) throws DataAccessException {

		return findDocsByPrimaryKey(docId, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByPrimaryKey
	 *
	 */

	@Transactional
	public Docs findDocsByPrimaryKey(Integer docId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDocsByPrimaryKey", startResult, maxRows, docId);
			return (com.glupta.jiaotongPPP.domain.Docs) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDocsByDocTypeContaining
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocTypeContaining(String docType) throws DataAccessException {

		return findDocsByDocTypeContaining(docType, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocTypeContaining(String docType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocTypeContaining", startResult, maxRows, docType);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByDocName
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocName(String docName) throws DataAccessException {

		return findDocsByDocName(docName, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocName(String docName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocName", startResult, maxRows, docName);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByDocAttachment
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocAttachment(String docAttachment) throws DataAccessException {

		return findDocsByDocAttachment(docAttachment, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocAttachment
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocAttachment(String docAttachment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocAttachment", startResult, maxRows, docAttachment);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByDocType
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocType(String docType) throws DataAccessException {

		return findDocsByDocType(docType, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocType(String docType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocType", startResult, maxRows, docType);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocsByDocOwner
	 *
	 */
	@Transactional
	public Set<Docs> findDocsByDocOwner(Integer docOwner) throws DataAccessException {

		return findDocsByDocOwner(docOwner, -1, -1);
	}

	/**
	 * JPQL Query - findDocsByDocOwner
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findDocsByDocOwner(Integer docOwner, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocsByDocOwner", startResult, maxRows, docOwner);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDocss
	 *
	 */
	@Transactional
	public Set<Docs> findAllDocss() throws DataAccessException {

		return findAllDocss(-1, -1);
	}

	/**
	 * JPQL Query - findAllDocss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Docs> findAllDocss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDocss", startResult, maxRows);
		return new LinkedHashSet<Docs>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Docs entity) {
		return true;
	}
}
