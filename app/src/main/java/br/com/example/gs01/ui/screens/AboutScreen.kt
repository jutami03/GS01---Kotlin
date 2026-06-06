package br.com.example.gs01.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.example.gs01.ui.components.UrbanFarmTopBar

@Composable
fun AboutScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            UrbanFarmTopBar(
                title = "Sobre",
                showBackButton = true,
                onBackClick = onBackClick
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text(
                text = "O que é o DevSpace?",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "O UrbanFarm é uma iniciativa sustentável que utiliza dados de satélites e inteligência artificial para " +
                        "monitorar clima, poluição e temperatura urbana, auxiliando redes de agricultura familiar em coberturas" +
                        "verdes para reduzir ilhas de calor, aumentar áreas verdes e fortalecer a segurança alimentar nas cidades.",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        AboutScreen(
            onBackClick = {}
        )
    }
}