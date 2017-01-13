package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Orgnizations;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Orgnizations entities.
 * 
 */
public interface OrgnizationsDAO extends JpaDao<Orgnizations> {

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustryContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgIndustryContaining(String orgIndustry) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustryContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgIndustryContaining(String orgIndustry, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgId
	 *
	 */
	public Orgnizations findOrgnizationsByOrgId(Integer orgId) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgId
	 *
	 */
	public Orgnizations findOrgnizationsByOrgId(Integer orgId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgName
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgName(String orgName) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgName
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgName(String orgName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgOverview
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgOverview(String orgOverview) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgOverview
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgOverview(String orgOverview, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnum
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgTrustnum(String orgTrustnum) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnum
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgTrustnum(String orgTrustnum, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgType
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgType(String orgType) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgType
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgType(String orgType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgTypeContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgTypeContaining(String orgType_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgTypeContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgTypeContaining(String orgType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustry
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgIndustry(String orgIndustry_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgIndustry
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgIndustry(String orgIndustry_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgPhoneContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgPhoneContaining(String orgPhone) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgPhoneContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgPhoneContaining(String orgPhone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgRep
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgRep(String orgRep) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgRep
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgRep(String orgRep, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgPhone
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgPhone(String orgPhone_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgPhone
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgPhone(String orgPhone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByPrimaryKey
	 *
	 */
	public Orgnizations findOrgnizationsByPrimaryKey(Integer orgId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByPrimaryKey
	 *
	 */
	public Orgnizations findOrgnizationsByPrimaryKey(Integer orgId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgOverviewContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgOverviewContaining(String orgOverview_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgOverviewContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgOverviewContaining(String orgOverview_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrgnizationss
	 *
	 */
	public Set<Orgnizations> findAllOrgnizationss() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrgnizationss
	 *
	 */
	public Set<Orgnizations> findAllOrgnizationss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgRepContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgRepContaining(String orgRep_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgRepContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgRepContaining(String orgRep_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgNameContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgNameContaining(String orgName_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgNameContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgNameContaining(String orgName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnumContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgTrustnumContaining(String orgTrustnum_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrgnizationsByOrgTrustnumContaining
	 *
	 */
	public Set<Orgnizations> findOrgnizationsByOrgTrustnumContaining(String orgTrustnum_1, int startResult, int maxRows) throws DataAccessException;

}