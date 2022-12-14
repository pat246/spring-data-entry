# spring-data-entry
## Overview
Spring data-rest backed service to manage JPA Entities. Front end is built using react library (ver. 17)
To start with basics, it only needs: 
1. JPA Entity class 
2. Spring Repository interface for that Entity

For quick demo, clone this repo and run spring boot application `data-entry-demo` which runs on default port 8080 (i.e. http://localhost:8080)

## UI overview
[Click Here](https://master.d3jr63qkm8f6fy.amplifyapp.com/) to see overview of UI 

## lib-data-entry
Add this dependancy to your spring boot application so it will start exposing spring data-rest endpoints

## data-entry-demo
Demo spring boot application using lib-data-entry project. It uses h2 db for demo purpose. Run this demo project to evaluate this feature.
Quick UI skin can be checked out at `https://master.d3jr63qkm8f6fy.amplifyapp.com/catlog`

## Versions
1. Java - 1.8
2. Spring boot - 2.6.1

## application.properties (Database configuration)
spring.datasource.url=jdbc:h2:file:~/Documents/testdb3 \
spring.datasource.username=root \
spring.datasource.password=root

## rest-messages.properties 
This file stores display name for domain object \
rest.description.(domain name) = (display name) \
e.g. `rest.description.person=A collection of people`

## Notes on domain model
1. App uses spring data rest's power to display available domain model and it's meta data
2. Field with  onetoone and manytoone relationship are supported. Other relationships i.e. onetomany and manytomany need to be manually ignored either by removing from domain model or by using JsonIgnore annotation e.g.
`    @JsonIgnore
    public List<State> getStates() {
        return states;
    }   
    @JsonIgnore
    public void setStates(List<State> states) {
        this.states = states;
    }
`

3. Fields with OneToOne and ManyToOne relationship, are treated as dropdown selection which by default shows all the data available in table. To pick particular column in dropdown, implement interface `DropDownEntity's get_value()` method and return whatever value you wish to show in UI.
4. Each field in JPA Entity must have matching field name with getter , setter methods otherwise that field may not be visible while adding/modifying the entity
5. Each `org.springframework.data.repositoryRepository` interface must have same id type as defined in entity's primary key otherwise , we may get conversion error while modifying data.
Don't use serialization interface as type
6. Currently server side pagination is not available so `PagingAndSortingRepository` is not supported.
