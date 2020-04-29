# Blog-engine

Spring Boot training project. Blog engine backend.

----
## Stack used
* Java 11
* Spring Boot 2.2
* Postgres 12

----
## Getting Started

Clone repo to your machine


```
$ git clone ${repo.url}
```

## Prerequisites
1. JDK >= 11
2. docker-compose
3. IntellijIDEA :)

----
## Setup and running if you have not postgres on your local machine
1. run docker-compose up -d, this will deploy Postgres 12 container. Share a drive to docker if you are on Windows
2. run project in IntellijIDEA
3. Goto [http://localhost:8080](http://localhost:8080)

## Setup for users, who already have postgres on local machine
1. run init.sql in you psql console db.changelog/init/init.sql
2. mvn -DskipTests=true clean package
3. mvn -DskipTests=true liquibase:update -f pom.xml
4. run application
