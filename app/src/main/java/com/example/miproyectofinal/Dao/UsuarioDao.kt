package com.example.miproyectofinal.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.miproyectofinal.Entity.Producto
import com.example.miproyectofinal.Entity.Usuario

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM usuario")
    fun getUsuario()

    @Insert
    fun insertUsuario(nombre: Usuario, contraseña: Usuario)

    @Update
    fun updateUsuario()

    @Query("DELETE FROM usuario where id: ")
    fun deleteUsuario()
}