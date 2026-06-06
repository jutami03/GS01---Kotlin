package br.com.example.gs01.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import br.com.example.gs01.model.Regioes

@Composable
fun RegioesCard(
    regioes: Regioes,
    onClick: ((Regioes) -> Unit)? = null
) {
    Card(
        shape = CircleShape,
        modifier = Modifier.size(100.dp)
            .clickable(enabled = onClick != null) {
                onClick?.invoke(regioes) },
        elevation =
            CardDefaults.cardElevation(
                defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(regioes.name, textAlign = TextAlign.Center)
        }
    }
}
