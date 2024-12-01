package com.jordev.buscarcepm3.ui.theme.view

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.jordev.buscarcepm3.ui.theme.Teal700
import com.jordev.buscarcepm3.ui.theme.WHITE
import com.jordev.buscarcepm3.ui.theme.componentes.Botao
import com.jordev.buscarcepm3.ui.theme.componentes.CaixaTexto
import com.jordev.buscarcepm3.ui.theme.viewmodel.BuscarCepViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BuscarCep(
    navController: NavController,
    viewModel: BuscarCepViewModel = hiltViewModel()
){
    var inputCep by remember{mutableStateOf("")}
    var inputLogradouro by remember{mutableStateOf("")}
    var inputBairro by remember{mutableStateOf("")}
    var inputCidade by remember{mutableStateOf("")}
    var inputEstado by remember{mutableStateOf("")}
    val context = LocalContext.current

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Buscador de Cep", fontSize = 18.sp)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Teal700,
                    titleContentColor = WHITE
                )

            )
        }
    ) { paddingValues ->

        Column (
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ){
            Row(
                modifier = Modifier.fillMaxWidth()
            ){
                CaixaTexto(
                    value = inputCep,
                    onValueChange = {
                        inputCep = it
                    },
                    label = "Cep",
                    modifier = Modifier
                        .width(200.dp)
                        .padding(20.dp, 50.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                Botao(
                    onClick = {
                        Toast.makeText(context, viewModel.valor(), Toast.LENGTH_SHORT).show()
                    },
                    texto = "Buscar Cep",
                    modifier = Modifier
                        .padding(0.dp, 59.dp, 20.dp, 10.dp)
                        .height(55.dp)

                )

            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                CaixaTexto(
                    value = inputLogradouro,
                    onValueChange = {
                        inputLogradouro = it
                    },
                    label = "Logradouro",
                    modifier = Modifier
                        //.width(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )

                CaixaTexto(
                    value = inputBairro,
                    onValueChange = {
                        inputBairro = it
                    },
                    label = "Bairro",
                    modifier = Modifier
                        //.width(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )

                CaixaTexto(
                    value = inputCidade,
                    onValueChange = {
                        inputCidade = it
                    },
                    label = "Cidade",
                    modifier = Modifier
                        //.width(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )

                CaixaTexto(
                    value = inputEstado,
                    onValueChange = {
                        inputEstado = it
                    },
                    label = "Estado",
                    modifier = Modifier
                        //.width(200.dp)
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )

                Botao(
                    onClick = {

                    },
                    texto = "Avançar",
                    modifier = Modifier
                        .padding(20.dp)
                        .height(55.dp)
                        .fillMaxWidth()

                )
            }

        }


    }
}

@Preview(showBackground = true)
@Composable
fun BuscarCepPreviw(){
    //BuscarCep()

}