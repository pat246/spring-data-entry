package com.me.dataentry.repo;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.LanguageType;

public interface LanguageTypeRepo extends PagingAndSortingRepository<LanguageType, BigDecimal> {

}
