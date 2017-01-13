package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Experts;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Experts entities
 * 
 */
public interface ExpertsService {

	/**
	 * Load an existing Experts entity
	 * 
	 */
	public Set<Experts> loadExpertss();

	/**
	 * Return a count of all Experts entity
	 * 
	 */
	public Integer countExpertss();

	/**
	 * Save an existing Experts entity
	 * 
	 */
	public void saveExperts(Experts experts);

	/**
	 * Return all Experts entity
	 * 
	 */
	public List<Experts> findAllExpertss(Integer startResult, Integer maxRows);

	/**
	 */
	public Experts findExpertsByPrimaryKey(Integer expertId);

	/**
	 * Delete an existing Experts entity
	 * 
	 */
	public void deleteExperts(Experts experts_1);
}