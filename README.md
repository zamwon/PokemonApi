# JIT Task
> Problem Statement:
Jit Team intership Java exercise - create your own Pokedex!

Task is to create simple app that provides endpoints to manage pokemons.

Main points:
- Use Spring Boot to create REST api;
- Get all and getById;
- Add, delete and update Pokemon;
- Create DB to store data about Pokemons;
- Create ReadMe file

Additional points:
- Clean RESTful API;
- Create Test;
- Search Pokemons by types and name;
- Pagination;
- Authentication;
- Create API documentation
- Error Handling

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Contact](#contact)

## General info
Intern task for Jit Team.

## Technologies
- JAVA
- Sprin Boot 2
- Swagger 2
- Thymeleaf

## Setup
Application provide two method of usage:
1. "Choose http://localhost:8080/swagger-ui.html method ->  for using Swagger UI documentaton;
2. Lunch "POSTMAN" or other API development platform and operate with those endpoints:
-GET http://localhost:8080/pokemon/{id} - Find desired pokemon by id (skip {} )
-GET http://localhost:8080/pokemon/name/Name - Find desired pokemon by name -> Provide name with Capital letter 
-GET http://localhost:8080/pokemon/type/Type - Find desired pokemon by type -> Provide type with Capital letter
-GET http://localhost:8080/pokemon/all - Show all pokemons in Pokedex
-POST http://localhost:8080/pokemon/add-pokemon -> Add pokemon to Pokedex -> Provide body in format:
  {
    "pokemonId": {8},
    "name": "Name",
    "type": "Type"
    }
-PUT http://localhost:8080/pokemon -> Modify pokemon entry-> Provide body as JSON format
-PATCH http://localhost:8080/pokemon/{id} -> Modify pokemon field (name or type) if pokemon with provided id exist -> Provide body as JSON format
-DELETE http://localhost:8080/pokemon/{id} -> Delete pokemon with provided id

Todo
3. "Choose http://localhost:8080/ method ->  for entering INDEX page. Now you can navigate with buttons




## Contact
Created by Błażej Karnecki
blazej.karnecki@gmail.com
