package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.dao.ExpertsDAO;

import com.glupta.jiaotongPPP.domain.Experts;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Experts entities
 * 
 */

@Service("ExpertsService")
@Transactional
public class ExpertsServiceImpl implements ExpertsService {

	/**
	 * DAO injected by Spring that manages Experts entities
	 * 
	 */
	@Autowired
	private ExpertsDAO expertsDAO;

	/**
	 * Instantiates a new ExpertsServiceImpl.
	 *
	 */
	public ExpertsServiceImpl() {
	}

	/**
	 * Load an existing Experts entity
	 * 
	 */
	@Transactional
	public Set<Experts> loadExpertss() {
		return expertsDAO.findAllExpertss();
	}

	/**
	 * Return a count of all Experts entity
	 * 
	 */
	@Transactional
	public Integer countExpertss() {
		return ((Long) expertsDAO.createQuerySingleResult("select count(o) from Experts o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Experts entity
	 * 
	 */
	@Transactional
	public void saveExperts(Experts experts) {
		Experts existingExperts = expertsDAO.findExpertsByPrimaryKey(experts.getExpertId());

		if (existingExperts != null) {
			if (existingExperts != experts) {
				existingExperts.setExpertId(experts.getExpertId());
				existingExperts.setExpertName(experts.getExpertName());
				existingExperts.setExpertFrom(experts.getExpertFrom());
				existingExperts.setExpertSpeciality(experts.getExpertSpeciality());
				existingExperts.setExpertContact(experts.getExpertContact());
				existingExperts.setExpertEmail(experts.getExpertEmail());
			}
			experts = expertsDAO.store(existingExperts);
		} else {
			experts = expertsDAO.store(experts);
		}
		expertsDAO.flush();
	}

	/**
	 * Return all Experts entity
	 * 
	 */
	@Transactional
	public List<Experts> findAllExpertss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Experts>(expertsDAO.findAllExpertss(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Experts findExpertsByPrimaryKey(Integer expertId) {
		return expertsDAO.findExpertsByPrimaryKey(expertId);
	}

	/**
	 * Delete an existing Experts entity
	 * 
	 */
	@Transactional
	public void deleteExperts(Experts experts) {
		expertsDAO.remove(experts);
		expertsDAO.flush();
	}
}
