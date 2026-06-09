package br.com.example.gs01.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.example.gs01.ui.screens.AboutScreen
import br.com.example.gs01.ui.screens.ClimaScreen
import br.com.example.gs01.ui.screens.HomeScreen
import br.com.example.gs01.ui.screens.PoluicaoScreen
import br.com.example.gs01.ui.screens.SplashScreen
import br.com.example.gs01.ui.screens.TemperaturaScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SplashRoute
    ){
        composable<SplashRoute>{
            SplashScreen (
                onNavigateToStart = {
                    navController.navigate(HomeRoute){
                        popUpTo(SplashRoute){
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable<HomeRoute> {
            HomeScreen(
                onAboutClick = {navController.navigate(SobreRoute)},
                onInfoRegioesClick = { info ->
                    when (info.info.lowercase()) {
                        "temperatura" -> navController.navigate(TemperaturaRoute)
                        "clima" -> navController.navigate(ClimaRoute)
                        "poluição", "poluicao" -> navController.navigate(PoluicaoRoute)
                    }
                }
            )
        }

        composable<SobreRoute>{
            AboutScreen {
                navController.popBackStack()
            }
        }

        composable<ClimaRoute> {
            ClimaScreen {
                navController.popBackStack()
            }
        }

        composable<TemperaturaRoute> {
            TemperaturaScreen {
                navController.popBackStack()
            }
        }

        composable<PoluicaoRoute> {
            PoluicaoScreen {
                navController.popBackStack()
            }
        }
    }
}