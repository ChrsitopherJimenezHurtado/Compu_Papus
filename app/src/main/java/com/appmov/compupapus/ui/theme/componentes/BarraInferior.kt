package com.appmov.compupapus.ui.theme.componentes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appmov.compupapus.R


@Composable
fun BarraInferior(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                colorResource(R.color.fondo)
            )
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // boton home
        IconButton(
            // programar accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Inicio",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(35.dp)
            )
        }

        Spacer(modifier = Modifier.size(15.dp))
        // boton reparaciones
        IconButton(
            // programar accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.Build,
                contentDescription = "Reparaciones",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(35.dp)
            )
        }

        Spacer(modifier = Modifier.size(15.dp))
        // boton tienda
        IconButton(
            // programar accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.Storefront,
                contentDescription = "Menú",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(35.dp)
            )
        }

        Spacer(modifier = Modifier.size(15.dp))
        // boton citas
        IconButton(
            // programar accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.CalendarMonth,
                contentDescription = "Menú",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(35.dp)
            )
        }
        Spacer(modifier = Modifier.size(15.dp))
        // boton cuenta
        IconButton(
            // programar accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = "Menú",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(35.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBarraInferior() {
    BarraInferior()
}