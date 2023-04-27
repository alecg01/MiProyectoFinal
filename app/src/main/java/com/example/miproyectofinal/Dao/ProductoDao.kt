package com.example.miproyectofinal.Dao

import androidx.room.*
import com.example.miproyectofinal.Entity.Producto

@Dao
interface ProductoDao {
    @Query("SELECT * FROM producto")
    fun getProducto()

    @Insert
    fun insertProducto(nombre: Producto, cantidad: Producto, descripcion: Producto, precio: Producto)

    @Update
    fun updateProducto()

    @Query("DELETE FROM producto where id: ")
    fun deleteProducto()
}