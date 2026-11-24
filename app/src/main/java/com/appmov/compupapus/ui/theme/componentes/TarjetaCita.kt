package com.appmov.compupapus.ui.theme.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appmov.compupapus.R
import com.appmov.compupapus.data.Cita

@Composable
fun TarjetaCita(
    cita: Cita
){
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(30.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.relleno),
            contentColor = colorResource(R.color.textos)
        ),
        border = BorderStroke(
            1.dp,
            colorResource(R.color.trazo_tarjeta)
        )
    ) {

        // Fila equipo
        Row(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp, end =  5.dp),
                text = "Equipo: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                text = cita.equipo,
                color = colorResource(R.color.textos)
            )
        }

        // Fila fecha y hora
        Row(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp, end =  5.dp),
                text = "Fecha y hora: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                text = cita.fechaHora,
                color = colorResource(R.color.textos)
            )
        }

        // Fila tipo de servicio
        Row(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp, end =  5.dp),
                text = "Tipo de servicio: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                text = cita.tipoServicio,
                color = colorResource(R.color.textos)
            )
        }

        // Fila de detalle
        Row(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp, end = 5.dp),
                text = "Detalle: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                text = cita.detalle,
                color = colorResource(R.color.textos)
            )
        }

        // Columna de avance
        Column(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp),
                text = "Avance: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, bottom = 10.dp)
                    .height(40.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colorResource(R.color.trazo_tarjeta)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = cita.estado,
                    color = colorResource(R.color.textos),
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTarjetas() {
    TarjetaCita(
        cita = Cita(
            equipo = "Acer Xbox 15",
            fechaHora = "09/11/2026",
            tipoServicio = "Mantenimiento",
            detalle = "Sobrecalentamiento del equipo",
            estado = "En espera"
        )
    )
}
