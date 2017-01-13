package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.domain.Projects;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Projects entities
 * 
 */
public interface ProjectsService {

	/**
	 * Save an existing Projects entity
	 * 
	 */
	public void saveProjects(Projects projects);

	/**
	 */
	public Projects findProjectsByPrimaryKey(Integer projectId);

	/**
	 * Load an existing Projects entity
	 * 
	 */
	public Set<Projects> loadProjectss();

	/**
	 * Return a count of all Projects entity
	 * 
	 */
	public Integer countProjectss();

	/**
	 * Return all Projects entity
	 * 
	 */
	public List<Projects> findAllProjectss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Projects entity
	 * 
	 */
	public void deleteProjects(Projects projects_1);
}