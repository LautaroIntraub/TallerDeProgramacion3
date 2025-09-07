package com.example.primerapp.ui.screens

import LoginButton
import SignButton
import SocialMediaComponent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapp.R
import com.example.primerapp.ui.components.LoginPlace
import com.example.primerapp.ui.theme.Poppins


@Composable
fun RegisterScreen(modifier: Modifier) {

    Column(
        modifier = Modifier.fillMaxSize().padding(25.dp)
    ) {
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            stringResource(R.string.create_account),
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
            stringResource(R.string.register_subtitle),
            fontFamily = Poppins,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(15.dp))

        Column () {
            LoginPlace()

            var password by rememberSaveable { mutableStateOf("") }
            TextField(
                value = password,
                onValueChange = { password = it },
                placeholder = { Text("Confirm Password") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.clip(RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFE0D4FA),
                    unfocusedContainerColor = Color(0xFFE0D4FA),
                    disabledContainerColor = Color(0xFFE0D4FA),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )

        }
        SignButton(
            modifier = Modifier.padding(10.dp).align(alignment = Alignment.CenterHorizontally),
            text = stringResource(R.string.sign_up_btn),
            onClick = { /* acción */ }
        )

        Text(
            stringResource(R.string.already_have_account),
            fontFamily = Poppins,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 10.dp)
        )

        Spacer(modifier= Modifier.padding(30.dp))

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

@Composable
fun RegisterPlace(modifier: Modifier.Companion) {
    TODO("Not yet implemented")
}

@Preview (showBackground = true)
@Composable
fun RegisterPreview() {
    RegisterScreen(Modifier.fillMaxSize())
}