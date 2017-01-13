package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.dao.ProjectsDAO;

import com.glupta.jiaotongPPP.domain.Projects;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Projects entities
 * 
 */

@Service("ProjectsService")
@Transactional
public class ProjectsServiceImpl implements ProjectsService {

	/**
	 * DAO injected by Spring that manages Projects entities
	 * 
	 */
	@Autowired
	private ProjectsDAO projectsDAO;

	/**
	 * Instantiates a new ProjectsServiceImpl.
	 *
	 */
	public ProjectsServiceImpl() {
	}

	/**
	 * Save an existing Projects entity
	 * 
	 */
	@Transactional
	public void saveProjects(Projects projects) {
		Projects existingProjects = projectsDAO.findProjectsByPrimaryKey(projects.getProjectId());

		if (existingProjects != null) {
			if (existingProjects != projects) {
				existingProjects.setProjectId(projects.getProjectId());
				existingProjects.setProjectName(projects.getProjectName());
				existingProjects.setProjectArea(projects.getProjectArea());
				existingProjects.setProjectInvestment(projects.getProjectInvestment());
				existingProjects.setProjectCooptime(projects.getProjectCooptime());
				existingProjects.setProjectMode(projects.getProjectMode());
				existingProjects.setProjectRewardType(projects.getProjectRewardType());
				existingProjects.setProjectStartTime(projects.getProjectStartTime());
				existingProjects.setProjectStartType(projects.getProjectStartType());
				existingProjects.setProjectOverview(projects.getProjectOverview());
				existingProjects.setProjectContact(projects.getProjectContact());
				existingProjects.setProjectContactPhone(projects.getProjectContactPhone());
				existingProjects.setProjectRecomLevel(projects.getProjectRecomLevel());
				existingProjects.setProjectPilotNum(projects.getProjectPilotNum());
				existingProjects.setProjectType(projects.getProjectType());
			}
			projects = projectsDAO.store(existingProjects);
		} else {
			projects = projectsDAO.store(projects);
		}
		projectsDAO.flush();
	}

	/**
	 */
	@Transactional
	public Projects findProjectsByPrimaryKey(Integer projectId) {
		return projectsDAO.findProjectsByPrimaryKey(projectId);
	}

	/**
	 * Load an existing Projects entity
	 * 
	 */
	@Transactional
	public Set<Projects> loadProjectss() {
		return projectsDAO.findAllProjectss();
	}

	/**
	 * Return a count of all Projects entity
	 * 
	 */
	@Transactional
	public Integer countProjectss() {
		return ((Long) projectsDAO.createQuerySingleResult("select count(o) from Projects o").getSingleResult()).intValue();
	}

	/**
	 * Return all Projects entity
	 * 
	 */
	@Transactional
	public List<Projects> findAllProjectss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Projects>(projectsDAO.findAllProjectss(startResult, maxRows));
	}

	/**
	 * Delete an existing Projects entity
	 * 
	 */
	@Transactional
	public void deleteProjects(Projects projects) {
		projectsDAO.remove(projects);
		projectsDAO.flush();
	}
}
