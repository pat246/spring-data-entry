package com.me.dataentry.repo;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.State;

public interface StateRepo extends PagingAndSortingRepository<State, Long> {

}
