package com.example.gradle.services

import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import java.lang.AutoCloseable

abstract class MyService : BuildService<MyService.Params>, AutoCloseable {
    init {
        println("*** MyService init called")


    }

    override fun close() {
        println("*** MyService close called")
    }

    interface Params : BuildServiceParameters {

    }
}
