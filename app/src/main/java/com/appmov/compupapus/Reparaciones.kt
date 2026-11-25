package com.appmov.compupapus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appmov.compupapus.data.Reparacion
import com.appmov.compupapus.ui.theme.componentes.BarraInferior
import com.appmov.compupapus.ui.theme.componentes.BarraSuperior
import com.appmov.compupapus.ui.theme.componentes.TarjetaReparacion

@Composable
fun ReparacionessScreen() {
// lista de reparaciones Solo para muestra
    val reparaciones = listOf(
        Reparacion(
            equipo = "Acer Xbox 15",
            fechaRecepcion = "09/11/2026",
            tipoServicio = "Mantenimiento",
            avance = 10
        ),
        Reparacion(
            equipo = "HP Victus",
            fechaRecepcion = "8/11/2026",
            tipoServicio = "Reparación",
            avance = 85
        )
    )

    Scaffold(
        topBar = {
            BarraSuperior()
        },
        bottomBar = {
            BarraInferior()
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(colorResource(R.color.fondo))
        ) {
            // Fila de titulo
            Row(
                modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Reparaciones",
                    fontSize = 30.sp,
                    color = colorResource(R.color.titulos),
                    fontWeight = FontWeight.Bold
                )

            }
            // Fin de fila de titulo

            HorizontalDivider(
                modifier = Modifier.width(300.dp)
                    .align(Alignment.CenterHorizontally),
                thickness = 1.dp,
                color = colorResource(R.color.iconos)
            )

            // Aqui las tarjetas
            LazyColumn {

                items(reparaciones) { reparacion ->

                    TarjetaReparacion(
                        reparacion = reparacion
                    )

                }

            }
        }
    }
}

//Preview de pantalla
@Preview(showBackground = true)
@Composable
fun PreviewReparaciones() {
    ReparacionessScreen()
}