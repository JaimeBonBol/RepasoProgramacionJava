package POO3_Ejercicios.Ej5;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Usuario> listaAmigos;
    private List<Publicacion> listaPublicaciones;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.listaAmigos = new ArrayList<>();
        this.listaPublicaciones = new ArrayList<>();
    }

    public void agregarAmigo(Usuario usuario){
        listaAmigos.add(usuario);
    }

    public void publicarEstado(Publicacion publicacion){
        listaPublicaciones.add(publicacion);
    }



    @Override
    public String toString() {
        return"Nombre: "+this.nombre+
        "Lista de amigos: "+listaAmigos+
        "Lista de publicaciones: "+listaPublicaciones;

    }
}
