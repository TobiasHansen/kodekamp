package no.mattilsynet.services

import kotlinx.serialization.Serializable

@Serializable
data class Player(
    val name: String,
)