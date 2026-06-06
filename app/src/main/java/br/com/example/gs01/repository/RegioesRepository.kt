package br.com.example.gs01.repository

import br.com.example.gs01.model.InfoRegioes
import br.com.example.gs01.model.Regioes
import br.com.example.gs01.model.getAllInfoRegioes

val regiao1 = Regioes(name = "São Paulo")
val regiao2 = Regioes(name = "Rio de Janeiro")
val regiao3 = Regioes(name = "Santa Catarina")
val regiao4 = Regioes(name = "Minas Gerais")

fun getAllRegioes(): List<Regioes>{
    return listOf(
        regiao1,
        regiao2,
        regiao3,
        regiao4
    )
}

fun getInfosBy(regioes: Regioes): List<InfoRegioes>{
    return getAllInfoRegioes().filter {
        it.regioes.contains(regioes)
    }
}