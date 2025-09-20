package com.example.segundochallenge.data

import androidx.navigation.NavHostController

data class ItemProducts(
    val titulo: String,
    val precio: String,
    val descripcion: String,
    val imagen: Int,
    val navController:NavHostController
)
