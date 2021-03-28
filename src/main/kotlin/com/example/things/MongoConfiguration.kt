package com.example.things

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import org.springframework.data.mongodb.core.convert.MongoCustomConversions

@Configuration
class MongoConfiguration {

    @Bean
    fun customConversions(): MongoCustomConversions {
        val converters = listOf(
            EncMongoStringToStringConverter(),
            StringToEncMongoStringConverter()
        )
        return MongoCustomConversions(converters)
    }

    internal class EncMongoStringToStringConverter : Converter<EncMongoString, String> {
        override fun convert(source: EncMongoString): String? {
            println("CONVERT")
            return CryptUtils.encrypt(source.value)
        }
    }

    internal class StringToEncMongoStringConverter : Converter<String, EncMongoString> {
        override fun convert(source: String): EncMongoString {
            println("CONVERT")
            return EncMongoString(CryptUtils.decrypt(source))
        }
    }

}
