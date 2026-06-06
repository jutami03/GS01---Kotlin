package br.com.example.gs01.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.example.gs01.model.ZonasCategory

@Composable
fun ZonasBadge (
    category: ZonasCategory
){
    val color = when (category) {
        ZonasCategory.NORTE -> Color(0xFFE91E63)
        ZonasCategory.SUL -> Color(0xFF03A9F4)
        ZonasCategory.LESTE -> Color(0xFF673AB7)
        ZonasCategory.OESTE -> Color(0xFF4CAF50)
    }

    Text(
        text = category.name,
        color = Color.White,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color)
            .padding(horizontal = 10.dp, vertical = 4.dp),
        style = MaterialTheme.typography.labelMedium
    )
}