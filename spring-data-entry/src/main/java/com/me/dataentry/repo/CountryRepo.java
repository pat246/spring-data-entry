package com.me.dataentry.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.Country;

public interface CountryRepo extends PagingAndSortingRepository<Country, Long> {

}
