package br.com.heiderlopes.devfest.data

import br.com.example.gs01.model.Zonas
import br.com.example.gs01.model.ZonasCategory

val urbanFarmZonas = listOf(

    Zonas(
        id = 1,
        title = "Sol com muitas nuvens durante o dia e períodos de céu nublado. Noite com muitas nuvens.",
        maxima = "23°",
        minima = "16°",
        description = "Como o Jetpack Compose está mudando a forma como desenvolvemos interfaces para Android.",
        category = ZonasCategory.NORTE
    ),

    Zonas(
        id = 2,
        title = "Dia de sol, com nevoeiro ao amanhecer. As nuvens aumentam no decorrer da tarde.",
        maxima = "24°",
        minima = "14°",
        description = "Como o SwiftUI tem revolucionado o desenvolvimento de interfaces no ecossistema Apple.",
        category = ZonasCategory.SUL
    ),

    Zonas(
        id = 3,
        title = "Dia de sol com névoa fraca ao amanhecer e à noite.",
        maxima = "26°",
        minima = "19°",
        description = "Uma introdução prática à arquitetura limpa com Flutter e Dart.",
        category = ZonasCategory.LESTE
    ),

    Zonas(
        id = 4,
        title = "Sol com muitas nuvens. Pancadas de chuva à tarde e à noite.",
        maxima = "25°",
        minima = "17°",
        description = "Utilizando Platform Channels para acessar recursos Android e iOS no Flutter.",
        category = ZonasCategory.OESTE
    )
)