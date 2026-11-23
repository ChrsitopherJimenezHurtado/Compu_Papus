package com.appmov.compupapus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.appmov.compupapus.ui.theme.CompuPapusTheme
import com.appmov.compupapus.ui.theme.componentes.BarraInferior
import com.appmov.compupapus.ui.theme.componentes.BarraSuperior

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompuPapusTheme {
                CompuPapusScreen()
            }
        }
    }
}

@Composable
fun CompuPapusScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        BarraSuperior()
        Spacer(modifier = Modifier.weight(1f))
        // Pantallas
        Text("Aqui van las pantallas")
        // fin de pantallas
        Spacer(modifier = Modifier.weight(1f))
        BarraInferior()
    }
}

//Preview de pantalla
@Preview(showBackground = true)
@Composable
fun PreviewCompuPapusScreen() {
    CompuPapusTheme {
        CompuPapusScreen()
    }
}