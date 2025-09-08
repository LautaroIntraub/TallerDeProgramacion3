package com.example.primerapp.ui.screens

import SignButton
import SocialMediaComponent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapp.R
import com.example.primerapp.ui.components.LoginPlace
import com.example.primerapp.ui.theme.Poppins

@Composable
fun LoginScreen(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        // Dibujar círculos de fondo
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(
                color = Color(0xFF662AFF).copy(alpha = 0.2f),
                radius = size.minDimension / 2.5f,
                center = Offset(x = size.width * 0.9f, y = size.height * 0.02f)
            )
        }
        Column(
            modifier = Modifier.fillMaxSize().padding(5.dp).verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.padding(20.dp))
            Text(
                stringResource(R.string.login_here),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color(0xFF662AFF),
                fontFamily = Poppins,
                fontSize = 28.sp,
                lineHeight = 38.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.padding(15.dp))
            Text(
                stringResource(R.string.welcome_back),
                fontFamily = Poppins,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.padding(15.dp))

            LoginPlace(modifier = Modifier)
            Text(
                text = stringResource(R.string.forgot_password),
                color = Color.Black,
                fontSize = 12.sp,
                modifier = Modifier
                    .align(Alignment.End)
                    .clickable {
                        // Acción de recuperación
                    }
            )

            Spacer(modifier = Modifier.padding(7.dp))

            SignButton(
                modifier = Modifier.padding(20.dp).align(Alignment.CenterHorizontally),
                text = stringResource(R.string.sign_in_btn)
            ) {}
            Text(
                stringResource(R.string.or_create_account),
                fontFamily = Poppins,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 10.dp)
            )

            Spacer(modifier = Modifier.padding(20.dp))

            Text(
                stringResource(R.string.social_media),
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            SocialMediaComponent()
        }
    }
}

    @Preview(showBackground = true)
    @Composable
    fun LoginScreenPreview() {
        LoginScreen(Modifier.fillMaxSize())
    }
