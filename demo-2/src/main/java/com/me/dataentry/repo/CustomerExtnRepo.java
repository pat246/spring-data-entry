package com.me.dataentry.repo;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.CustomerExtended;

public interface CustomerExtnRepo extends PagingAndSortingRepository<CustomerExtended, Serializable> {

}
