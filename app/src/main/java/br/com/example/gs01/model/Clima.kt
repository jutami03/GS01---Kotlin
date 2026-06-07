package br.com.example.gs01.model

import kotlinx.serialization.Serializable

@Serializable
data class Clima (
    val id: Int,
    val title: String,
    val horario1: String,
    val horario2: String,
    val horario3: String,
    val horario4: String,
    val horario5: String,
    val temperatura1: String,
    val temperatura2: String,
    val temperatura3: String,
    val temperatura4: String,
    val temperatura5: String,
    val chuva1: String,
    val chuva2: String,
    val chuva3: String,
    val chuva4: String,
    val chuva5: String,
    val maisInfo: String,
)