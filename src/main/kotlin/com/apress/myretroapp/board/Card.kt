package com.apress.myretroapp.board

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.util.*

data class Card(
    var id: UUID? = null,
    @get:NotNull
    @get:NotBlank(message = "A comment must be provided always")
    val comment: String? = null,
    @get:NotNull(message = "A CardType HAPPY|MEH|SAD must be provided")
    val cardType: CardType? = null,
)
