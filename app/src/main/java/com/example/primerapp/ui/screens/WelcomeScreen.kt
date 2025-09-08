package com.example.primerapp.ui.screens

import LoginButton
import RegisterButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.primerapp.R
import com.example.primerapp.ui.theme.Poppins


@Composable
fun WelcomeScreen(modifier: Modifier, navController:NavHostController) {
    Box(modifier=Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(280.dp)
                .align(Alignment.TopStart)
                .offset(x = -85.dp, y = 35.dp)
                .background(Color(0xFFF3E8FF), CircleShape) // lila clarito
        )

        Box(
            modifier = Modifier
                .size(320.dp)
                .align(Alignment.BottomEnd)
                .offset(x = 110.dp, y = 80.dp)
                .background(Color(0xFFEDE7F6), CircleShape)
        )

    }



    Column(
        modifier = Modifier.fillMaxSize().padding(3.dp).verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = "Logo",
            modifier = Modifier.fillMaxWidth().height(290.dp),
            contentScale = ContentScale.Fit
        )
        Text(
            text = stringResource(R.string.welcome_title),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color(0xFF662AFF),
            fontFamily = Poppins,
            fontSize = 28.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = stringResource(R.string.welcome_subtitle),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color.Black,
            fontFamily = Poppins,
            fontSize = 13.5.sp,
            textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // espacio entre botones
        ) {
            LoginButton(
                text = stringResource(R.string.login_btn),
                onClick = { navController.navigate("login") },
                modifier = Modifier.weight(1f).height(50.dp) // ocupa mitad del Row
            )

            RegisterButton(
                text = stringResource(R.string.register_btn),
                onClick = { navController.navigate("register") },
                modifier = Modifier.weight(1f).height(50.dp) // ocupa mitad del Row
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(Modifier.fillMaxSize(), rememberNavController())
}
