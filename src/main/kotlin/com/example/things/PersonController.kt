package com.example.things

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("person")
class PersonController(private val personRepository: PersonRepository) {

    @GetMapping("/{personId}")
    fun getPerson(@PathVariable("personId") personId: Long): Person {
        return personRepository.findByPersonId(personId)
    }

    @PostMapping("")
    fun save(@RequestBody person: Person) {
        personRepository.save(person)
    }

}
