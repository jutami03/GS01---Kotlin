package br.com.example.gs01.model

import kotlinx.serialization.Serializable

@Serializable
data class Zonas (
    val id: Int,
    val title: String,
    val maxima: String,
    val minima: String,
    val category: ZonasCategory
)