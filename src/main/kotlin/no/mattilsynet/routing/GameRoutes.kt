package no.mattilsynet.routing

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.receive
import io.ktor.server.response.*
import io.ktor.server.routing.*
import no.mattilsynet.services.GameEngineRepository
import no.mattilsynet.services.GameEngineService
import no.mattilsynet.services.GameState
import no.mattilsynet.services.Player

fun Application.configureGameRoutes() {
    val gameService = GameEngineService(GameEngineRepository())
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/") {
            call.respond(gameService.process())
        }
        post("{id}") {
            val id = call.parameters["id"]
            val gameState = call.receive<GameState>()
            call.respond(Player("New name " + id))
        }
    }
}
