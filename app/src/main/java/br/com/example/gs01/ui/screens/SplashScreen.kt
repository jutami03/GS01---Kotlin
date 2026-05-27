package br.com.example.gs01.ui.screens

import android.window.SplashScreen
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.example.gs01.ui.components.LogoAnimado
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigateToStart: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(6000)
        onNavigateToStart()
    }

    Scaffold { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
            contentAlignment = Alignment.Center
        ){
            LogoAnimado()
        }
    }
}
