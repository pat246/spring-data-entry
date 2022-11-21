package com.me.dataentry.repo;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.CountryMaster;

public interface CountryMasterRepo extends PagingAndSortingRepository<CountryMaster, BigDecimal> {

}
