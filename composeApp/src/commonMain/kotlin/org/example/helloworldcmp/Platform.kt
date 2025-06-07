package org.example.helloworldcmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform