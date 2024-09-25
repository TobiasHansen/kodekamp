package no.mattilsynet.services

class GameEngineService (private val gameEngineRepository: GameEngineRepository) {
    fun process(): Player {
        return gameEngineRepository.process()
    }
}