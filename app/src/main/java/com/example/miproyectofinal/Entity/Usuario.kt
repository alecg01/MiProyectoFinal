package com.example.miproyectofinal.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Usuario(
    @PrimaryKey
    @ColumnInfo
    val nombreUsuario: String,
    val contraseña: String
)
