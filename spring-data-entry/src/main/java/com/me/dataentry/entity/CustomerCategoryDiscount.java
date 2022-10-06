package com.me.dataentry.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "JAX_PR_CUST_CAT_DISCOUNT")
public class CustomerCategoryDiscount implements Serializable {
    
    public static enum CUSTOMER_CATEGORY {
        BRONZE, SILVER, GOLD, PLATINUM;
    }

	private static final long serialVersionUID = 5102691255371845605L;

	@Id
	@GeneratedValue(generator = "cc_discount_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cc_discount_seq", sequenceName = "JAX_PR_CUSTOMER_DISCOUNT_SEQ", allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	private BigDecimal id;

	@Column(name = "CUSTOMER_CATEGORY")
	@Enumerated(value = EnumType.STRING)
	private CUSTOMER_CATEGORY customerCategory;

	@Column(name = "ISACTIVE")
	private String isActive;

	@Column(name = "INFO")
	private String info;

	@Column(name = "FLAGS")
	private BigDecimal flags;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name = "APPROVED_BY")
	private String approvedBy;

	@Column(name = "APPROVED_DATE")
	private Date approvedDate;

	// @Column(name = "MIN_DISCOUNT_PIPS")
	// private BigDecimal minDiscountPips;

	// @Column(name = "MAX_DISCOUNT_PIPS")
	// private BigDecimal maxDiscountPips;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public CUSTOMER_CATEGORY getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(CUSTOMER_CATEGORY customerCategory) {
		this.customerCategory = customerCategory;
	}
	/*
	 * public BigDecimal getDiscountPips() { return discountPips; }
	 * 
	 * public void setDiscountPips(BigDecimal discountPips) { this.discountPips =
	 * discountPips; }
	 */

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public BigDecimal getFlags() {
		return flags;
	}

	public void setFlags(BigDecimal flags) {
		this.flags = flags;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	/*
	 * public BigDecimal getMinDiscountPips() { return minDiscountPips; }
	 * 
	 * public void setMinDiscountPips(BigDecimal minDiscountPips) {
	 * this.minDiscountPips = minDiscountPips; }
	 * 
	 * public BigDecimal getMaxDiscountPips() { return maxDiscountPips; }
	 * 
	 * public void setMaxDiscountPips(BigDecimal maxDiscountPips) {
	 * this.maxDiscountPips = maxDiscountPips; }
	 */

}
