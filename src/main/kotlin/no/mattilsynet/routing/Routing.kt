package no.mattilsynet.routing

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/text") {
            call.respondText("gameService.process().name")
        }
    }
}
