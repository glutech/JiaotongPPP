package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Docs;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Docs entities
 * 
 */
public interface DocsService {

	/**
	 */
	public Docs findDocsByPrimaryKey(Integer docId);

	/**
	 * Save an existing Docs entity
	 * 
	 */
	public void saveDocs(Docs docs);

	/**
	 * Return all Docs entity
	 * 
	 */
	public List<Docs> findAllDocss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Docs entity
	 * 
	 */
	public Integer countDocss();

	/**
	 * Load an existing Docs entity
	 * 
	 */
	public Set<Docs> loadDocss();

	/**
	 * Delete an existing Docs entity
	 * 
	 */
	public void deleteDocs(Docs docs_1);
}