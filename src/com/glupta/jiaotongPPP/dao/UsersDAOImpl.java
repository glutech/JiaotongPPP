package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Users;

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
 * DAO to manage Users entities.
 * 
 */
@Repository("UsersDAO")
@Transactional
public class UsersDAOImpl extends AbstractJpaDao<Users> implements UsersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Users.class }));

	/**
	 * EntityManager injected by Spring for persistence unit PPP_database_Connection
	 *
	 */
	@PersistenceContext(unitName = "PPP_database_Connection")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsersDAOImpl
	 *
	 */
	public UsersDAOImpl() {
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
	 * JPQL Query - findUsersByUserPwdContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserPwdContaining(String userPwd) throws DataAccessException {

		return findUsersByUserPwdContaining(userPwd, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserPwdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserPwdContaining(String userPwd, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserPwdContaining", startResult, maxRows, userPwd);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserTypeContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserTypeContaining(String userType) throws DataAccessException {

		return findUsersByUserTypeContaining(userType, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserTypeContaining(String userType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserTypeContaining", startResult, maxRows, userType);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserAddressContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserAddressContaining(String userAddress) throws DataAccessException {

		return findUsersByUserAddressContaining(userAddress, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserAddressContaining(String userAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserAddressContaining", startResult, maxRows, userAddress);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	@Transactional
	public Set<Users> findAllUserss() throws DataAccessException {

		return findAllUserss(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserss", startResult, maxRows);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserAddress
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserAddress(String userAddress) throws DataAccessException {

		return findUsersByUserAddress(userAddress, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserAddress(String userAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserAddress", startResult, maxRows, userAddress);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserEmailContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserEmailContaining(String userEmail) throws DataAccessException {

		return findUsersByUserEmailContaining(userEmail, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserEmailContaining(String userEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserEmailContaining", startResult, maxRows, userEmail);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserBelong
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserBelong(Integer userBelong) throws DataAccessException {

		return findUsersByUserBelong(userBelong, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserBelong
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserBelong(Integer userBelong, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserBelong", startResult, maxRows, userBelong);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserName
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserName(String userName) throws DataAccessException {

		return findUsersByUserName(userName, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserName(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserName", startResult, maxRows, userName);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserEmail
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserEmail(String userEmail) throws DataAccessException {

		return findUsersByUserEmail(userEmail, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserEmail(String userEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserEmail", startResult, maxRows, userEmail);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserNameContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserNameContaining(String userName) throws DataAccessException {

		return findUsersByUserNameContaining(userName, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserNameContaining(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserNameContaining", startResult, maxRows, userName);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserContact
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserContact(String userContact) throws DataAccessException {

		return findUsersByUserContact(userContact, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserContact
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserContact(String userContact, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserContact", startResult, maxRows, userContact);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserType
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserType(String userType) throws DataAccessException {

		return findUsersByUserType(userType, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserType(String userType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserType", startResult, maxRows, userType);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserContactContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserContactContaining(String userContact) throws DataAccessException {

		return findUsersByUserContactContaining(userContact, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserContactContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserContactContaining(String userContact, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserContactContaining", startResult, maxRows, userContact);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUserId
	 *
	 */
	@Transactional
	public Users findUsersByUserId(Integer userId) throws DataAccessException {

		return findUsersByUserId(userId, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserId
	 *
	 */

	@Transactional
	public Users findUsersByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByUserId", startResult, maxRows, userId);
			return (com.glupta.jiaotongPPP.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	@Transactional
	public Users findUsersByPrimaryKey(Integer userId) throws DataAccessException {

		return findUsersByPrimaryKey(userId, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */

	@Transactional
	public Users findUsersByPrimaryKey(Integer userId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByPrimaryKey", startResult, maxRows, userId);
			return (com.glupta.jiaotongPPP.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByUserPwd
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUserPwd(String userPwd) throws DataAccessException {

		return findUsersByUserPwd(userPwd, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserPwd
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUserPwd(String userPwd, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUserPwd", startResult, maxRows, userPwd);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Users entity) {
		return true;
	}
}
