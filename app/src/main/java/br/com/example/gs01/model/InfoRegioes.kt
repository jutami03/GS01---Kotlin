package br.com.example.gs01.model

import br.com.example.gs01.repository.regiao1
import br.com.example.gs01.repository.regiao2
import br.com.example.gs01.repository.regiao3
import br.com.example.gs01.repository.regiao4

data class InfoRegioes(
    val info: String,
    val regioes: List<Regioes>
)

fun getAllInfoRegioes(): List<InfoRegioes>{
    return listOf(
        InfoRegioes("Poluição", listOf(regiao1)),
        InfoRegioes("Clima", listOf(regiao1)),
        InfoRegioes("Temperatura", listOf(regiao1)),
        InfoRegioes("Poluição", listOf(regiao2)),
        InfoRegioes("Clima", listOf(regiao2)),
        InfoRegioes("Temperatura", listOf(regiao2)),
        InfoRegioes("Poluição", listOf(regiao3)),
        InfoRegioes("Clima", listOf(regiao3)),
        InfoRegioes("Temperatura", listOf(regiao3)),
        InfoRegioes("Poluição", listOf(regiao4)),
        InfoRegioes("Clima", listOf(regiao4)),
        InfoRegioes("Temperatura", listOf(regiao4)),
    )
}