package ru.kchvilyov.xwiki.faq

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform