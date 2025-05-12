package com.apress.myretroapp.board

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.util.*

data class RetroBoard(
    var id: UUID? = null,
    @get:NotNull(message = "A name must be provided")
    @get:NotBlank(message = "A name must be provided")
    val name: String? = null,
    var cards: List<Card> = mutableListOf(),
)
