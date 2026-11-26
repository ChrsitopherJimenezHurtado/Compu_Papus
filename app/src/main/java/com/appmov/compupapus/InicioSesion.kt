package com.appmov.compupapus

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appmov.compupapus.ui.theme.componentes.BarraInferior
import com.appmov.compupapus.ui.theme.componentes.BarraSuperior


@Composable
fun InicioSesionScreen() {
    var correo by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }
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
            , horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Titulo
            Text(
                modifier = Modifier.padding(top = 40.dp),
                text = "INICIO DE SESIÓN",
                fontSize = 35.sp,
                color = colorResource(R.color.titulos)
            )
            // Columna campos
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 35.dp, top = 35.dp, end = 35.dp)
            ) {
                // Campo de correo electrónico
                Text(
                    text = "Correo Electrónico",
                    fontSize = 20.sp,
                    color = colorResource(R.color.textos)
                )
                Spacer(modifier = Modifier.height(30.dp))
                OutlinedTextField(
                    value = correo,
                    onValueChange = { correo = it },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = colorResource(R.color.trazo_tarjeta),
                        unfocusedBorderColor = colorResource(R.color.trazo_tarjeta),
                        focusedContainerColor = colorResource(R.color.relleno),
                        unfocusedContainerColor = colorResource(R.color.relleno)
                    )
                )

                Spacer(modifier = Modifier.height(25.dp))

                // Campo de contraseña
                Text(
                    text = "Contraseña",
                    fontSize = 20.sp,
                    color = colorResource(R.color.textos)
                )
                Spacer(modifier = Modifier.height(30.dp))
                OutlinedTextField(
                    value = contrasena,
                    onValueChange = { contrasena = it },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = colorResource(R.color.trazo_tarjeta),
                        unfocusedBorderColor = colorResource(R.color.trazo_tarjeta),
                        focusedContainerColor = colorResource(R.color.relleno),
                        unfocusedContainerColor = colorResource(R.color.relleno)
                    )
                )
                // fin campos correo y contraseña

                // columna boton, redes y boton registro
                Column(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.width(250.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.boton_relleno))
                    ) {
                        Text(
                            text = "INICIAR SESIÓN",
                            fontSize = 20.sp
                        )
                    }
                    // Separador vertical
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                            .padding(vertical = 25.dp),
                        thickness = 2.dp,
                        color = colorResource(R.color.trazo_tarjeta)
                    )

                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp, start = 20.dp, end = 20.dp)
                            .fillMaxWidth()
                            .height(70.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            // programar accion
                            onClick = { },
                            modifier = Modifier.size(70.dp)
                                .border(
                                    1.dp,
                                    colorResource(R.color.titulos),
                                    CircleShape
                                )
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.facebook_176_svgrepo_com),
                                contentDescription = "Facebook",
                                tint = colorResource(R.color.titulos),
                                modifier = Modifier
                                    .size(45.dp)
                            )
                        }

                        IconButton(
                            // programar accion
                            onClick = { },
                            modifier = Modifier.size(70.dp)
                                .border(
                                    1.dp,
                                    colorResource(R.color.titulos),
                                    CircleShape
                                )
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.instagram_svgrepo_com),
                                contentDescription = "Instagram",
                                tint = colorResource(R.color.titulos),
                                modifier = Modifier
                                    .size(45.dp)
                            )
                        }

                        IconButton(
                            // programar accion
                            onClick = { },
                            modifier = Modifier.size(70.dp)
                                .border(
                                    1.dp,
                                    colorResource(R.color.titulos),
                                    CircleShape
                                )
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.x_twitter_brands_solid_full),
                                contentDescription = "X (Twitter)",
                                tint = colorResource(R.color.titulos),
                                modifier = Modifier
                                    .size(45.dp)
                            )
                        }
                    }

                    Button(
                        onClick = {},
                        modifier = Modifier.width(200.dp)
                            .padding(top = 25.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.boton_relleno))
                    ) {
                        Text(
                            text = "REGISTRARSE",
                            fontSize = 20.sp
                        )
                    }

                    // Fin columna boton, redes y boton registro
                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewInicioSesion(){
    InicioSesionScreen()
}