package no.mattilsynet.routing

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import no.mattilsynet.services.GameEngineRepository
import no.mattilsynet.services.GameEngineService

fun Application.configureSerialization() {
    val gameService = GameEngineService(GameEngineRepository())
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/") {
            call.respond(gameService.process())
        }
    }
}
