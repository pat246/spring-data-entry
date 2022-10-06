package com.me.dataentry.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.me.dataentry.entity.Person;

public interface PersonRepo extends PagingAndSortingRepository<Person, Long> {

}
