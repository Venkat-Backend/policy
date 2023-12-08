package com.policy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "policyRiskGroupDetails")
public class PolicyRiskDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyRiskId;
	
	private String riskDescription;
	
	private String perilGroup;
	
	private long raId;
	
	private long raIdx;
	
	private long sumInsured;
	
	private long pml;
	
	private long premium;

	@CreationTimestamp
	private Date createdAt; 


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public long getPolicyRiskId() {
		return policyRiskId;
	}

	public void setPolicyRiskId(long policyRiskId) {
		this.policyRiskId = policyRiskId;
	}

	public String getRiskDescription() {
		return riskDescription;
	}

	public void setRiskDescription(String riskDescription) {
		this.riskDescription = riskDescription;
	}

	public String getPerilGroup() {
		return perilGroup;
	}

	public void setPerilGroup(String perilGroup) {
		this.perilGroup = perilGroup;
	}

	public long getRaId() {
		return raId;
	}

	public void setRaId(long raId) {
		this.raId = raId;
	}

	public long getRaIdx() {
		return raIdx;
	}

	public void setRaIdx(long raIdx) {
		this.raIdx = raIdx;
	}

	public long getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(long sumInsured) {
		this.sumInsured = sumInsured;
	}

	public long getPml() {
		return pml;
	}

	public void setPml(long pml) {
		this.pml = pml;
	}

	public long getPremium() {
		return premium;
	}

	public void setPremium(long premium) {
		this.premium = premium;
	}
	
	
}
