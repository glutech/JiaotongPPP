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
		@NamedQuery(name = "findAllUserss", query = "select myUsers from Users myUsers"),
		@NamedQuery(name = "findUsersByPrimaryKey", query = "select myUsers from Users myUsers where myUsers.userId = ?1"),
		@NamedQuery(name = "findUsersByUserAddress", query = "select myUsers from Users myUsers where myUsers.userAddress = ?1"),
		@NamedQuery(name = "findUsersByUserAddressContaining", query = "select myUsers from Users myUsers where myUsers.userAddress like ?1"),
		@NamedQuery(name = "findUsersByUserBelong", query = "select myUsers from Users myUsers where myUsers.userBelong = ?1"),
		@NamedQuery(name = "findUsersByUserContact", query = "select myUsers from Users myUsers where myUsers.userContact = ?1"),
		@NamedQuery(name = "findUsersByUserContactContaining", query = "select myUsers from Users myUsers where myUsers.userContact like ?1"),
		@NamedQuery(name = "findUsersByUserEmail", query = "select myUsers from Users myUsers where myUsers.userEmail = ?1"),
		@NamedQuery(name = "findUsersByUserEmailContaining", query = "select myUsers from Users myUsers where myUsers.userEmail like ?1"),
		@NamedQuery(name = "findUsersByUserId", query = "select myUsers from Users myUsers where myUsers.userId = ?1"),
		@NamedQuery(name = "findUsersByUserName", query = "select myUsers from Users myUsers where myUsers.userName = ?1"),
		@NamedQuery(name = "findUsersByUserNameContaining", query = "select myUsers from Users myUsers where myUsers.userName like ?1"),
		@NamedQuery(name = "findUsersByUserPwd", query = "select myUsers from Users myUsers where myUsers.userPwd = ?1"),
		@NamedQuery(name = "findUsersByUserPwdContaining", query = "select myUsers from Users myUsers where myUsers.userPwd like ?1"),
		@NamedQuery(name = "findUsersByUserType", query = "select myUsers from Users myUsers where myUsers.userType = ?1"),
		@NamedQuery(name = "findUsersByUserTypeContaining", query = "select myUsers from Users myUsers where myUsers.userType like ?1") })
@Table(catalog = "ppp", name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "JiaotongPPP/com/glupta/jiaotongPPP/domain", name = "Users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "user_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer userId;
	/**
	 */

	@Column(name = "user_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userName;
	/**
	 */

	@Column(name = "user_pwd", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userPwd;
	/**
	 */

	@Column(name = "user_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userType;
	/**
	 */

	@Column(name = "user_email", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userEmail;
	/**
	 */

	@Column(name = "user_contact", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userContact;
	/**
	 */

	@Column(name = "user_address", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userAddress;
	/**
	 */

	@Column(name = "user_belong", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer userBelong;

	/**
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	/**
	 */
	public String getUserPwd() {
		return this.userPwd;
	}

	/**
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 */
	public String getUserType() {
		return this.userType;
	}

	/**
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 */
	public String getUserEmail() {
		return this.userEmail;
	}

	/**
	 */
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	/**
	 */
	public String getUserContact() {
		return this.userContact;
	}

	/**
	 */
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	/**
	 */
	public String getUserAddress() {
		return this.userAddress;
	}

	/**
	 */
	public void setUserBelong(Integer userBelong) {
		this.userBelong = userBelong;
	}

	/**
	 */
	public Integer getUserBelong() {
		return this.userBelong;
	}

	/**
	 */
	public Users() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Users that) {
		setUserId(that.getUserId());
		setUserName(that.getUserName());
		setUserPwd(that.getUserPwd());
		setUserType(that.getUserType());
		setUserEmail(that.getUserEmail());
		setUserContact(that.getUserContact());
		setUserAddress(that.getUserAddress());
		setUserBelong(that.getUserBelong());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("userId=[").append(userId).append("] ");
		buffer.append("userName=[").append(userName).append("] ");
		buffer.append("userPwd=[").append(userPwd).append("] ");
		buffer.append("userType=[").append(userType).append("] ");
		buffer.append("userEmail=[").append(userEmail).append("] ");
		buffer.append("userContact=[").append(userContact).append("] ");
		buffer.append("userAddress=[").append(userAddress).append("] ");
		buffer.append("userBelong=[").append(userBelong).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((userId == null) ? 0 : userId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Users))
			return false;
		Users equalCheck = (Users) obj;
		if ((userId == null && equalCheck.userId != null) || (userId != null && equalCheck.userId == null))
			return false;
		if (userId != null && !userId.equals(equalCheck.userId))
			return false;
		return true;
	}
}
