package com.policy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "quotationInsurer", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class QuotationInsurer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
	private long quotationinsurerId;

	private String firstName;

	private String lastName;

	private String companyName;

	private String website;

	private String business;

	private String email;

	private String phoneNo;

	private String emiratesId;

	private String companyId;

	private String address1;

	private String address2;

	private String address3;

	private String city;

	private String counrty;

	private String pincode;

	private long organizationId;

	@CreationTimestamp
	private Date createdAt;

	public long getQuotationinsurerId() {
		return quotationinsurerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getWebsite() {
		return website;
	}

	public String getBusiness() {
		return business;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getEmiratesId() {
		return emiratesId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getAddress3() {
		return address3;
	}

	public String getCity() {
		return city;
	}

	public String getCounrty() {
		return counrty;
	}

	public String getPincode() {
		return pincode;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setQuotationinsurerId(long quotationinsurerId) {
		this.quotationinsurerId = quotationinsurerId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmiratesId(String emiratesId) {
		this.emiratesId = emiratesId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCounrty(String counrty) {
		this.counrty = counrty;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	

}
