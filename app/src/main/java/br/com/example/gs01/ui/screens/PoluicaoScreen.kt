package br.com.example.gs01.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.example.gs01.data.urbanFarmPoluicao
import br.com.example.gs01.ui.components.PoluicaoCard
import br.com.example.gs01.ui.components.UrbanFarmTopBar
import br.com.example.gs01.ui.components.ZonasCard
import br.com.heiderlopes.devfest.data.urbanFarmZonas

@Composable
fun PoluicaoScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            UrbanFarmTopBar(
                title = "Poluição",
                showBackButton = true,
                onBackClick = onBackClick
            )
        }
    ){ paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp)
        ){
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Text(
                        text = "Poluentes do Ar",
                        style = MaterialTheme.typography.titleLarge
                    )
                }
                item {
                    Text(
                        text = "Qual é a qualidade do ar atual em minha cidade?",
                        style = MaterialTheme.typography.titleMedium
                    )
                }

                items(urbanFarmPoluicao) { principalPoluente ->
                    PoluicaoCard(
                        poluicao = principalPoluente
                    )
                }

                item {
                    Text(
                        text = "Índice de qualidade do ar (AQI⁺) e poluição do ar por PM2.5 em sua cidade."
                    )
                }

                item {
                    Text(
                        text = "Legenda:",
                        style = MaterialTheme.typography.titleMedium
                    )
                }

                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        Row() {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null
                            )
                            Text(
                                text = "Temperatura"
                            )
                        }

                        Row() {
                            Icon(
                                imageVector = Icons.Default.Send,
                                contentDescription = null
                            )
                            Text(
                                text = "Velocidade do Vento"
                            )
                        }

                        Row() {
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = null
                            )
                            Text(
                                text = "Humidade do Ar"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PoluicaoScreenPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        PoluicaoScreen(
            onBackClick = {}
        )
    }
}

