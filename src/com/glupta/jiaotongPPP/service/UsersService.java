package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */
public interface UsersService {

	/**
	 * Return a count of all Users entity
	 * 
	 */
	public Integer countUserss();

	/**
	 */
	public Users findUsersByPrimaryKey(Integer userId);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public void saveUsers(Users users);

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public void deleteUsers(Users users_1);

	/**
	 * Load an existing Users entity
	 * 
	 */
	public Set<Users> loadUserss();

	/**
	 * Return all Users entity
	 * 
	 */
	public List<Users> findAllUserss(Integer startResult, Integer maxRows);
}