package com.glupta.jiaotongPPP.service;

import com.glupta.jiaotongPPP.dao.DocsDAO;

import com.glupta.jiaotongPPP.domain.Docs;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Docs entities
 * 
 */

@Service("DocsService")
@Transactional
public class DocsServiceImpl implements DocsService {

	/**
	 * DAO injected by Spring that manages Docs entities
	 * 
	 */
	@Autowired
	private DocsDAO docsDAO;

	/**
	 * Instantiates a new DocsServiceImpl.
	 *
	 */
	public DocsServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Docs findDocsByPrimaryKey(Integer docId) {
		return docsDAO.findDocsByPrimaryKey(docId);
	}

	/**
	 * Save an existing Docs entity
	 * 
	 */
	@Transactional
	public void saveDocs(Docs docs) {
		Docs existingDocs = docsDAO.findDocsByPrimaryKey(docs.getDocId());

		if (existingDocs != null) {
			if (existingDocs != docs) {
				existingDocs.setDocId(docs.getDocId());
				existingDocs.setDocName(docs.getDocName());
				existingDocs.setDocType(docs.getDocType());
				existingDocs.setDocContent(docs.getDocContent());
				existingDocs.setDocAttachment(docs.getDocAttachment());
				existingDocs.setDocOwner(docs.getDocOwner());
			}
			docs = docsDAO.store(existingDocs);
		} else {
			docs = docsDAO.store(docs);
		}
		docsDAO.flush();
	}

	/**
	 * Return all Docs entity
	 * 
	 */
	@Transactional
	public List<Docs> findAllDocss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Docs>(docsDAO.findAllDocss(startResult, maxRows));
	}

	/**
	 * Return a count of all Docs entity
	 * 
	 */
	@Transactional
	public Integer countDocss() {
		return ((Long) docsDAO.createQuerySingleResult("select count(o) from Docs o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Docs entity
	 * 
	 */
	@Transactional
	public Set<Docs> loadDocss() {
		return docsDAO.findAllDocss();
	}

	/**
	 * Delete an existing Docs entity
	 * 
	 */
	@Transactional
	public void deleteDocs(Docs docs) {
		docsDAO.remove(docs);
		docsDAO.flush();
	}
}
