package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Projects;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Projects entities.
 * 
 */
public interface ProjectsDAO extends JpaDao<Projects> {

	/**
	 * JPQL Query - findProjectsByProjectStartType
	 *
	 */
	public Set<Projects> findProjectsByProjectStartType(String projectStartType) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartType
	 *
	 */
	public Set<Projects> findProjectsByProjectStartType(String projectStartType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRewardType
	 *
	 */
	public Set<Projects> findProjectsByProjectRewardType(String projectRewardType) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRewardType
	 *
	 */
	public Set<Projects> findProjectsByProjectRewardType(String projectRewardType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectId
	 *
	 */
	public Projects findProjectsByProjectId(Integer projectId) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectId
	 *
	 */
	public Projects findProjectsByProjectId(Integer projectId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContact
	 *
	 */
	public Set<Projects> findProjectsByProjectContact(String projectContact) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContact
	 *
	 */
	public Set<Projects> findProjectsByProjectContact(String projectContact, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectCooptime
	 *
	 */
	public Set<Projects> findProjectsByProjectCooptime(Integer projectCooptime) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectCooptime
	 *
	 */
	public Set<Projects> findProjectsByProjectCooptime(Integer projectCooptime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTimeAfter
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTimeAfter(java.util.Calendar projectStartTime) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTimeAfter
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTimeAfter(Calendar projectStartTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByPrimaryKey
	 *
	 */
	public Projects findProjectsByPrimaryKey(Integer projectId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByPrimaryKey
	 *
	 */
	public Projects findProjectsByPrimaryKey(Integer projectId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectName
	 *
	 */
	public Set<Projects> findProjectsByProjectName(String projectName) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectName
	 *
	 */
	public Set<Projects> findProjectsByProjectName(String projectName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectTypeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectTypeContaining(String projectType) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectTypeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectTypeContaining(String projectType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectPilotNumContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectPilotNumContaining(String projectPilotNum) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectPilotNumContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectPilotNumContaining(String projectPilotNum, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectOverviewContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectOverviewContaining(String projectOverview) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectOverviewContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectOverviewContaining(String projectOverview, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContactPhone
	 *
	 */
	public Set<Projects> findProjectsByProjectContactPhone(String projectContactPhone) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContactPhone
	 *
	 */
	public Set<Projects> findProjectsByProjectContactPhone(String projectContactPhone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTypeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTypeContaining(String projectStartType_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTypeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTypeContaining(String projectStartType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTimeBefore
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTimeBefore(java.util.Calendar projectStartTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTimeBefore
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTimeBefore(Calendar projectStartTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRecomLevel
	 *
	 */
	public Set<Projects> findProjectsByProjectRecomLevel(String projectRecomLevel) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRecomLevel
	 *
	 */
	public Set<Projects> findProjectsByProjectRecomLevel(String projectRecomLevel, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectNameContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectNameContaining(String projectName_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectNameContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectNameContaining(String projectName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectOverview
	 *
	 */
	public Set<Projects> findProjectsByProjectOverview(String projectOverview_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectOverview
	 *
	 */
	public Set<Projects> findProjectsByProjectOverview(String projectOverview_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContactPhoneContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectContactPhoneContaining(String projectContactPhone_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContactPhoneContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectContactPhoneContaining(String projectContactPhone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectInvestment
	 *
	 */
	public Set<Projects> findProjectsByProjectInvestment(java.math.BigDecimal projectInvestment) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectInvestment
	 *
	 */
	public Set<Projects> findProjectsByProjectInvestment(BigDecimal projectInvestment, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContactContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectContactContaining(String projectContact_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectContactContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectContactContaining(String projectContact_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRewardTypeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectRewardTypeContaining(String projectRewardType_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRewardTypeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectRewardTypeContaining(String projectRewardType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectModeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectModeContaining(String projectMode) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectModeContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectModeContaining(String projectMode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProjectss
	 *
	 */
	public Set<Projects> findAllProjectss() throws DataAccessException;

	/**
	 * JPQL Query - findAllProjectss
	 *
	 */
	public Set<Projects> findAllProjectss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectMode
	 *
	 */
	public Set<Projects> findProjectsByProjectMode(String projectMode_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectMode
	 *
	 */
	public Set<Projects> findProjectsByProjectMode(String projectMode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRecomLevelContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectRecomLevelContaining(String projectRecomLevel_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectRecomLevelContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectRecomLevelContaining(String projectRecomLevel_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTime
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTime(java.util.Calendar projectStartTime_2) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectStartTime
	 *
	 */
	public Set<Projects> findProjectsByProjectStartTime(Calendar projectStartTime_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectAreaContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectAreaContaining(String projectArea) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectAreaContaining
	 *
	 */
	public Set<Projects> findProjectsByProjectAreaContaining(String projectArea, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectArea
	 *
	 */
	public Set<Projects> findProjectsByProjectArea(String projectArea_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectArea
	 *
	 */
	public Set<Projects> findProjectsByProjectArea(String projectArea_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectPilotNum
	 *
	 */
	public Set<Projects> findProjectsByProjectPilotNum(String projectPilotNum_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectPilotNum
	 *
	 */
	public Set<Projects> findProjectsByProjectPilotNum(String projectPilotNum_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectType
	 *
	 */
	public Set<Projects> findProjectsByProjectType(String projectType_1) throws DataAccessException;

	/**
	 * JPQL Query - findProjectsByProjectType
	 *
	 */
	public Set<Projects> findProjectsByProjectType(String projectType_1, int startResult, int maxRows) throws DataAccessException;

}