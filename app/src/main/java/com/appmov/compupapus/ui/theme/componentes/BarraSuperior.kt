package com.appmov.compupapus.ui.theme.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.IconButton
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.colorResource
import com.appmov.compupapus.R
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BarraSuperior() {
    var busqueda by remember { mutableStateOf("") }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                colorResource(R.color.fondo)
            )
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // boton del menu
        IconButton(
            // programar accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menú",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(30.dp)
            )
        }
        // campo de busquea
        OutlinedTextField(
            value = busqueda,
            onValueChange = { busqueda = it },
            modifier = Modifier.weight(1f)
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
            // texto para usuarios
            placeholder = {
                Text("Buscar producto...")
                colorResource(R.color.textos)
            },
            // para el color del campo
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = colorResource(R.color.iconos),
                unfocusedBorderColor = colorResource(R.color.iconos)
            ),
            //icono de buscar
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Buscar"
                )
            }
        )
        // boton de carrito
        IconButton(
            // programar la accion
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Carrito",
                tint = colorResource(R.color.iconos),
                modifier = Modifier
                    .size(30.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBarraSuperior() {
    BarraSuperior()
}