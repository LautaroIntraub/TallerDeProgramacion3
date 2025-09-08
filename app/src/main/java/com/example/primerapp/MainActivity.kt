package com.example.primerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.primerapp.ui.screens.LoginScreen
import com.example.primerapp.ui.screens.RegisterScreen
import com.example.primerapp.ui.screens.WelcomeScreen
import com.example.primerapp.ui.theme.PrimerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            PrimerAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController=navController,
                        modifier = Modifier.padding(innerPadding),
                        startDestination = "welcome"
                    ){
                        composable(route="welcome"){ WelcomeScreen(Modifier,navController) }
                        composable(route="register"){ RegisterScreen(Modifier) }
                        composable(route="login"){ LoginScreen(Modifier) }
                    }

//                    LaunchedEffect(Unit) {
//                        navController.navigate("register")
//                    }
                     //navController.navigate(route = "register")
                  //WelcomeScreen(Modifier.padding(innerPadding),navController)
                    //LoginScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Button(onClick = {}, modifier = modifier) {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimerAppTheme {
        Greeting("Android")
    }
}