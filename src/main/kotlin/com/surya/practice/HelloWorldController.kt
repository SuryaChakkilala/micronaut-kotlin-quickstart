package com.surya.practice

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import jakarta.inject.Inject

@Controller("/hello")
class HelloWorldController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun displayHelloWorld(): String {
        return "Hello, World!"
    }

}