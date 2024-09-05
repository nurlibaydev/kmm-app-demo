package kaa.nurlibay.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform