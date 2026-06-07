package br.com.example.gs01.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.example.gs01.model.Clima
import br.com.example.gs01.model.Poluicao

@Composable
fun ClimaCard (
    clima: Clima
){
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF69A4FF),
            contentColor = Color.Black
        )
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = clima.title,
                style = MaterialTheme.typography.titleLarge
            )

            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        Spacer(modifier = Modifier.size(8.dp))

        Row(
            modifier = Modifier.fillMaxSize().padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Text(
                text = clima.horario1,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.horario2,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.horario3,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.horario4,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.horario5,
                style = MaterialTheme.typography.titleMedium
            )
        }
        Spacer(modifier = Modifier.size(4.dp))

        Row(
            modifier = Modifier.fillMaxSize().padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            Text(
                text = clima.temperatura1,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.temperatura2,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.temperatura3,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.temperatura4,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = clima.temperatura4,
                style = MaterialTheme.typography.titleMedium
            )
        }
        Spacer(modifier = Modifier.size(4.dp))

        Row(
            modifier = Modifier.fillMaxSize().padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            Row() {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null
                )
                Text(
                    text = clima.chuva1,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row() {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null
                )
                Text(
                    text = clima.chuva2,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row() {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null
                )
                Text(
                    text = clima.chuva3,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row() {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null
                )
                Text(
                    text = clima.chuva4,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row() {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null
                )
                Text(
                    text = clima.chuva5,
                    style = MaterialTheme.typography.titleMedium
                )
            }

        }

        HorizontalDivider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row() {
                Text(
                    text = clima.maisInfo
                )
            }
        }
    }
}