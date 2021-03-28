package com.example.things

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider

class EncMongoString(val value: String)

fun encMongoStringSerializer() = object : JsonSerializer<EncMongoString>() {
    override fun serialize(value: EncMongoString, gen: JsonGenerator, serializers: SerializerProvider) {
        println("SERIALIZE")
        gen.writeString(value.value)
    }
}

fun encMongoStringDeserializer() = object : JsonDeserializer<EncMongoString>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): EncMongoString {
        println("DESERIALIZE")
        return EncMongoString(p.text)
    }
}
