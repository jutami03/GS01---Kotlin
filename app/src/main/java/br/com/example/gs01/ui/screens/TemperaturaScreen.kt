package br.com.example.gs01.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.example.gs01.ui.components.UrbanFarmTopBar
import br.com.example.gs01.ui.components.ZonasCard
import br.com.heiderlopes.devfest.data.urbanFarmZonas

@Composable
fun TemperaturaScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            UrbanFarmTopBar(
                title = "Temperaturas",
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
        ) {
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                items(urbanFarmZonas) { maxima ->
                    ZonasCard(
                        zonas = maxima
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TemperaturaScreenPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        TemperaturaScreen(
            onBackClick = {}
        )
    }
}

