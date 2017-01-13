package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Orgnizations;

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
 * DAO to manage Orgnizations entities.
 * 
 */
@Repository("OrgnizationsDAO")
@Transactional
public class OrgnizationsDAOImpl extends AbstractJpaDao<Orgnizations> implements
		OrgnizationsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Orgnizations.class }));

	/**
	 * EntityManager injected by Spring for persistence unit PPP_database_Connection
	 *
	 */
	@PersistenceContext(unitName = "PPP_database_Connection")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrgnizationsDAOImpl
	 *
	 */
	public OrgnizationsDAOImpl() {
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
	 * JPQL Query - findOrgnizationsByOrgIndustryContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgIndustryContaining(String orgIndustry) throws DataAccessException {

		return findOrgnizationsByOrgIndustryContaining(orgIndustry, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgIndustryContaining(String orgIndustry, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgIndustryContaining", startResult, maxRows, orgIndustry);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgId
	 *
	 */
	@Transactional
	public Orgnizations findOrgnizationsByOrgId(Integer orgId) throws DataAccessException {

		return findOrgnizationsByOrgId(orgId, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgId
	 *
	 */

	@Transactional
	public Orgnizations findOrgnizationsByOrgId(Integer orgId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrgnizationsByOrgId", startResult, maxRows, orgId);
			return (com.glupta.jiaotongPPP.domain.Orgnizations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgName
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgName(String orgName) throws DataAccessException {

		return findOrgnizationsByOrgName(orgName, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgName(String orgName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgName", startResult, maxRows, orgName);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgOverview
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgOverview(String orgOverview) throws DataAccessException {

		return findOrgnizationsByOrgOverview(orgOverview, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgOverview
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgOverview(String orgOverview, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgOverview", startResult, maxRows, orgOverview);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnum
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgTrustnum(String orgTrustnum) throws DataAccessException {

		return findOrgnizationsByOrgTrustnum(orgTrustnum, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnum
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgTrustnum(String orgTrustnum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgTrustnum", startResult, maxRows, orgTrustnum);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgType
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgType(String orgType) throws DataAccessException {

		return findOrgnizationsByOrgType(orgType, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgType(String orgType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgType", startResult, maxRows, orgType);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgTypeContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgTypeContaining(String orgType) throws DataAccessException {

		return findOrgnizationsByOrgTypeContaining(orgType, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgTypeContaining(String orgType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgTypeContaining", startResult, maxRows, orgType);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustry
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgIndustry(String orgIndustry) throws DataAccessException {

		return findOrgnizationsByOrgIndustry(orgIndustry, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustry
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgIndustry(String orgIndustry, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgIndustry", startResult, maxRows, orgIndustry);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgPhoneContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgPhoneContaining(String orgPhone) throws DataAccessException {

		return findOrgnizationsByOrgPhoneContaining(orgPhone, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgPhoneContaining(String orgPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgPhoneContaining", startResult, maxRows, orgPhone);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgRep
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgRep(String orgRep) throws DataAccessException {

		return findOrgnizationsByOrgRep(orgRep, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgRep
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgRep(String orgRep, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgRep", startResult, maxRows, orgRep);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgPhone
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgPhone(String orgPhone) throws DataAccessException {

		return findOrgnizationsByOrgPhone(orgPhone, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgPhone(String orgPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgPhone", startResult, maxRows, orgPhone);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByPrimaryKey
	 *
	 */
	@Transactional
	public Orgnizations findOrgnizationsByPrimaryKey(Integer orgId) throws DataAccessException {

		return findOrgnizationsByPrimaryKey(orgId, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByPrimaryKey
	 *
	 */

	@Transactional
	public Orgnizations findOrgnizationsByPrimaryKey(Integer orgId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrgnizationsByPrimaryKey", startResult, maxRows, orgId);
			return (com.glupta.jiaotongPPP.domain.Orgnizations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgOverviewContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgOverviewContaining(String orgOverview) throws DataAccessException {

		return findOrgnizationsByOrgOverviewContaining(orgOverview, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgOverviewContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgOverviewContaining(String orgOverview, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgOverviewContaining", startResult, maxRows, orgOverview);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrgnizationss
	 *
	 */
	@Transactional
	public Set<Orgnizations> findAllOrgnizationss() throws DataAccessException {

		return findAllOrgnizationss(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrgnizationss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findAllOrgnizationss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrgnizationss", startResult, maxRows);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgRepContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgRepContaining(String orgRep) throws DataAccessException {

		return findOrgnizationsByOrgRepContaining(orgRep, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgRepContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgRepContaining(String orgRep, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgRepContaining", startResult, maxRows, orgRep);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgNameContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgNameContaining(String orgName) throws DataAccessException {

		return findOrgnizationsByOrgNameContaining(orgName, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgNameContaining(String orgName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgNameContaining", startResult, maxRows, orgName);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnumContaining
	 *
	 */
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgTrustnumContaining(String orgTrustnum) throws DataAccessException {

		return findOrgnizationsByOrgTrustnumContaining(orgTrustnum, -1, -1);
	}

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnumContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgnizations> findOrgnizationsByOrgTrustnumContaining(String orgTrustnum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgnizationsByOrgTrustnumContaining", startResult, maxRows, orgTrustnum);
		return new LinkedHashSet<Orgnizations>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Orgnizations entity) {
		return true;
	}
}
