package com.me.dataentry.repo;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.CustomerCategoryDiscount;

public interface CustCatDisc extends PagingAndSortingRepository<CustomerCategoryDiscount, BigDecimal> {

}
