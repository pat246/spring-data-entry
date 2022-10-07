# spring-data-entry
## Overview
Spring data rest based service to manage domain objects. On top of spring data rest, it provides custom json response to cater to react front-end. Use this along with UI project at <a href="https://github.com/pat246/data-entry">Data Entry UI</a>

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

## Note on domain model
1. App uses spring data rest's power to display available domain model and it's meta data
2. Field with  onetoone and manytoone relationship are supported. Other relationships i.e. onetomany and manytomany need to be manually ignored either by removing from domain model or by using JsonIgnore annotation e.g.

`

	@JsonIgnore
    public List<State> getStates() {
        return states;
    }
    
    @JsonIgnore
    public void setStates(List<State> states) {
        this.states = states;
    }
`

