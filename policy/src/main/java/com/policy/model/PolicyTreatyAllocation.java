package com.policy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "policyTreatyAllocation")
public class PolicyTreatyAllocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyTreatyId;
	
	private String treatyTypeCode;
	
	private String share;
	
	private long allocSi;
	
	private long allocPml;
	
	private long allocPremium;
	
	private long splRetnSi;
	
	private long splRetnPml;
	
	private long splRetnPrem;
	
	@CreationTimestamp
	private Date createdAt; 


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public long getPolicyTreatyId() {
		return policyTreatyId;
	}

	public String getTreatyTypeCode() {
		return treatyTypeCode;
	}

	public String getShare() {
		return share;
	}

	public long getAllocSi() {
		return allocSi;
	}

	public long getAllocPml() {
		return allocPml;
	}

	public long getAllocPremium() {
		return allocPremium;
	}

	public long getSplRetnSi() {
		return splRetnSi;
	}

	public long getSplRetnPml() {
		return splRetnPml;
	}

	public long getSplRetnPrem() {
		return splRetnPrem;
	}

	public void setPolicyTreatyId(long policyTreatyId) {
		this.policyTreatyId = policyTreatyId;
	}

	public void setTreatyTypeCode(String treatyTypeCode) {
		this.treatyTypeCode = treatyTypeCode;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public void setAllocSi(long allocSi) {
		this.allocSi = allocSi;
	}

	public void setAllocPml(long allocPml) {
		this.allocPml = allocPml;
	}

	public void setAllocPremium(long allocPremium) {
		this.allocPremium = allocPremium;
	}

	public void setSplRetnSi(long splRetnSi) {
		this.splRetnSi = splRetnSi;
	}

	public void setSplRetnPml(long splRetnPml) {
		this.splRetnPml = splRetnPml;
	}

	public void setSplRetnPrem(long splRetnPrem) {
		this.splRetnPrem = splRetnPrem;
	}

	
}
