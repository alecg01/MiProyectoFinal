package com.example.miproyectofinal.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("producto")
data class Producto(
    @PrimaryKey
    @ColumnInfo
    val nombreProducto : String,
    val descripcion : String,
    val cantidad : Int,
    val precio :Float

)
