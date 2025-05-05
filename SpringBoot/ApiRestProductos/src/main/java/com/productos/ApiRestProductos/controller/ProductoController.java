package com.productos.ApiRestProductos.controller;

import com.productos.ApiRestProductos.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {

    private List<Producto> productos = new ArrayList<>();

    private int contadorId = 0;

    public ProductoController(){
        // Añadimos algunos productos de ejemplo
        productos.add(new Producto(contadorId++,"Lápiz",0.80));
        productos.add(new Producto(contadorId++,"Portátil",680.99));
        productos.add(new Producto(contadorId++,"Teclado",20.50));
    }

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productos;
    }

    /**
     * @RequestBody capturar el cuerpo de una petición HTTP y lo convierte a un objeto Java
     * @Pathvariable captura una parte (dato-varibale) de ña URL (en este caso una id)
     *
     * @param producto
     * @return
     */
    @PostMapping("/producto")
    public Producto crearProducto(@RequestBody Producto producto){
        producto.setId(contadorId ++);
        productos.add(producto);
        return producto;
    }

    @PutMapping("/producto/{id}")
    public Producto actualizarProducto(@RequestBody Producto producto, @PathVariable int id){
        for (Producto p : productos){
            if (p.getId() == id){
                p.setNombre(producto.getNombre());
                p.setPrecio(producto.getPrecio());
                return p;
            }
        }
        return null;
    }

    @DeleteMapping("/productoBorrar/{id}")
    public void borrarProducto(@PathVariable int id){
        productos.removeIf(p -> p.getId() == id);
    }
}
