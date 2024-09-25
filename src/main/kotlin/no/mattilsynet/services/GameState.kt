package no.mattilsynet.services

import kotlinx.serialization.Serializable

@Serializable
data class GameState(
    val positionX: Int,
    val positionY: Int,
)