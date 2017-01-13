package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Experts;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Experts entities.
 * 
 */
public interface ExpertsDAO extends JpaDao<Experts> {

	/**
	 * JPQL Query - findExpertsByExpertFromContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertFromContaining(String expertFrom) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertFromContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertFromContaining(String expertFrom, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertSpecialityContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertSpecialityContaining(String expertSpeciality) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertSpecialityContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertSpecialityContaining(String expertSpeciality, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertEmailContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertEmailContaining(String expertEmail) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertEmailContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertEmailContaining(String expertEmail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllExpertss
	 *
	 */
	public Set<Experts> findAllExpertss() throws DataAccessException;

	/**
	 * JPQL Query - findAllExpertss
	 *
	 */
	public Set<Experts> findAllExpertss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertEmail
	 *
	 */
	public Set<Experts> findExpertsByExpertEmail(String expertEmail_1) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertEmail
	 *
	 */
	public Set<Experts> findExpertsByExpertEmail(String expertEmail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertContactContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertContactContaining(String expertContact) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertContactContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertContactContaining(String expertContact, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertNameContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertNameContaining(String expertName) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertNameContaining
	 *
	 */
	public Set<Experts> findExpertsByExpertNameContaining(String expertName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertName
	 *
	 */
	public Set<Experts> findExpertsByExpertName(String expertName_1) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertName
	 *
	 */
	public Set<Experts> findExpertsByExpertName(String expertName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertContact
	 *
	 */
	public Set<Experts> findExpertsByExpertContact(String expertContact_1) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertContact
	 *
	 */
	public Set<Experts> findExpertsByExpertContact(String expertContact_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByPrimaryKey
	 *
	 */
	public Experts findExpertsByPrimaryKey(Integer expertId) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByPrimaryKey
	 *
	 */
	public Experts findExpertsByPrimaryKey(Integer expertId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertId
	 *
	 */
	public Experts findExpertsByExpertId(Integer expertId_1) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertId
	 *
	 */
	public Experts findExpertsByExpertId(Integer expertId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertFrom
	 *
	 */
	public Set<Experts> findExpertsByExpertFrom(String expertFrom_1) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertFrom
	 *
	 */
	public Set<Experts> findExpertsByExpertFrom(String expertFrom_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertSpeciality
	 *
	 */
	public Set<Experts> findExpertsByExpertSpeciality(String expertSpeciality_1) throws DataAccessException;

	/**
	 * JPQL Query - findExpertsByExpertSpeciality
	 *
	 */
	public Set<Experts> findExpertsByExpertSpeciality(String expertSpeciality_1, int startResult, int maxRows) throws DataAccessException;

}