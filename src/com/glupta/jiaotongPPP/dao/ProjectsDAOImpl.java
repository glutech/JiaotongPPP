package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Projects;

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
 * DAO to manage Projects entities.
 * 
 */
@Repository("ProjectsDAO")
@Transactional
public class ProjectsDAOImpl extends AbstractJpaDao<Projects> implements
		ProjectsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Projects.class }));

	/**
	 * EntityManager injected by Spring for persistence unit PPP_database_Connection
	 *
	 */
	@PersistenceContext(unitName = "PPP_database_Connection")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProjectsDAOImpl
	 *
	 */
	public ProjectsDAOImpl() {
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
	 * JPQL Query - findProjectsByProjectStartType
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectStartType(String projectStartType) throws DataAccessException {

		return findProjectsByProjectStartType(projectStartType, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectStartType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectStartType(String projectStartType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectStartType", startResult, maxRows, projectStartType);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectRewardType
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectRewardType(String projectRewardType) throws DataAccessException {

		return findProjectsByProjectRewardType(projectRewardType, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectRewardType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectRewardType(String projectRewardType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectRewardType", startResult, maxRows, projectRewardType);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectId
	 *
	 */
	@Transactional
	public Projects findProjectsByProjectId(Integer projectId) throws DataAccessException {

		return findProjectsByProjectId(projectId, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectId
	 *
	 */

	@Transactional
	public Projects findProjectsByProjectId(Integer projectId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProjectsByProjectId", startResult, maxRows, projectId);
			return (com.glupta.jiaotongPPP.domain.Projects) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProjectsByProjectContact
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectContact(String projectContact) throws DataAccessException {

		return findProjectsByProjectContact(projectContact, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectContact
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectContact(String projectContact, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectContact", startResult, maxRows, projectContact);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectCooptime
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectCooptime(Integer projectCooptime) throws DataAccessException {

		return findProjectsByProjectCooptime(projectCooptime, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectCooptime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectCooptime(Integer projectCooptime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectCooptime", startResult, maxRows, projectCooptime);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTimeAfter
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectStartTimeAfter(java.util.Calendar projectStartTime) throws DataAccessException {

		return findProjectsByProjectStartTimeAfter(projectStartTime, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTimeAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectStartTimeAfter(java.util.Calendar projectStartTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectStartTimeAfter", startResult, maxRows, projectStartTime);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByPrimaryKey
	 *
	 */
	@Transactional
	public Projects findProjectsByPrimaryKey(Integer projectId) throws DataAccessException {

		return findProjectsByPrimaryKey(projectId, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByPrimaryKey
	 *
	 */

	@Transactional
	public Projects findProjectsByPrimaryKey(Integer projectId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProjectsByPrimaryKey", startResult, maxRows, projectId);
			return (com.glupta.jiaotongPPP.domain.Projects) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProjectsByProjectName
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectName(String projectName) throws DataAccessException {

		return findProjectsByProjectName(projectName, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectName(String projectName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectName", startResult, maxRows, projectName);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectTypeContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectTypeContaining(String projectType) throws DataAccessException {

		return findProjectsByProjectTypeContaining(projectType, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectTypeContaining(String projectType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectTypeContaining", startResult, maxRows, projectType);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectPilotNumContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectPilotNumContaining(String projectPilotNum) throws DataAccessException {

		return findProjectsByProjectPilotNumContaining(projectPilotNum, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectPilotNumContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectPilotNumContaining(String projectPilotNum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectPilotNumContaining", startResult, maxRows, projectPilotNum);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectOverviewContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectOverviewContaining(String projectOverview) throws DataAccessException {

		return findProjectsByProjectOverviewContaining(projectOverview, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectOverviewContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectOverviewContaining(String projectOverview, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectOverviewContaining", startResult, maxRows, projectOverview);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectContactPhone
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectContactPhone(String projectContactPhone) throws DataAccessException {

		return findProjectsByProjectContactPhone(projectContactPhone, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectContactPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectContactPhone(String projectContactPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectContactPhone", startResult, maxRows, projectContactPhone);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTypeContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectStartTypeContaining(String projectStartType) throws DataAccessException {

		return findProjectsByProjectStartTypeContaining(projectStartType, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectStartTypeContaining(String projectStartType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectStartTypeContaining", startResult, maxRows, projectStartType);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTimeBefore
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectStartTimeBefore(java.util.Calendar projectStartTime) throws DataAccessException {

		return findProjectsByProjectStartTimeBefore(projectStartTime, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTimeBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectStartTimeBefore(java.util.Calendar projectStartTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectStartTimeBefore", startResult, maxRows, projectStartTime);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectRecomLevel
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectRecomLevel(String projectRecomLevel) throws DataAccessException {

		return findProjectsByProjectRecomLevel(projectRecomLevel, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectRecomLevel
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectRecomLevel(String projectRecomLevel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectRecomLevel", startResult, maxRows, projectRecomLevel);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectNameContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectNameContaining(String projectName) throws DataAccessException {

		return findProjectsByProjectNameContaining(projectName, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectNameContaining(String projectName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectNameContaining", startResult, maxRows, projectName);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectOverview
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectOverview(String projectOverview) throws DataAccessException {

		return findProjectsByProjectOverview(projectOverview, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectOverview
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectOverview(String projectOverview, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectOverview", startResult, maxRows, projectOverview);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectContactPhoneContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectContactPhoneContaining(String projectContactPhone) throws DataAccessException {

		return findProjectsByProjectContactPhoneContaining(projectContactPhone, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectContactPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectContactPhoneContaining(String projectContactPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectContactPhoneContaining", startResult, maxRows, projectContactPhone);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectInvestment
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectInvestment(java.math.BigDecimal projectInvestment) throws DataAccessException {

		return findProjectsByProjectInvestment(projectInvestment, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectInvestment
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectInvestment(java.math.BigDecimal projectInvestment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectInvestment", startResult, maxRows, projectInvestment);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectContactContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectContactContaining(String projectContact) throws DataAccessException {

		return findProjectsByProjectContactContaining(projectContact, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectContactContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectContactContaining(String projectContact, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectContactContaining", startResult, maxRows, projectContact);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectRewardTypeContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectRewardTypeContaining(String projectRewardType) throws DataAccessException {

		return findProjectsByProjectRewardTypeContaining(projectRewardType, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectRewardTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectRewardTypeContaining(String projectRewardType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectRewardTypeContaining", startResult, maxRows, projectRewardType);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectModeContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectModeContaining(String projectMode) throws DataAccessException {

		return findProjectsByProjectModeContaining(projectMode, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectModeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectModeContaining(String projectMode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectModeContaining", startResult, maxRows, projectMode);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProjectss
	 *
	 */
	@Transactional
	public Set<Projects> findAllProjectss() throws DataAccessException {

		return findAllProjectss(-1, -1);
	}

	/**
	 * JPQL Query - findAllProjectss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findAllProjectss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProjectss", startResult, maxRows);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectMode
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectMode(String projectMode) throws DataAccessException {

		return findProjectsByProjectMode(projectMode, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectMode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectMode(String projectMode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectMode", startResult, maxRows, projectMode);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectRecomLevelContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectRecomLevelContaining(String projectRecomLevel) throws DataAccessException {

		return findProjectsByProjectRecomLevelContaining(projectRecomLevel, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectRecomLevelContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectRecomLevelContaining(String projectRecomLevel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectRecomLevelContaining", startResult, maxRows, projectRecomLevel);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTime
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectStartTime(java.util.Calendar projectStartTime) throws DataAccessException {

		return findProjectsByProjectStartTime(projectStartTime, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectStartTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectStartTime(java.util.Calendar projectStartTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectStartTime", startResult, maxRows, projectStartTime);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectAreaContaining
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectAreaContaining(String projectArea) throws DataAccessException {

		return findProjectsByProjectAreaContaining(projectArea, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectAreaContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectAreaContaining(String projectArea, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectAreaContaining", startResult, maxRows, projectArea);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectArea
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectArea(String projectArea) throws DataAccessException {

		return findProjectsByProjectArea(projectArea, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectArea
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectArea(String projectArea, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectArea", startResult, maxRows, projectArea);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectPilotNum
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectPilotNum(String projectPilotNum) throws DataAccessException {

		return findProjectsByProjectPilotNum(projectPilotNum, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectPilotNum
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectPilotNum(String projectPilotNum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectPilotNum", startResult, maxRows, projectPilotNum);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * JPQL Query - findProjectsByProjectType
	 *
	 */
	@Transactional
	public Set<Projects> findProjectsByProjectType(String projectType) throws DataAccessException {

		return findProjectsByProjectType(projectType, -1, -1);
	}

	/**
	 * JPQL Query - findProjectsByProjectType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Projects> findProjectsByProjectType(String projectType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProjectsByProjectType", startResult, maxRows, projectType);
		return new LinkedHashSet<Projects>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Projects entity) {
		return true;
	}
}
