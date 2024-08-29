package com.jordev.buscarcepm3.ui.theme.componentes

import android.widget.Button
import android.widget.EditText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jordev.buscarcepm3.ui.theme.Teal700
import com.jordev.buscarcepm3.ui.theme.WHITE

@Composable
fun Botao(
    onClick: () -> Unit,
    texto: String,
    modifier: Modifier = Modifier
){
    Button(
        onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Teal700
        ),
        modifier = modifier
    ) {
        Text(text = texto, fontSize = 18.sp, color = WHITE, fontWeight = FontWeight.Bold)


    }

}