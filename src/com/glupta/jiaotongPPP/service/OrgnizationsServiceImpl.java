package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.dao.OrgnizationsDAO;

import com.glupta.jiaotongPPP.domain.Orgnizations;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Orgnizations entities
 * 
 */

@Service("OrgnizationsService")
@Transactional
public class OrgnizationsServiceImpl implements OrgnizationsService {

	/**
	 * DAO injected by Spring that manages Orgnizations entities
	 * 
	 */
	@Autowired
	private OrgnizationsDAO orgnizationsDAO;

	/**
	 * Instantiates a new OrgnizationsServiceImpl.
	 *
	 */
	public OrgnizationsServiceImpl() {
	}

	/**
	 * Return all Orgnizations entity
	 * 
	 */
	@Transactional
	public List<Orgnizations> findAllOrgnizationss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Orgnizations>(orgnizationsDAO.findAllOrgnizationss(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Orgnizations findOrgnizationsByPrimaryKey(Integer orgId) {
		return orgnizationsDAO.findOrgnizationsByPrimaryKey(orgId);
	}

	/**
	 * Delete an existing Orgnizations entity
	 * 
	 */
	@Transactional
	public void deleteOrgnizations(Orgnizations orgnizations) {
		orgnizationsDAO.remove(orgnizations);
		orgnizationsDAO.flush();
	}

	/**
	 * Return a count of all Orgnizations entity
	 * 
	 */
	@Transactional
	public Integer countOrgnizationss() {
		return ((Long) orgnizationsDAO.createQuerySingleResult("select count(o) from Orgnizations o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Orgnizations entity
	 * 
	 */
	@Transactional
	public void saveOrgnizations(Orgnizations orgnizations) {
		Orgnizations existingOrgnizations = orgnizationsDAO.findOrgnizationsByPrimaryKey(orgnizations.getOrgId());

		if (existingOrgnizations != null) {
			if (existingOrgnizations != orgnizations) {
				existingOrgnizations.setOrgId(orgnizations.getOrgId());
				existingOrgnizations.setOrgName(orgnizations.getOrgName());
				existingOrgnizations.setOrgType(orgnizations.getOrgType());
				existingOrgnizations.setOrgTrustnum(orgnizations.getOrgTrustnum());
				existingOrgnizations.setOrgRep(orgnizations.getOrgRep());
				existingOrgnizations.setOrgIndustry(orgnizations.getOrgIndustry());
				existingOrgnizations.setOrgPhone(orgnizations.getOrgPhone());
				existingOrgnizations.setOrgOverview(orgnizations.getOrgOverview());
			}
			orgnizations = orgnizationsDAO.store(existingOrgnizations);
		} else {
			orgnizations = orgnizationsDAO.store(orgnizations);
		}
		orgnizationsDAO.flush();
	}

	/**
	 * Load an existing Orgnizations entity
	 * 
	 */
	@Transactional
	public Set<Orgnizations> loadOrgnizationss() {
		return orgnizationsDAO.findAllOrgnizationss();
	}
}
