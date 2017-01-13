package com.glupta.jiaotongPPP.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllNewss", query = "select myNews from News myNews"),
		@NamedQuery(name = "findNewsByNewsAuthor", query = "select myNews from News myNews where myNews.newsAuthor = ?1"),
		@NamedQuery(name = "findNewsByNewsContent", query = "select myNews from News myNews where myNews.newsContent = ?1"),
		@NamedQuery(name = "findNewsByNewsId", query = "select myNews from News myNews where myNews.newsId = ?1"),
		@NamedQuery(name = "findNewsByNewsTime", query = "select myNews from News myNews where myNews.newsTime = ?1"),
		@NamedQuery(name = "findNewsByNewsTitle", query = "select myNews from News myNews where myNews.newsTitle = ?1"),
		@NamedQuery(name = "findNewsByNewsTitleContaining", query = "select myNews from News myNews where myNews.newsTitle like ?1"),
		@NamedQuery(name = "findNewsByNewsType", query = "select myNews from News myNews where myNews.newsType = ?1"),
		@NamedQuery(name = "findNewsByNewsTypeContaining", query = "select myNews from News myNews where myNews.newsType like ?1"),
		@NamedQuery(name = "findNewsByPrimaryKey", query = "select myNews from News myNews where myNews.newsId = ?1") })
@Table(catalog = "ppp", name = "news")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "JiaotongPPP/com/glupta/jiaotongPPP/domain", name = "News")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "news_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer newsId;
	/**
	 */

	@Column(name = "news_title", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String newsTitle;
	/**
	 */

	@Column(name = "news_content", columnDefinition = "MEDIUMTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String newsContent;
	/**
	 */

	@Column(name = "news_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String newsType;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "news_time")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar newsTime;
	/**
	 */

	@Column(name = "news_author")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer newsAuthor;

	/**
	 */
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	/**
	 */
	public Integer getNewsId() {
		return this.newsId;
	}

	/**
	 */
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	/**
	 */
	public String getNewsTitle() {
		return this.newsTitle;
	}

	/**
	 */
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	/**
	 */
	public String getNewsContent() {
		return this.newsContent;
	}

	/**
	 */
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	/**
	 */
	public String getNewsType() {
		return this.newsType;
	}

	/**
	 */
	public void setNewsTime(Calendar newsTime) {
		this.newsTime = newsTime;
	}

	/**
	 */
	public Calendar getNewsTime() {
		return this.newsTime;
	}

	/**
	 */
	public void setNewsAuthor(Integer newsAuthor) {
		this.newsAuthor = newsAuthor;
	}

	/**
	 */
	public Integer getNewsAuthor() {
		return this.newsAuthor;
	}

	/**
	 */
	public News() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(News that) {
		setNewsId(that.getNewsId());
		setNewsTitle(that.getNewsTitle());
		setNewsContent(that.getNewsContent());
		setNewsType(that.getNewsType());
		setNewsTime(that.getNewsTime());
		setNewsAuthor(that.getNewsAuthor());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("newsId=[").append(newsId).append("] ");
		buffer.append("newsTitle=[").append(newsTitle).append("] ");
		buffer.append("newsContent=[").append(newsContent).append("] ");
		buffer.append("newsType=[").append(newsType).append("] ");
		buffer.append("newsTime=[").append(newsTime).append("] ");
		buffer.append("newsAuthor=[").append(newsAuthor).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((newsId == null) ? 0 : newsId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof News))
			return false;
		News equalCheck = (News) obj;
		if ((newsId == null && equalCheck.newsId != null) || (newsId != null && equalCheck.newsId == null))
			return false;
		if (newsId != null && !newsId.equals(equalCheck.newsId))
			return false;
		return true;
	}
}
