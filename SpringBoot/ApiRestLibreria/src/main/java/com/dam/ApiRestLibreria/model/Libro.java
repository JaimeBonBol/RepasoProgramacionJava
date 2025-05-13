package com.dam.ApiRestLibreria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "ano_publicacion")
    private Integer ano_publicacion;

    @Column(name = "autor_id")
    private Integer autor_id;

    @Column(name = "editorial_id")
    private Integer editorial_id;

    public Integer getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(Integer editorial_id) {
        this.editorial_id = editorial_id;
    }

    public Integer getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(Integer autor_id) {
        this.autor_id = autor_id;
    }

    public Integer getAno_publicacion() {
        return ano_publicacion;
    }

    public void setAno_publicacion(Integer ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}