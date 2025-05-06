package com.productos.ApiRestProductos.repository;

import com.productos.ApiRestProductos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
