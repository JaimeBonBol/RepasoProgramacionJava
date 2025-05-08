package com.dam.ApiRestCursos.controller;

import com.dam.ApiRestCursos.model.Curso;
import com.dam.ApiRestCursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/cursos")
    public List<Curso> obtenerCursos(){
        return cursoService.obtenerCursos();
    }

    @GetMapping("/curso")
    public Curso obtenerCurso(){
        return cursoService.obtenerCurso();
    }

    @GetMapping("cursos/{nombre}")
    public Curso obtenerCursoPorNombre(@PathVariable String nombre){
        return cursoService.obtenerCursoNombre(nombre);
    }

    @PostMapping("/curso")
    public Curso agregarCurso(@RequestBody Curso curso){
        return cursoService.agregarCurso(curso);
    }

    @PutMapping("/curso/{id}")
    public Curso actualizarCurso(@PathVariable Integer id, @RequestBody Curso curso){
        return cursoService.actualizarCurso(id, curso);
    }

    @DeleteMapping("/curso/{nombre}")
    public void eliminarCursoPorNombre(@PathVariable String nombre){
        cursoService.eliminarCursoNombre(nombre);
    }

}
