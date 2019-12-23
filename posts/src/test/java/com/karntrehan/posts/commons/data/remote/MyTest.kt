package com.karntrehan.posts.commons.data.remote

import org.junit.Test

class MyTest {

    val lazyValue:String by lazy {
            println("computed")
            "hello"
    }

    @Test
    fun test(){

        println(lazyValue)

        println(lazyValue)
    }
}