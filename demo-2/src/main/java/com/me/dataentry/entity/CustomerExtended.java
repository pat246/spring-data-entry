package com.me.dataentry.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "FS_CUSTOMER_EXTENDED")
@Proxy(lazy = false)
public class CustomerExtended implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8980410887430716313L;

	@Id
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false, precision = 22, scale = 0)
	private BigDecimal customerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUST_CAT_MASTER_ID")
	private CustomerCategoryDiscount customerCategoryDiscount;

	@Column(name = "LAST_YEAR_TRN_VALUE")
	private BigDecimal lastYearTrnValue;

	@Column(name = "LAST_YEAR_NO_OF_TRN")
	private BigDecimal lastYearNoOfTrn;

	@Column(name = "LAST_YEAR_REVENUE")
	private BigDecimal lastYearRevenue;

	@Column(name = "LAST_YEAR_REVN_NO_OF_TRN")
	private BigDecimal lastYearRevenueNoOfTrn;

	@Column(name = "TRN_VAL_REDUCED_DT")
	private Date trnValReducedDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	public BigDecimal getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public CustomerCategoryDiscount getCustomerCategoryDiscount() {
		return customerCategoryDiscount;
	}

	public void setCustomerCategoryDiscount(CustomerCategoryDiscount customerCategoryDiscount) {
		this.customerCategoryDiscount = customerCategoryDiscount;
	}

	public BigDecimal getLastYearTrnValue() {
		return lastYearTrnValue;
	}

	public void setLastYearTrnValue(BigDecimal lastYearTrnValue) {
		this.lastYearTrnValue = lastYearTrnValue;
	}

	public BigDecimal getLastYearNoOfTrn() {
		return lastYearNoOfTrn;
	}

	public void setLastYearNoOfTrn(BigDecimal lastYearNoOfTrn) {
		this.lastYearNoOfTrn = lastYearNoOfTrn;
	}

	public BigDecimal getLastYearRevenue() {
		return lastYearRevenue;
	}

	public void setLastYearRevenue(BigDecimal lastYearRevenue) {
		this.lastYearRevenue = lastYearRevenue;
	}

	public BigDecimal getLastYearRevenueNoOfTrn() {
		return lastYearRevenueNoOfTrn;
	}

	public void setLastYearRevenueNoOfTrn(BigDecimal lastYearRevenueNoOfTrn) {
		this.lastYearRevenueNoOfTrn = lastYearRevenueNoOfTrn;
	}

	public Date getTrnValReducedDate() {
		return trnValReducedDate;
	}

	public void setTrnValReducedDate(Date trnValReducedDate) {
		this.trnValReducedDate = trnValReducedDate;
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

}
