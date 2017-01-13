package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.dao.UsersDAO;

import com.glupta.jiaotongPPP.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */

@Service("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService {

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new UsersServiceImpl.
	 *
	 */
	public UsersServiceImpl() {
	}

	/**
	 * Return a count of all Users entity
	 * 
	 */
	@Transactional
	public Integer countUserss() {
		return ((Long) usersDAO.createQuerySingleResult("select count(o) from Users o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Users findUsersByPrimaryKey(Integer userId) {
		return usersDAO.findUsersByPrimaryKey(userId);
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public void saveUsers(Users users) {
		Users existingUsers = usersDAO.findUsersByPrimaryKey(users.getUserId());

		if (existingUsers != null) {
			if (existingUsers != users) {
				existingUsers.setUserId(users.getUserId());
				existingUsers.setUserName(users.getUserName());
				existingUsers.setUserPwd(users.getUserPwd());
				existingUsers.setUserType(users.getUserType());
				existingUsers.setUserEmail(users.getUserEmail());
				existingUsers.setUserContact(users.getUserContact());
				existingUsers.setUserAddress(users.getUserAddress());
				existingUsers.setUserBelong(users.getUserBelong());
			}
			users = usersDAO.store(existingUsers);
		} else {
			users = usersDAO.store(users);
		}
		usersDAO.flush();
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public void deleteUsers(Users users) {
		usersDAO.remove(users);
		usersDAO.flush();
	}

	/**
	 * Load an existing Users entity
	 * 
	 */
	@Transactional
	public Set<Users> loadUserss() {
		return usersDAO.findAllUserss();
	}

	/**
	 * Return all Users entity
	 * 
	 */
	@Transactional
	public List<Users> findAllUserss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Users>(usersDAO.findAllUserss(startResult, maxRows));
	}
}
