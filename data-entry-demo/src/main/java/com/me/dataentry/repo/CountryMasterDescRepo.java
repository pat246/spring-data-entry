package com.me.dataentry.repo;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.CountryMasterDesc;

public interface CountryMasterDescRepo extends PagingAndSortingRepository<CountryMasterDesc, BigDecimal> {

}
