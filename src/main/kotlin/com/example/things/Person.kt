@file:Suppress("NonAsciiCharacters")

package com.example.things

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "person")
data class Person(
    @Id
    val id: String = "",
    val personId: Long,
    var 이름: String,
    var 주민등록번호: EncMongoString,
)
