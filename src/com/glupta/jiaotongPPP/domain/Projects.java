package com.glupta.jiaotongPPP.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllProjectss", query = "select myProjects from Projects myProjects"),
		@NamedQuery(name = "findProjectsByPrimaryKey", query = "select myProjects from Projects myProjects where myProjects.projectId = ?1"),
		@NamedQuery(name = "findProjectsByProjectArea", query = "select myProjects from Projects myProjects where myProjects.projectArea = ?1"),
		@NamedQuery(name = "findProjectsByProjectAreaContaining", query = "select myProjects from Projects myProjects where myProjects.projectArea like ?1"),
		@NamedQuery(name = "findProjectsByProjectContact", query = "select myProjects from Projects myProjects where myProjects.projectContact = ?1"),
		@NamedQuery(name = "findProjectsByProjectContactContaining", query = "select myProjects from Projects myProjects where myProjects.projectContact like ?1"),
		@NamedQuery(name = "findProjectsByProjectContactPhone", query = "select myProjects from Projects myProjects where myProjects.projectContactPhone = ?1"),
		@NamedQuery(name = "findProjectsByProjectContactPhoneContaining", query = "select myProjects from Projects myProjects where myProjects.projectContactPhone like ?1"),
		@NamedQuery(name = "findProjectsByProjectCooptime", query = "select myProjects from Projects myProjects where myProjects.projectCooptime = ?1"),
		@NamedQuery(name = "findProjectsByProjectId", query = "select myProjects from Projects myProjects where myProjects.projectId = ?1"),
		@NamedQuery(name = "findProjectsByProjectInvestment", query = "select myProjects from Projects myProjects where myProjects.projectInvestment = ?1"),
		@NamedQuery(name = "findProjectsByProjectMode", query = "select myProjects from Projects myProjects where myProjects.projectMode = ?1"),
		@NamedQuery(name = "findProjectsByProjectModeContaining", query = "select myProjects from Projects myProjects where myProjects.projectMode like ?1"),
		@NamedQuery(name = "findProjectsByProjectName", query = "select myProjects from Projects myProjects where myProjects.projectName = ?1"),
		@NamedQuery(name = "findProjectsByProjectNameContaining", query = "select myProjects from Projects myProjects where myProjects.projectName like ?1"),
		@NamedQuery(name = "findProjectsByProjectOverview", query = "select myProjects from Projects myProjects where myProjects.projectOverview = ?1"),
		@NamedQuery(name = "findProjectsByProjectOverviewContaining", query = "select myProjects from Projects myProjects where myProjects.projectOverview like ?1"),
		@NamedQuery(name = "findProjectsByProjectPilotNum", query = "select myProjects from Projects myProjects where myProjects.projectPilotNum = ?1"),
		@NamedQuery(name = "findProjectsByProjectPilotNumContaining", query = "select myProjects from Projects myProjects where myProjects.projectPilotNum like ?1"),
		@NamedQuery(name = "findProjectsByProjectRecomLevel", query = "select myProjects from Projects myProjects where myProjects.projectRecomLevel = ?1"),
		@NamedQuery(name = "findProjectsByProjectRecomLevelContaining", query = "select myProjects from Projects myProjects where myProjects.projectRecomLevel like ?1"),
		@NamedQuery(name = "findProjectsByProjectRewardType", query = "select myProjects from Projects myProjects where myProjects.projectRewardType = ?1"),
		@NamedQuery(name = "findProjectsByProjectRewardTypeContaining", query = "select myProjects from Projects myProjects where myProjects.projectRewardType like ?1"),
		@NamedQuery(name = "findProjectsByProjectStartTime", query = "select myProjects from Projects myProjects where myProjects.projectStartTime = ?1"),
		@NamedQuery(name = "findProjectsByProjectStartTimeAfter", query = "select myProjects from Projects myProjects where myProjects.projectStartTime > ?1"),
		@NamedQuery(name = "findProjectsByProjectStartTimeBefore", query = "select myProjects from Projects myProjects where myProjects.projectStartTime < ?1"),
		@NamedQuery(name = "findProjectsByProjectStartType", query = "select myProjects from Projects myProjects where myProjects.projectStartType = ?1"),
		@NamedQuery(name = "findProjectsByProjectStartTypeContaining", query = "select myProjects from Projects myProjects where myProjects.projectStartType like ?1"),
		@NamedQuery(name = "findProjectsByProjectType", query = "select myProjects from Projects myProjects where myProjects.projectType = ?1"),
		@NamedQuery(name = "findProjectsByProjectTypeContaining", query = "select myProjects from Projects myProjects where myProjects.projectType like ?1") })
@Table(catalog = "ppp", name = "projects")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "JiaotongPPP/com/glupta/jiaotongPPP/domain", name = "Projects")
public class Projects implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "project_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer projectId;
	/**
	 */

	@Column(name = "project_name", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectName;
	/**
	 */

	@Column(name = "project_area", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectArea;
	/**
	 */

	@Column(name = "project_investment", precision = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal projectInvestment;
	/**
	 */

	@Column(name = "project_cooptime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer projectCooptime;
	/**
	 */

	@Column(name = "project_mode", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectMode;
	/**
	 */

	@Column(name = "project_reward_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectRewardType;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "project_start_time")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar projectStartTime;
	/**
	 */

	@Column(name = "project_start_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectStartType;
	/**
	 */

	@Column(name = "project_overview", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectOverview;
	/**
	 */

	@Column(name = "project_contact", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectContact;
	/**
	 */

	@Column(name = "project_contact_phone", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectContactPhone;
	/**
	 */

	@Column(name = "project_recom_level", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectRecomLevel;
	/**
	 */

	@Column(name = "project_pilot_num", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectPilotNum;
	/**
	 */

	@Column(name = "project_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String projectType;

	/**
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 */
	public Integer getProjectId() {
		return this.projectId;
	}

	/**
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 */
	public String getProjectName() {
		return this.projectName;
	}

	/**
	 */
	public void setProjectArea(String projectArea) {
		this.projectArea = projectArea;
	}

	/**
	 */
	public String getProjectArea() {
		return this.projectArea;
	}

	/**
	 */
	public void setProjectInvestment(BigDecimal projectInvestment) {
		this.projectInvestment = projectInvestment;
	}

	/**
	 */
	public BigDecimal getProjectInvestment() {
		return this.projectInvestment;
	}

	/**
	 */
	public void setProjectCooptime(Integer projectCooptime) {
		this.projectCooptime = projectCooptime;
	}

	/**
	 */
	public Integer getProjectCooptime() {
		return this.projectCooptime;
	}

	/**
	 */
	public void setProjectMode(String projectMode) {
		this.projectMode = projectMode;
	}

	/**
	 */
	public String getProjectMode() {
		return this.projectMode;
	}

	/**
	 */
	public void setProjectRewardType(String projectRewardType) {
		this.projectRewardType = projectRewardType;
	}

	/**
	 */
	public String getProjectRewardType() {
		return this.projectRewardType;
	}

	/**
	 */
	public void setProjectStartTime(Calendar projectStartTime) {
		this.projectStartTime = projectStartTime;
	}

	/**
	 */
	public Calendar getProjectStartTime() {
		return this.projectStartTime;
	}

	/**
	 */
	public void setProjectStartType(String projectStartType) {
		this.projectStartType = projectStartType;
	}

	/**
	 */
	public String getProjectStartType() {
		return this.projectStartType;
	}

	/**
	 */
	public void setProjectOverview(String projectOverview) {
		this.projectOverview = projectOverview;
	}

	/**
	 */
	public String getProjectOverview() {
		return this.projectOverview;
	}

	/**
	 */
	public void setProjectContact(String projectContact) {
		this.projectContact = projectContact;
	}

	/**
	 */
	public String getProjectContact() {
		return this.projectContact;
	}

	/**
	 */
	public void setProjectContactPhone(String projectContactPhone) {
		this.projectContactPhone = projectContactPhone;
	}

	/**
	 */
	public String getProjectContactPhone() {
		return this.projectContactPhone;
	}

	/**
	 */
	public void setProjectRecomLevel(String projectRecomLevel) {
		this.projectRecomLevel = projectRecomLevel;
	}

	/**
	 */
	public String getProjectRecomLevel() {
		return this.projectRecomLevel;
	}

	/**
	 */
	public void setProjectPilotNum(String projectPilotNum) {
		this.projectPilotNum = projectPilotNum;
	}

	/**
	 */
	public String getProjectPilotNum() {
		return this.projectPilotNum;
	}

	/**
	 */
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	/**
	 */
	public String getProjectType() {
		return this.projectType;
	}

	/**
	 */
	public Projects() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Projects that) {
		setProjectId(that.getProjectId());
		setProjectName(that.getProjectName());
		setProjectArea(that.getProjectArea());
		setProjectInvestment(that.getProjectInvestment());
		setProjectCooptime(that.getProjectCooptime());
		setProjectMode(that.getProjectMode());
		setProjectRewardType(that.getProjectRewardType());
		setProjectStartTime(that.getProjectStartTime());
		setProjectStartType(that.getProjectStartType());
		setProjectOverview(that.getProjectOverview());
		setProjectContact(that.getProjectContact());
		setProjectContactPhone(that.getProjectContactPhone());
		setProjectRecomLevel(that.getProjectRecomLevel());
		setProjectPilotNum(that.getProjectPilotNum());
		setProjectType(that.getProjectType());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("projectId=[").append(projectId).append("] ");
		buffer.append("projectName=[").append(projectName).append("] ");
		buffer.append("projectArea=[").append(projectArea).append("] ");
		buffer.append("projectInvestment=[").append(projectInvestment).append("] ");
		buffer.append("projectCooptime=[").append(projectCooptime).append("] ");
		buffer.append("projectMode=[").append(projectMode).append("] ");
		buffer.append("projectRewardType=[").append(projectRewardType).append("] ");
		buffer.append("projectStartTime=[").append(projectStartTime).append("] ");
		buffer.append("projectStartType=[").append(projectStartType).append("] ");
		buffer.append("projectOverview=[").append(projectOverview).append("] ");
		buffer.append("projectContact=[").append(projectContact).append("] ");
		buffer.append("projectContactPhone=[").append(projectContactPhone).append("] ");
		buffer.append("projectRecomLevel=[").append(projectRecomLevel).append("] ");
		buffer.append("projectPilotNum=[").append(projectPilotNum).append("] ");
		buffer.append("projectType=[").append(projectType).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((projectId == null) ? 0 : projectId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Projects))
			return false;
		Projects equalCheck = (Projects) obj;
		if ((projectId == null && equalCheck.projectId != null) || (projectId != null && equalCheck.projectId == null))
			return false;
		if (projectId != null && !projectId.equals(equalCheck.projectId))
			return false;
		return true;
	}
}
