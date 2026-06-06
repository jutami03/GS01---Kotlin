package br.com.example.gs01.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.example.gs01.model.getAllInfoRegioes
import br.com.example.gs01.repository.getAllRegioes
import br.com.example.gs01.repository.getInfosBy
import br.com.example.gs01.ui.components.InfoRegioesCardList
import br.com.example.gs01.ui.components.RegioesCard
import br.com.example.gs01.ui.components.UrbanFarmTopBar

@Composable
fun HomeScreen(
    onAboutClick: () -> Unit,
) {
    var regioesState by remember { mutableStateOf(getAllRegioes()) }
    var infoRegioesState by remember { mutableStateOf(getAllInfoRegioes()) }

    Scaffold(
        topBar = {
            UrbanFarmTopBar(
                title = "UrbanFarm",
                actions = {
                    IconButton(
                        onClick = onAboutClick
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Sobre"
                        )
                    }
                }
            )
        }
    ){paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(regioesState){regioes ->
                    RegioesCard(regioes){
                        infoRegioesState = getInfosBy(it)
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn(modifier =
                Modifier.fillMaxWidth().padding(8.dp)) {
                items(infoRegioesState) { info ->
                    InfoRegioesCardList(info)
                }
            }
        }
    }
}