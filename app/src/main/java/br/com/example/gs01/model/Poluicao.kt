package br.com.example.gs01.model

import kotlinx.serialization.Serializable

@Serializable
data class Poluicao (
    val id: Int,
    val title: String,
    val principalPoluente: String,
    val maisInformacao: String,
    val temperatura: String,
    val velocidadeVento: String,
    val humidade: String
)