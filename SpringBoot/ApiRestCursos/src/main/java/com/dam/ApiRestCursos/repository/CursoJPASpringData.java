package com.dam.ApiRestCursos.repository;

import com.dam.ApiRestCursos.model.Curso;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoJPASpringData extends JpaRepository<Curso,Integer> {

    Optional<Curso> findByNombre(String nombre);

    @Transactional
    void deleteByNombre(String nombre);


}
