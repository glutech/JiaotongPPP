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
		@NamedQuery(name = "findAllOrgnizationss", query = "select myOrgnizations from Orgnizations myOrgnizations"),
		@NamedQuery(name = "findOrgnizationsByOrgId", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgId = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgIndustry", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgIndustry = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgIndustryContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgIndustry like ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgName", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgName = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgNameContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgName like ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgOverview", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgOverview = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgOverviewContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgOverview like ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgPhone", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgPhone = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgPhoneContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgPhone like ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgRep", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgRep = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgRepContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgRep like ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgTrustnum", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgTrustnum = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgTrustnumContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgTrustnum like ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgType", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgType = ?1"),
		@NamedQuery(name = "findOrgnizationsByOrgTypeContaining", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgType like ?1"),
		@NamedQuery(name = "findOrgnizationsByPrimaryKey", query = "select myOrgnizations from Orgnizations myOrgnizations where myOrgnizations.orgId = ?1") })
@Table(catalog = "ppp", name = "orgnizations")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "JiaotongPPP/com/glupta/jiaotongPPP/domain", name = "Orgnizations")
public class Orgnizations implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "org_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer orgId;
	/**
	 */

	@Column(name = "org_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgName;
	/**
	 */

	@Column(name = "org_type", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgType;
	/**
	 */

	@Column(name = "org_trustnum", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgTrustnum;
	/**
	 */

	@Column(name = "org_rep", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgRep;
	/**
	 */

	@Column(name = "org_industry", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgIndustry;
	/**
	 */

	@Column(name = "org_phone", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgPhone;
	/**
	 */

	@Column(name = "org_overview", length = 500)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orgOverview;

	/**
	 */
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	/**
	 */
	public Integer getOrgId() {
		return this.orgId;
	}

	/**
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 */
	public String getOrgName() {
		return this.orgName;
	}

	/**
	 */
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	/**
	 */
	public String getOrgType() {
		return this.orgType;
	}

	/**
	 */
	public void setOrgTrustnum(String orgTrustnum) {
		this.orgTrustnum = orgTrustnum;
	}

	/**
	 */
	public String getOrgTrustnum() {
		return this.orgTrustnum;
	}

	/**
	 */
	public void setOrgRep(String orgRep) {
		this.orgRep = orgRep;
	}

	/**
	 */
	public String getOrgRep() {
		return this.orgRep;
	}

	/**
	 */
	public void setOrgIndustry(String orgIndustry) {
		this.orgIndustry = orgIndustry;
	}

	/**
	 */
	public String getOrgIndustry() {
		return this.orgIndustry;
	}

	/**
	 */
	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}

	/**
	 */
	public String getOrgPhone() {
		return this.orgPhone;
	}

	/**
	 */
	public void setOrgOverview(String orgOverview) {
		this.orgOverview = orgOverview;
	}

	/**
	 */
	public String getOrgOverview() {
		return this.orgOverview;
	}

	/**
	 */
	public Orgnizations() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Orgnizations that) {
		setOrgId(that.getOrgId());
		setOrgName(that.getOrgName());
		setOrgType(that.getOrgType());
		setOrgTrustnum(that.getOrgTrustnum());
		setOrgRep(that.getOrgRep());
		setOrgIndustry(that.getOrgIndustry());
		setOrgPhone(that.getOrgPhone());
		setOrgOverview(that.getOrgOverview());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orgId=[").append(orgId).append("] ");
		buffer.append("orgName=[").append(orgName).append("] ");
		buffer.append("orgType=[").append(orgType).append("] ");
		buffer.append("orgTrustnum=[").append(orgTrustnum).append("] ");
		buffer.append("orgRep=[").append(orgRep).append("] ");
		buffer.append("orgIndustry=[").append(orgIndustry).append("] ");
		buffer.append("orgPhone=[").append(orgPhone).append("] ");
		buffer.append("orgOverview=[").append(orgOverview).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((orgId == null) ? 0 : orgId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Orgnizations))
			return false;
		Orgnizations equalCheck = (Orgnizations) obj;
		if ((orgId == null && equalCheck.orgId != null) || (orgId != null && equalCheck.orgId == null))
			return false;
		if (orgId != null && !orgId.equals(equalCheck.orgId))
			return false;
		return true;
	}
}
