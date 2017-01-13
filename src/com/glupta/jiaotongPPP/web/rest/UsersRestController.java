package com.glupta.jiaotongPPP.web.rest;

import com.glupta.jiaotongPPP.dao.UsersDAO;
import com.glupta.jiaotongPPP.domain.Users;
import com.glupta.jiaotongPPP.service.UsersService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Users entities
 * 
 */

@Controller("UsersRestController")
public class UsersRestController {

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Users entities
	 * 
	 */
	@Autowired
	private UsersService usersService;

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getUserId());
	}

	/**
	 * Select an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_userId}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadUsers(@PathVariable Integer users_userId) {
		return usersDAO.findUsersByPrimaryKey(users_userId);
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_userId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsers(@PathVariable Integer users_userId) {
		Users users = usersDAO.findUsersByPrimaryKey(users_userId);
		usersService.deleteUsers(users);
	}

	/**
	 * Show all Users entities
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.GET, produces = "application/json", headers="Accept=application/xml, application/json")
	@ResponseBody
	public List<Users> listUserss() {
		System.out.println("Rest is activated");
		java.util.ArrayList<Users>  us = new java.util.ArrayList<Users>(usersService.loadUserss());
		for(int i = 0; i < us.size(); i ++){
			System.out.println(us.get(i).getUserName()+ "/");
		}
		return us;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	@ResponseBody
	public Users newUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getUserId());
	}
}