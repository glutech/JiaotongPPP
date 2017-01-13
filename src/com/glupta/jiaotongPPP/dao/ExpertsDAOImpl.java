package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Experts;

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
 * DAO to manage Experts entities.
 * 
 */
@Repository("ExpertsDAO")
@Transactional
public class ExpertsDAOImpl extends AbstractJpaDao<Experts> implements
		ExpertsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Experts.class }));

	/**
	 * EntityManager injected by Spring for persistence unit PPP_database_Connection
	 *
	 */
	@PersistenceContext(unitName = "PPP_database_Connection")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ExpertsDAOImpl
	 *
	 */
	public ExpertsDAOImpl() {
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
	 * JPQL Query - findExpertsByExpertFromContaining
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertFromContaining(String expertFrom) throws DataAccessException {

		return findExpertsByExpertFromContaining(expertFrom, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertFromContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertFromContaining(String expertFrom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertFromContaining", startResult, maxRows, expertFrom);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertSpecialityContaining
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertSpecialityContaining(String expertSpeciality) throws DataAccessException {

		return findExpertsByExpertSpecialityContaining(expertSpeciality, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertSpecialityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertSpecialityContaining(String expertSpeciality, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertSpecialityContaining", startResult, maxRows, expertSpeciality);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertEmailContaining
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertEmailContaining(String expertEmail) throws DataAccessException {

		return findExpertsByExpertEmailContaining(expertEmail, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertEmailContaining(String expertEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertEmailContaining", startResult, maxRows, expertEmail);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllExpertss
	 *
	 */
	@Transactional
	public Set<Experts> findAllExpertss() throws DataAccessException {

		return findAllExpertss(-1, -1);
	}

	/**
	 * JPQL Query - findAllExpertss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findAllExpertss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllExpertss", startResult, maxRows);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertEmail
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertEmail(String expertEmail) throws DataAccessException {

		return findExpertsByExpertEmail(expertEmail, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertEmail(String expertEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertEmail", startResult, maxRows, expertEmail);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertContactContaining
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertContactContaining(String expertContact) throws DataAccessException {

		return findExpertsByExpertContactContaining(expertContact, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertContactContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertContactContaining(String expertContact, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertContactContaining", startResult, maxRows, expertContact);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertNameContaining
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertNameContaining(String expertName) throws DataAccessException {

		return findExpertsByExpertNameContaining(expertName, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertNameContaining(String expertName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertNameContaining", startResult, maxRows, expertName);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertName
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertName(String expertName) throws DataAccessException {

		return findExpertsByExpertName(expertName, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertName(String expertName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertName", startResult, maxRows, expertName);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertContact
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertContact(String expertContact) throws DataAccessException {

		return findExpertsByExpertContact(expertContact, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertContact
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertContact(String expertContact, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertContact", startResult, maxRows, expertContact);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByPrimaryKey
	 *
	 */
	@Transactional
	public Experts findExpertsByPrimaryKey(Integer expertId) throws DataAccessException {

		return findExpertsByPrimaryKey(expertId, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByPrimaryKey
	 *
	 */

	@Transactional
	public Experts findExpertsByPrimaryKey(Integer expertId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findExpertsByPrimaryKey", startResult, maxRows, expertId);
			return (com.glupta.jiaotongPPP.domain.Experts) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findExpertsByExpertId
	 *
	 */
	@Transactional
	public Experts findExpertsByExpertId(Integer expertId) throws DataAccessException {

		return findExpertsByExpertId(expertId, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertId
	 *
	 */

	@Transactional
	public Experts findExpertsByExpertId(Integer expertId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findExpertsByExpertId", startResult, maxRows, expertId);
			return (com.glupta.jiaotongPPP.domain.Experts) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findExpertsByExpertFrom
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertFrom(String expertFrom) throws DataAccessException {

		return findExpertsByExpertFrom(expertFrom, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertFrom
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertFrom(String expertFrom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertFrom", startResult, maxRows, expertFrom);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * JPQL Query - findExpertsByExpertSpeciality
	 *
	 */
	@Transactional
	public Set<Experts> findExpertsByExpertSpeciality(String expertSpeciality) throws DataAccessException {

		return findExpertsByExpertSpeciality(expertSpeciality, -1, -1);
	}

	/**
	 * JPQL Query - findExpertsByExpertSpeciality
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Experts> findExpertsByExpertSpeciality(String expertSpeciality, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findExpertsByExpertSpeciality", startResult, maxRows, expertSpeciality);
		return new LinkedHashSet<Experts>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Experts entity) {
		return true;
	}
}
