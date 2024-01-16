package com.surya.practice

import jakarta.inject.Singleton

@Singleton
class FirstHelloWorldService: HelloWorldService {

    override fun sayHello(): String {
        return "Hello World from First Service"
    }

}