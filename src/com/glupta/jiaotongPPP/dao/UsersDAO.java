package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Users;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Users entities.
 * 
 */
public interface UsersDAO extends JpaDao<Users> {

	/**
	 * JPQL Query - findUsersByUserPwdContaining
	 *
	 */
	public Set<Users> findUsersByUserPwdContaining(String userPwd) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserPwdContaining
	 *
	 */
	public Set<Users> findUsersByUserPwdContaining(String userPwd, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserTypeContaining
	 *
	 */
	public Set<Users> findUsersByUserTypeContaining(String userType) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserTypeContaining
	 *
	 */
	public Set<Users> findUsersByUserTypeContaining(String userType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserAddressContaining
	 *
	 */
	public Set<Users> findUsersByUserAddressContaining(String userAddress) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserAddressContaining
	 *
	 */
	public Set<Users> findUsersByUserAddressContaining(String userAddress, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserAddress
	 *
	 */
	public Set<Users> findUsersByUserAddress(String userAddress_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserAddress
	 *
	 */
	public Set<Users> findUsersByUserAddress(String userAddress_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserEmailContaining
	 *
	 */
	public Set<Users> findUsersByUserEmailContaining(String userEmail) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserEmailContaining
	 *
	 */
	public Set<Users> findUsersByUserEmailContaining(String userEmail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserBelong
	 *
	 */
	public Set<Users> findUsersByUserBelong(Integer userBelong) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserBelong
	 *
	 */
	public Set<Users> findUsersByUserBelong(Integer userBelong, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserName
	 *
	 */
	public Set<Users> findUsersByUserName(String userName) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserName
	 *
	 */
	public Set<Users> findUsersByUserName(String userName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserEmail
	 *
	 */
	public Set<Users> findUsersByUserEmail(String userEmail_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserEmail
	 *
	 */
	public Set<Users> findUsersByUserEmail(String userEmail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserNameContaining
	 *
	 */
	public Set<Users> findUsersByUserNameContaining(String userName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserNameContaining
	 *
	 */
	public Set<Users> findUsersByUserNameContaining(String userName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserContact
	 *
	 */
	public Set<Users> findUsersByUserContact(String userContact) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserContact
	 *
	 */
	public Set<Users> findUsersByUserContact(String userContact, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserType
	 *
	 */
	public Set<Users> findUsersByUserType(String userType_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserType
	 *
	 */
	public Set<Users> findUsersByUserType(String userType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserContactContaining
	 *
	 */
	public Set<Users> findUsersByUserContactContaining(String userContact_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserContactContaining
	 *
	 */
	public Set<Users> findUsersByUserContactContaining(String userContact_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserId
	 *
	 */
	public Users findUsersByUserId(Integer userId) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserId
	 *
	 */
	public Users findUsersByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(Integer userId_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(Integer userId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserPwd
	 *
	 */
	public Set<Users> findUsersByUserPwd(String userPwd_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserPwd
	 *
	 */
	public Set<Users> findUsersByUserPwd(String userPwd_1, int startResult, int maxRows) throws DataAccessException;

}