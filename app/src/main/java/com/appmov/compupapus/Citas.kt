package com.appmov.compupapus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appmov.compupapus.data.Cita
import com.appmov.compupapus.ui.theme.componentes.BarraInferior
import com.appmov.compupapus.ui.theme.componentes.BarraSuperior
import com.appmov.compupapus.ui.theme.componentes.TarjetaCita

@Composable
fun CitasScreen() {

    // lista de citas Solo para muestra
    val citas = listOf(
        Cita(
            equipo = "Acer Xbox 15",
            fechaHora = "09/11/2026",
            tipoServicio = "Mantenimiento",
            detalle = "Sobrecalentamiento del equipo",
            estado = "En espera"
        ),
        Cita(
            equipo = "HP Victus",
            fechaHora = "10/11/2026",
            tipoServicio = "Reparación",
            detalle = "Pantalla dañada",
            estado = "En proceso"
        ),
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
            // Fila de titulo y boton de agrgar citas
            Row(
                modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Citas",
                    fontSize = 30.sp,
                    color = colorResource(R.color.titulos),
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(70.dp))
                // boton agregar cita
                Button(
                    onClick = {},
                    shape = RectangleShape,
                    contentPadding = PaddingValues(
                        horizontal = 8.dp,
                        vertical = 4.dp
                    ),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.fondo))
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Agendar Cita"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Agendar Cita",
                        fontSize = 20.sp,
                        color = colorResource(R.color.textos)
                    )
                }
            }
            // Fin de fila de titulo y boton de agrgar citas

            HorizontalDivider(
                modifier = Modifier.width(300.dp)
                    .align(Alignment.CenterHorizontally),
                thickness = 1.dp,
                color = colorResource(R.color.iconos)
            )

            // Aqui las tarjetas
            LazyColumn {

                items(citas) { cita ->

                    TarjetaCita(
                        cita = cita
                    )

                }

            }
        }
    }
}

//Preview de pantalla
@Preview(showBackground = true)
@Composable
fun PreviewCitas() {
    CitasScreen()
}