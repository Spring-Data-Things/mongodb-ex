//package com.example.things
//
//import org.bson.Document
//import org.springframework.core.convert.converter.Converter
//import org.springframework.data.convert.ReadingConverter
//import org.springframework.data.convert.WritingConverter
//import org.springframework.stereotype.Component
//
//@Component
//@ReadingConverter
//class 주민등록번호ReadConverter : Converter<Document, Person> {
//    override fun convert(source: Document): Person? {
//        var personId = source["personId"] as Long
//        var 이름 = source["이름"] as String
//        var 주민등록번호 = source["주민등록번호"] as String
//        return Person("", personId, 이름, CryptUtils.decrypt(주민등록번호))
//    }
//}
//
//@Component
//@WritingConverter
//class 주민등록번호WriteConverter : Converter<Person, Document> {
//    override fun convert(source: Person): Document? {
//        val document = Document()
//        document["personId"] = source.personId
//        document["이름"] = source.이름
//        document["주민등록번호"] = CryptUtils.encrypt(source.주민등록번호)
//        return document
//    }
//}
