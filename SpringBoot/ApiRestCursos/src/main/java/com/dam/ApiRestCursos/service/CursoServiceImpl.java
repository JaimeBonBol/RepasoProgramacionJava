package com.dam.ApiRestCursos.service;

import com.dam.ApiRestCursos.model.Curso;
import com.dam.ApiRestCursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> obtenerCursos() {
        return cursoRepository.obtenerCursos();
    }

    @Override
    public Curso obtenerCurso() {
        return cursoRepository.obtenerCurso();
    }

    @Override
    public Curso obtenerCursoNombre(String nombre) {
        return cursoRepository.obtenerCursoNombre(nombre);
    }

    @Override
    public Curso agregarCurso(Curso curso) {
        return cursoRepository.agregarCurso(curso);
    }

    @Override
    public Curso actualizarCurso(Integer id, Curso curso) {
        return cursoRepository.actualizarCurso(id, curso);
    }

    @Override
    public void eliminarCursoNombre(String nombre) {
        cursoRepository.eliminarCursoNombre(nombre);
    }
}
