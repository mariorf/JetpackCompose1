package com.example.compose.tutorial

object SampleData {
    data class Message(
        val author: String,
        val body: String
    )

    val conversationSample = listOf(
        Message(
            "Sillius",
            "Las sombras me hablan!!!!!!!!"
        ),
        Message(
            "Sillius",
            "Tengo las patas dobladas"
        ),
        Message(
            "Sillius",
            "Estoy conspirando con los gnomos para bombardear la casa blanca."
        ),
        Message(
            "Sillius",
            "¿Las paredes tienen ojos o soy yo quien los ve? No puedo estar seguro."
        ),
        Message(
            "Sillius",
            "¿Has probado el nuevo sabor de croquetas con sabor a gasolina?"
        ),
        Message(
            "Sillius",
            "Las sirenas son reales el gobierno hará todo lo posible para silenciarme"
        ),
        Message(
            "Sillius",
            "He encontrado donde se esconde Sadam Hussein"
        ),
        Message(
            "Sadam Hussein",
            "?"
        ),
    )
}
