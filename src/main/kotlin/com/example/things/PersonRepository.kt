package com.example.things

import org.springframework.data.mongodb.repository.MongoRepository

interface PersonRepository : MongoRepository<Person, String> {

    fun findByPersonId(personId: Long): Person

}
