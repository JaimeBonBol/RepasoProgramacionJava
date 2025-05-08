package com.dam.ApiRestCursos.service;

import com.dam.ApiRestCursos.model.Curso;

import java.util.List;

public interface CursoService {

    public List<Curso> obtenerCursos();

    public Curso obtenerCurso();

    public Curso obtenerCursoNombre(String nombre);

    public Curso agregarCurso(Curso curso);

    public Curso actualizarCurso(Integer id, Curso curso);

    public void eliminarCursoNombre(String nombre);


}
