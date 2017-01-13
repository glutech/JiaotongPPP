package com.glupta.jiaotongPPP.dao;

import com.glupta.jiaotongPPP.domain.Docs;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Docs entities.
 * 
 */
public interface DocsDAO extends JpaDao<Docs> {

	/**
	 * JPQL Query - findDocsByDocId
	 *
	 */
	public Docs findDocsByDocId(Integer docId) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocId
	 *
	 */
	public Docs findDocsByDocId(Integer docId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocContent
	 *
	 */
	public Set<Docs> findDocsByDocContent(String docContent) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocContent
	 *
	 */
	public Set<Docs> findDocsByDocContent(String docContent, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocNameContaining
	 *
	 */
	public Set<Docs> findDocsByDocNameContaining(String docName) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocNameContaining
	 *
	 */
	public Set<Docs> findDocsByDocNameContaining(String docName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocAttachmentContaining
	 *
	 */
	public Set<Docs> findDocsByDocAttachmentContaining(String docAttachment) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocAttachmentContaining
	 *
	 */
	public Set<Docs> findDocsByDocAttachmentContaining(String docAttachment, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByPrimaryKey
	 *
	 */
	public Docs findDocsByPrimaryKey(Integer docId_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByPrimaryKey
	 *
	 */
	public Docs findDocsByPrimaryKey(Integer docId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocTypeContaining
	 *
	 */
	public Set<Docs> findDocsByDocTypeContaining(String docType) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocTypeContaining
	 *
	 */
	public Set<Docs> findDocsByDocTypeContaining(String docType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocName
	 *
	 */
	public Set<Docs> findDocsByDocName(String docName_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocName
	 *
	 */
	public Set<Docs> findDocsByDocName(String docName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocAttachment
	 *
	 */
	public Set<Docs> findDocsByDocAttachment(String docAttachment_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocAttachment
	 *
	 */
	public Set<Docs> findDocsByDocAttachment(String docAttachment_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocType
	 *
	 */
	public Set<Docs> findDocsByDocType(String docType_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocType
	 *
	 */
	public Set<Docs> findDocsByDocType(String docType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocOwner
	 *
	 */
	public Set<Docs> findDocsByDocOwner(Integer docOwner) throws DataAccessException;

	/**
	 * JPQL Query - findDocsByDocOwner
	 *
	 */
	public Set<Docs> findDocsByDocOwner(Integer docOwner, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDocss
	 *
	 */
	public Set<Docs> findAllDocss() throws DataAccessException;

	/**
	 * JPQL Query - findAllDocss
	 *
	 */
	public Set<Docs> findAllDocss(int startResult, int maxRows) throws DataAccessException;

}