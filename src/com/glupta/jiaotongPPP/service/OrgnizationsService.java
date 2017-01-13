package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Orgnizations;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Orgnizations entities
 * 
 */
public interface OrgnizationsService {

	/**
	 * Return all Orgnizations entity
	 * 
	 */
	public List<Orgnizations> findAllOrgnizationss(Integer startResult, Integer maxRows);

	/**
	 */
	public Orgnizations findOrgnizationsByPrimaryKey(Integer orgId);

	/**
	 * Delete an existing Orgnizations entity
	 * 
	 */
	public void deleteOrgnizations(Orgnizations orgnizations);

	/**
	 * Return a count of all Orgnizations entity
	 * 
	 */
	public Integer countOrgnizationss();

	/**
	 * Save an existing Orgnizations entity
	 * 
	 */
	public void saveOrgnizations(Orgnizations orgnizations_1);

	/**
	 * Load an existing Orgnizations entity
	 * 
	 */
	public Set<Orgnizations> loadOrgnizationss();
}