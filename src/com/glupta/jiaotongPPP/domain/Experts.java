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
		@NamedQuery(name = "findAllExpertss", query = "select myExperts from Experts myExperts"),
		@NamedQuery(name = "findExpertsByExpertContact", query = "select myExperts from Experts myExperts where myExperts.expertContact = ?1"),
		@NamedQuery(name = "findExpertsByExpertContactContaining", query = "select myExperts from Experts myExperts where myExperts.expertContact like ?1"),
		@NamedQuery(name = "findExpertsByExpertEmail", query = "select myExperts from Experts myExperts where myExperts.expertEmail = ?1"),
		@NamedQuery(name = "findExpertsByExpertEmailContaining", query = "select myExperts from Experts myExperts where myExperts.expertEmail like ?1"),
		@NamedQuery(name = "findExpertsByExpertFrom", query = "select myExperts from Experts myExperts where myExperts.expertFrom = ?1"),
		@NamedQuery(name = "findExpertsByExpertFromContaining", query = "select myExperts from Experts myExperts where myExperts.expertFrom like ?1"),
		@NamedQuery(name = "findExpertsByExpertId", query = "select myExperts from Experts myExperts where myExperts.expertId = ?1"),
		@NamedQuery(name = "findExpertsByExpertName", query = "select myExperts from Experts myExperts where myExperts.expertName = ?1"),
		@NamedQuery(name = "findExpertsByExpertNameContaining", query = "select myExperts from Experts myExperts where myExperts.expertName like ?1"),
		@NamedQuery(name = "findExpertsByExpertSpeciality", query = "select myExperts from Experts myExperts where myExperts.expertSpeciality = ?1"),
		@NamedQuery(name = "findExpertsByExpertSpecialityContaining", query = "select myExperts from Experts myExperts where myExperts.expertSpeciality like ?1"),
		@NamedQuery(name = "findExpertsByPrimaryKey", query = "select myExperts from Experts myExperts where myExperts.expertId = ?1") })
@Table(catalog = "ppp", name = "experts")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "JiaotongPPP/com/glupta/jiaotongPPP/domain", name = "Experts")
public class Experts implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "expert_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer expertId;
	/**
	 */

	@Column(name = "expert_name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String expertName;
	/**
	 */

	@Column(name = "expert_from", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String expertFrom;
	/**
	 */

	@Column(name = "expert_speciality", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String expertSpeciality;
	/**
	 */

	@Column(name = "expert_contact", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String expertContact;
	/**
	 */

	@Column(name = "expert_email", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String expertEmail;

	/**
	 */
	public void setExpertId(Integer expertId) {
		this.expertId = expertId;
	}

	/**
	 */
	public Integer getExpertId() {
		return this.expertId;
	}

	/**
	 */
	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}

	/**
	 */
	public String getExpertName() {
		return this.expertName;
	}

	/**
	 */
	public void setExpertFrom(String expertFrom) {
		this.expertFrom = expertFrom;
	}

	/**
	 */
	public String getExpertFrom() {
		return this.expertFrom;
	}

	/**
	 */
	public void setExpertSpeciality(String expertSpeciality) {
		this.expertSpeciality = expertSpeciality;
	}

	/**
	 */
	public String getExpertSpeciality() {
		return this.expertSpeciality;
	}

	/**
	 */
	public void setExpertContact(String expertContact) {
		this.expertContact = expertContact;
	}

	/**
	 */
	public String getExpertContact() {
		return this.expertContact;
	}

	/**
	 */
	public void setExpertEmail(String expertEmail) {
		this.expertEmail = expertEmail;
	}

	/**
	 */
	public String getExpertEmail() {
		return this.expertEmail;
	}

	/**
	 */
	public Experts() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Experts that) {
		setExpertId(that.getExpertId());
		setExpertName(that.getExpertName());
		setExpertFrom(that.getExpertFrom());
		setExpertSpeciality(that.getExpertSpeciality());
		setExpertContact(that.getExpertContact());
		setExpertEmail(that.getExpertEmail());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("expertId=[").append(expertId).append("] ");
		buffer.append("expertName=[").append(expertName).append("] ");
		buffer.append("expertFrom=[").append(expertFrom).append("] ");
		buffer.append("expertSpeciality=[").append(expertSpeciality).append("] ");
		buffer.append("expertContact=[").append(expertContact).append("] ");
		buffer.append("expertEmail=[").append(expertEmail).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((expertId == null) ? 0 : expertId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Experts))
			return false;
		Experts equalCheck = (Experts) obj;
		if ((expertId == null && equalCheck.expertId != null) || (expertId != null && equalCheck.expertId == null))
			return false;
		if (expertId != null && !expertId.equals(equalCheck.expertId))
			return false;
		return true;
	}
}
