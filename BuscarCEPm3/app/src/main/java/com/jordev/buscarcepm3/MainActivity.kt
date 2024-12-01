package com.jordev.buscarcepm3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jordev.buscarcepm3.ui.theme.BuscarCEPM3Theme
import com.jordev.buscarcepm3.ui.theme.view.BuscarCep
import com.jordev.buscarcepm3.ui.theme.viewmodel.BuscarCepViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuscarCEPM3Theme {



                val navController: NavHostController = rememberNavController()
                val viewModel: BuscarCepViewModel = hiltViewModel()
                NavHost(
                    navController = navController,
                    startDestination = "buscarCep"
                ){
                    composable("buscarCep"){
                        //BuscarCep(navController = navController)
                        BuscarCep(navController = navController, viewModel = viewModel)
                    }
                }



            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}