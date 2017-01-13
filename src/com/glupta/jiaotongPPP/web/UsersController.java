package com.glupta.jiaotongPPP.web;

import com.glupta.jiaotongPPP.dao.UsersDAO;

import com.glupta.jiaotongPPP.domain.Users;

import com.glupta.jiaotongPPP.service.UsersService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Users entities
 * 
 */

@Controller("UsersController")
public class UsersController {

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
	 * Select the Users entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsers")
	public ModelAndView confirmDeleteUsers(@RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(userIdKey));
		mav.setViewName("users/deleteUsers.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Users entities
	 * 
	 */
	public String indexUsers() {
		return "redirect:/indexUsers";
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
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping("/deleteUsers")
	public String deleteUsers(@RequestParam Integer userIdKey) {
		Users users = usersDAO.findUsersByPrimaryKey(userIdKey);
		usersService.deleteUsers(users);
		return "forward:/indexUsers";
	}

	/**
	 * Show all Users entities
	 * 
	 */
	@RequestMapping("/indexUsers")
	public ModelAndView listUserss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userss", usersService.loadUserss());

		mav.setViewName("users/listUserss.jsp");

		return mav;
	}

	/**
	 * Edit an existing Users entity
	 * 
	 */
	@RequestMapping("/editUsers")
	public ModelAndView editUsers(@RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(userIdKey));
		mav.setViewName("users/editUsers.jsp");

		return mav;
	}

	/**
	 * Select an existing Users entity
	 * 
	 */
	@RequestMapping("/selectUsers")
	public ModelAndView selectUsers(@RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(userIdKey));
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/usersController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping("/newUsers")
	public ModelAndView newUsers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("users/editUsers.jsp");

		return mav;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping("/saveUsers")
	public String saveUsers(@ModelAttribute Users users) {
		usersService.saveUsers(users);
		return "forward:/indexUsers";
	}
}