package com.smconstruct.kmpwebsocketprovider

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform