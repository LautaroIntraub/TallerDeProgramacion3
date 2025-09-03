package com.example.primerapp.ui.screens

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapp.R
import com.example.primerapp.ui.theme.Poppins


@Composable
fun WelcomeScreen(modifier: Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = "Logo"
        )
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color(0xFF662AFF),
            fontFamily = Poppins,
            fontSize = 32.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            text = "Discover Your \n" + "Dream Job here!",
        )
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color.Black,
            fontFamily = Poppins,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            text = "Explore all the most exciting jobs roles \n" + "based on your interest and study major."

        )
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // espacio entre botones
        ) {
            Button(
                onClick = { /* acción Login */ },
                modifier = Modifier.weight(1f).height(50.dp), // ocupa mitad del Row
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF662AFF).copy(alpha = 0.28f),
                    contentColor = Color(0xFF662AFF)
                )
            ) {
                Text("Login", fontSize = 18.sp)
            }

            Button(
                onClick = { /* acción Signup */ },
                modifier = Modifier.weight(1f).height(50.dp), // ocupa mitad del Row
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF8352FF),
                    contentColor = Color.White
                )
            ) {
                Text("Register", fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(Modifier.fillMaxSize())
}
