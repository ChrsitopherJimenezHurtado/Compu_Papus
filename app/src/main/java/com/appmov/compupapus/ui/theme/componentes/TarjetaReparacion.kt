package com.appmov.compupapus.ui.theme.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appmov.compupapus.R
import com.appmov.compupapus.data.Reparacion

@Composable
fun TarjetaReparacion(
    reparacion: Reparacion
){
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 30.dp, top = 15.dp, end = 30.dp, bottom = 15.dp),
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
                text = reparacion.equipo,
                color = colorResource(R.color.textos)
            )
        }

        // Fila fecha de recepcion
        Row(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp, end =  5.dp),
                text = "Fecha de recepción: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                text = reparacion.fechaRecepcion,
                color = colorResource(R.color.textos)
            )
        }

        // Columna de servicio
        Column(
            modifier = Modifier.padding(top = 3.dp, start = 3.dp, end = 3.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp),
                text = "Tipo de servicio: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                modifier = Modifier.padding(start = 10.dp, bottom = 5.dp),
                text = reparacion.tipoServicio,
                color = colorResource(R.color.textos)
            )

            HorizontalDivider(
                modifier = Modifier.fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                thickness = 2.dp,
                color = colorResource(R.color.trazo_tarjeta)
            )

            // seccion avance
            Text(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp),
                text = "Avance: ",
                color = colorResource(R.color.textos),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            //Linea de progreso
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
                    .height(30.dp)
                    .clip(RoundedCornerShape(50))
                    .background(colorResource(R.color.trazo_tarjeta))
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(reparacion.avance / 100f)
                        .clip(
                            RoundedCornerShape(
                                topStart = 50.dp,
                                bottomStart = 50.dp,
                                topEnd = if (reparacion.avance == 100) 50.dp else 0.dp,
                                bottomEnd = if (reparacion.avance == 100) 50.dp else 0.dp
                            )
                        )
                        .background(colorResource(R.color.boton_relleno))
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
            Row (
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 5.dp, bottom = 10.dp)
                , horizontalArrangement = Arrangement.Center

            ){
                Text(
                    modifier = Modifier.padding(start = 10.dp, bottom = 5.dp),
                    text = "Proceso de servicio al:",
                    color = colorResource(R.color.textos),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    modifier = Modifier.padding(start = 10.dp, bottom = 5.dp),
                    text = "${reparacion.avance} %",
                    color = colorResource(R.color.textos)
                )
            }
        }
    }
}

