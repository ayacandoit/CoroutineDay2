package com.example.myapplication

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

suspend fun main(): Unit = coroutineScope {
    val sharedSta = MutableStateFlow(0)


    launch {
        sharedSta.collect {
            println(it)
        }
    }

    sharedSta.emit(1)
    sharedSta.emit(2)
    sharedSta.emit(3)
}