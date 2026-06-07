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
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.example.gs01.data.urbanFarmClima
import br.com.example.gs01.data.urbanFarmPoluicao
import br.com.example.gs01.ui.components.ClimaCard
import br.com.example.gs01.ui.components.PoluicaoCard
import br.com.example.gs01.ui.components.UrbanFarmTopBar

@Composable
fun ClimaScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            UrbanFarmTopBar(
                title = "Clima",
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
                        text = "Previsão do Tempo",
                        style = MaterialTheme.typography.titleLarge
                    )
                }

                items(urbanFarmClima) { title ->
                    ClimaCard(
                        clima = title
                    )
                }

                item {
                    Text(
                        text = "Previsão para os próximos dias:",
                        style = MaterialTheme.typography.titleMedium
                    )
                }

                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Segunda-Feira |"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Text(
                                text = "23°"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null
                            )
                            Text(
                                text = "11°"
                            )
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null
                            )
                            Text(
                                text = "5%"
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Terça-Feira |"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Text(
                                text = "24°"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null
                            )
                            Text(
                                text = "12°"
                            )
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null
                            )
                            Text(
                                text = "10%"
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Quarta-Feira |"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Text(
                                text = "21°"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null
                            )
                            Text(
                                text = "14°"
                            )
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null
                            )
                            Text(
                                text = "90%"
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Quinta-Feira |"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Text(
                                text = "21°"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null
                            )
                            Text(
                                text = "16°"
                            )
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null
                            )
                            Text(
                                text = "60%"
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Sexta-Feira |"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowUp,
                                contentDescription = null
                            )
                            Text(
                                text = "22°"
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null
                            )
                            Text(
                                text = "17°"
                            )
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null
                            )
                            Text(
                                text = "70%"
                            )
                        }
                    }
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
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null
                            )
                            Text(
                                text = "Chance de Chuva"
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
fun ClimaScreenPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        ClimaScreen(
            onBackClick = {}
        )
    }
}

