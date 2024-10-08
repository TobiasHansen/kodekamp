package no.mattilsynet

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import no.mattilsynet.routing.*

fun main() {
    System.setProperty("io.ktor.development", "true")

    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module, watchPaths = listOf("classes"))
        .start(wait = true)
}

fun Application.module() {
    configureGameRoutes()
}
