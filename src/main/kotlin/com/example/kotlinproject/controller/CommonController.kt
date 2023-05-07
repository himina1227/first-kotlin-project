package com.example.kotlinproject.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CommonController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello kotlin"
    }

    @RequestMapping(method = [RequestMethod.GET], path = ["/reqeust-mapping"])
    fun requestMapping(): String {
        return "request-mapping"
    }

    @GetMapping("/get/{name}/{age}")
    fun path(@PathVariable name: String, @PathVariable age:Int): String {
        println("${name}, ${age}")
        return name + " " + age
    }

    @GetMapping("/get2/{name}/{age}")
    fun path2(@PathVariable(value = "name") _name: String, @PathVariable age:Int): String {
        val name = "kotlin"
        println("${_name}, ${age}")
        return name + " " + age
    }
}