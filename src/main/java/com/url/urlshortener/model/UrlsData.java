package com.url.urlshortener.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "urls_data")
public class UrlsData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_hash")
	private String idHash;
	
	@Column(name="original_url")
	private String orginalUrl;
	
	@Column(name="shortened_url")
	private String shortenedUrl;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="expiration_date")
	private Date expirationDate;
	
	public UrlsData() {
		
	}
	public String getIdHash() {
		return idHash;
	}
	public void setIdHash(String idHash) {
		this.idHash = idHash;
	}
	public String getOrginalUrl() {
		return orginalUrl;
	}
	public void setOrginalUrl(String orginalUrl) {
		this.orginalUrl = orginalUrl;
	}
	public String getShortenedUrl() {
		return shortenedUrl;
	}
	public void setShortenedUrl(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
		
	
}
