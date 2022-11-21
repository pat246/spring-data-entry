package com.me.dataentry.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*import com.amg.exchange.registration.model.ContactDetail;
import com.amg.exchange.registration.model.Customer;
import com.amg.exchange.registration.model.CustomerEmploymentInfo;
import com.amg.exchange.registration.model.CustomerLogin;
import com.amg.exchange.remittance.model.AdditionalInstructionData;
import com.amg.exchange.remittance.model.ApplicationAmlCheck;
import com.amg.exchange.remittance.model.BankServiceRule;
import com.amg.exchange.remittance.model.BeneficaryAccount;
import com.amg.exchange.remittance.model.RemiittanceApplication;
import com.amg.exchange.remittance.model.RemitApplAml;
import com.amg.exchange.remittance.model.Remittance;
import com.amg.exchange.remittance.model.RemittanceApplication;
import com.amg.exchange.remittance.model.ServiceApplicabilityRule;
import com.amg.exchange.treasury.deal.supplier.model.ApplicationSetup;
import com.amg.exchange.treasury.deal.supplier.model.DayBookDetails;
import com.amg.exchange.treasury.deal.supplier.model.DayBookHeader;
import com.amg.exchange.treasury.model.BankMaster;
import com.amg.exchange.treasury.model.BeneCountryService;
import com.amg.exchange.treasury.model.CurrencyMaster;
import com.amg.exchange.treasury.model.CurrencyOtherInformation;
import com.amg.exchange.treasury.model.CustomerSpecialDealRequest;
import com.amg.exchange.treasury.model.DailyAccountBalance;
import com.amg.exchange.treasury.model.DailyBalance;
import com.amg.exchange.treasury.model.Data;
import com.amg.exchange.treasury.model.Deal;
import com.amg.exchange.treasury.model.DealConclusionType;
import com.amg.exchange.treasury.model.DealPurchase;
import com.amg.exchange.treasury.model.DealSupplier;
import com.amg.exchange.treasury.model.ExchangeRate;
import com.amg.exchange.treasury.model.FundProjection;
import com.amg.exchange.treasury.model.Message;
import com.amg.exchange.treasury.model.MonthAccountBalance;
import com.amg.exchange.treasury.model.OutrightSwapMaster;
import com.amg.exchange.treasury.model.PipsMaster;
import com.amg.exchange.treasury.model.SpecialDeal;
import com.amg.exchange.treasury.model.SupplierMaster;
import com.amg.exchange.treasury.model.TreasuryDealDetail;
import com.amg.exchange.treasury.model.TreasuryDealHeader;
import com.amg.exchange.treasury.model.TreasuryStandardInstruction;
*/
/*******************************************************************************************************************
 * File : CountryMaster.javam
 * 
 * Project : AlmullaExchange
 * 
 * Package : com.amg.exchange.model
 * 
 * Created : Date : 29-May-2014 5:00:05 pm By : Justin Vincent Revision:
 * 
 * Last Change: Date : 19-Nov-2014 5:51:05 pm By : Nazish Ehsan Hashmi Revision:
 * 
 * Description: TODO
 ********************************************************************************************************************/
//@Cacheable  
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "FS_COUNTRY_MASTER")
public class CountryMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigDecimal countryId;
	private String countryCode;
	private String countryAlpha2Code;
	private String countryAlpha3Code;
	private String countryIsoCode;
	private String countryTelCode;
	private String countryActive;
	private String businessCountry;
	private List<CountryMasterDesc> fsCountryMasterDescs = new ArrayList<CountryMasterDesc>();
	private String createdBy;
	private Date createdDate;
	private String isActive;
	private Date approvedDate;
	private String approvedBy;
	private String countryMobileLength;
	private Integer beneCountryRisk;
	private Integer remitterCountryRisk;
	private Integer ibanLength;
	private String beneNameEditCash;
	private String beneNameEditNonCash;
	private String countryNumericCode;
	
	public CountryMaster(BigDecimal countryId) {
		this.countryId = countryId;
	}

	public CountryMaster(){
		
	}
			


	
	
	@Id
	@GeneratedValue(generator="fs_country_master_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="fs_country_master_seq",sequenceName="FS_COUNTRY_MASTER_SEQ",allocationSize=1)
	@Column(name = "COUNTRY_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getCountryId() {
		return this.countryId;
	}

	public void setCountryId(BigDecimal countryId) {
		this.countryId = countryId;
	}

	@Column(name = "COUNTRY_CODE", precision = 3, scale = 0)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "COUNTRY_ALPHA2_CODE", length = 2)
	public String getCountryAlpha2Code() {
		return this.countryAlpha2Code;
	}

	public void setCountryAlpha2Code(String countryAlpha2Code) {
		this.countryAlpha2Code = countryAlpha2Code;
	}

	@Column(name = "COUNTRY_ALPHA3_CODE", length = 3)
	public String getCountryAlpha3Code() {
		return this.countryAlpha3Code;
	}

	public void setCountryAlpha3Code(String countryAlpha3Code) {
		this.countryAlpha3Code = countryAlpha3Code;
	}

	@Column(name = "COUNTRY_ISO_CODE", length = 20)
	public String getCountryIsoCode() {
		return this.countryIsoCode;
	}

	public void setCountryIsoCode(String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}

	@Column(name = "COUNTRY_TEL_CODE", length = 10)
	public String getCountryTelCode() {
		return this.countryTelCode;
	}

	public void setCountryTelCode(String countryTelCode) {
		this.countryTelCode = countryTelCode;
	}

	@Column(name = "COUNTRY_ACTIVE", length = 1)
	public String getCountryActive() {
		return this.countryActive;
	}

	public void setCountryActive(String countryActive) {
		this.countryActive = countryActive;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "fsCountryMaster")
	@JsonIgnore
	public List<CountryMasterDesc> getFsCountryMasterDescs() {
		return this.fsCountryMasterDescs;
	}

	public void setFsCountryMasterDescs(
			List<CountryMasterDesc> fsCountryMasterDescs) {
		this.fsCountryMasterDescs = fsCountryMasterDescs;
	}

	@Column(name = "BUSINESS_COUNTRY", length = 1)
	public String getBusinessCountry() {
		return businessCountry;
	}

	public void setBusinessCountry(String businessCountry) {
		this.businessCountry = businessCountry;
	}

	@Column(name = "CREATED_BY")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "CREATED_DATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name = "ISACTIVE")
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	@Column(name = "APPROVED_DATE")
	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	
	@Column(name = "APPROVED_BY")
	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	@Column(name = "COUNTRY_MOB_LENGTH")
	public String getCountryMobileLength() {
		return countryMobileLength;
	}

	public void setCountryMobileLength(String countryMobileLength) {
		this.countryMobileLength = countryMobileLength;
	}

	@Column(name = "bene_country_risk")
	public Integer getBeneCountryRisk() {
		return beneCountryRisk;
	}

	public void setBeneCountryRisk(Integer beneCountryRisk) {
		this.beneCountryRisk = beneCountryRisk;
	}

	@Column(name = "remitter_country_risk")
	public Integer getRemitterCountryRisk() {
		return remitterCountryRisk;
	}
	
	public void setRemitterCountryRisk(Integer remitterCountryRisk) {
		this.remitterCountryRisk = remitterCountryRisk;
	}

    public Integer getIbanLength() {
        return ibanLength;
    }

    public void setIbanLength(Integer ibanLength) {
        this.ibanLength = ibanLength;
    }

    @Column(name="BENE_NAME_EDIT_CASH")
    public String getBeneNameEditCash() {
        return beneNameEditCash;
    }

    public void setBeneNameEditCash(String beneNameEditCash) {
        this.beneNameEditCash = beneNameEditCash;
    }

    @Column(name="BENE_NAME_EDIT_NON_CASH")
    public String getBeneNameEditNonCash() {
        return beneNameEditNonCash;
    }

    public void setBeneNameEditNonCash(String beneNameEditNonCash) {
        this.beneNameEditNonCash = beneNameEditNonCash;
    }

    @Column(name="COUNTRY_NUMERIC_CODE")
	public String getCountryNumericCode() {
		return countryNumericCode;
	}

	public void setCountryNumericCode(String countryNumericCode) {
		this.countryNumericCode = countryNumericCode;
	}
}
