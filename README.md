# spring-data-entry
## Overview
Spring data rest based service to manage domain objects

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
