package com.enwage.enwagepayroll

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform