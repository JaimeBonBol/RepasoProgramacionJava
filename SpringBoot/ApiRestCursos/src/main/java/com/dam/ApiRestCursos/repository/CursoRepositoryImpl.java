package com.dam.ApiRestCursos.repository;

import com.dam.ApiRestCursos.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CursoRepositoryImpl implements CursoRepository{

    @Autowired
    public CursoJPASpringData cursoJPASpringData;

    @Override
    public List<Curso> obtenerCursos() {
        return cursoJPASpringData.findAll();
    }

    @Override
    public Curso obtenerCurso() {
        return cursoJPASpringData.findById(1).orElse(null);
    }

    @Override
    public Curso obtenerCursoNombre(String nombre) {
        return cursoJPASpringData.findByNombre(nombre).orElse(null);
    }

    @Override
    public Curso agregarCurso(Curso curso) {
        return cursoJPASpringData.save(curso);
    }

    @Override
    public Curso actualizarCurso(Integer id, Curso curso) {
        curso.setId(id);
        return cursoJPASpringData.save(curso);
    }

    @Override
    public void eliminarCursoNombre(String nombre) {
        cursoJPASpringData.deleteByNombre(nombre);
    }

}
