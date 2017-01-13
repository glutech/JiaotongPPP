package com.glupta.jiaotongPPP.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllDocss", query = "select myDocs from Docs myDocs"),
		@NamedQuery(name = "findDocsByDocAttachment", query = "select myDocs from Docs myDocs where myDocs.docAttachment = ?1"),
		@NamedQuery(name = "findDocsByDocAttachmentContaining", query = "select myDocs from Docs myDocs where myDocs.docAttachment like ?1"),
		@NamedQuery(name = "findDocsByDocContent", query = "select myDocs from Docs myDocs where myDocs.docContent = ?1"),
		@NamedQuery(name = "findDocsByDocId", query = "select myDocs from Docs myDocs where myDocs.docId = ?1"),
		@NamedQuery(name = "findDocsByDocName", query = "select myDocs from Docs myDocs where myDocs.docName = ?1"),
		@NamedQuery(name = "findDocsByDocNameContaining", query = "select myDocs from Docs myDocs where myDocs.docName like ?1"),
		@NamedQuery(name = "findDocsByDocOwner", query = "select myDocs from Docs myDocs where myDocs.docOwner = ?1"),
		@NamedQuery(name = "findDocsByDocType", query = "select myDocs from Docs myDocs where myDocs.docType = ?1"),
		@NamedQuery(name = "findDocsByDocTypeContaining", query = "select myDocs from Docs myDocs where myDocs.docType like ?1"),
		@NamedQuery(name = "findDocsByPrimaryKey", query = "select myDocs from Docs myDocs where myDocs.docId = ?1") })
@Table(catalog = "ppp", name = "docs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "JiaotongPPP/com/glupta/jiaotongPPP/domain", name = "Docs")
public class Docs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "doc_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer docId;
	/**
	 */

	@Column(name = "doc_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String docName;
	/**
	 */

	@Column(name = "doc_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String docType;
	/**
	 */

	@Column(name = "doc_content", columnDefinition = "MEDIUMTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String docContent;
	/**
	 */

	@Column(name = "doc_attachment", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String docAttachment;
	/**
	 */

	@Column(name = "doc_owner")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer docOwner;

	/**
	 */
	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	/**
	 */
	public Integer getDocId() {
		return this.docId;
	}

	/**
	 */
	public void setDocName(String docName) {
		this.docName = docName;
	}

	/**
	 */
	public String getDocName() {
		return this.docName;
	}

	/**
	 */
	public void setDocType(String docType) {
		this.docType = docType;
	}

	/**
	 */
	public String getDocType() {
		return this.docType;
	}

	/**
	 */
	public void setDocContent(String docContent) {
		this.docContent = docContent;
	}

	/**
	 */
	public String getDocContent() {
		return this.docContent;
	}

	/**
	 */
	public void setDocAttachment(String docAttachment) {
		this.docAttachment = docAttachment;
	}

	/**
	 */
	public String getDocAttachment() {
		return this.docAttachment;
	}

	/**
	 */
	public void setDocOwner(Integer docOwner) {
		this.docOwner = docOwner;
	}

	/**
	 */
	public Integer getDocOwner() {
		return this.docOwner;
	}

	/**
	 */
	public Docs() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Docs that) {
		setDocId(that.getDocId());
		setDocName(that.getDocName());
		setDocType(that.getDocType());
		setDocContent(that.getDocContent());
		setDocAttachment(that.getDocAttachment());
		setDocOwner(that.getDocOwner());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("docId=[").append(docId).append("] ");
		buffer.append("docName=[").append(docName).append("] ");
		buffer.append("docType=[").append(docType).append("] ");
		buffer.append("docContent=[").append(docContent).append("] ");
		buffer.append("docAttachment=[").append(docAttachment).append("] ");
		buffer.append("docOwner=[").append(docOwner).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((docId == null) ? 0 : docId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Docs))
			return false;
		Docs equalCheck = (Docs) obj;
		if ((docId == null && equalCheck.docId != null) || (docId != null && equalCheck.docId == null))
			return false;
		if (docId != null && !docId.equals(equalCheck.docId))
			return false;
		return true;
	}
}
