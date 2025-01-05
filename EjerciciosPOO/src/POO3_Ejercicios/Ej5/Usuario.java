package POO3_Ejercicios.Ej5;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private ArrayList<Usuario> listaAmigos;
    private ArrayList<Publicacion> listaPublicaciones;

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
        return this.nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: "+this.nombre+
                "\nLista de amigos: "+getListaAmigos()+
                "\nLista de publicaciones: "+getListaPublicaciones());

    }

    public StringBuilder getListaAmigos() {
        StringBuilder lista = new StringBuilder();
        for (Usuario usuario : listaAmigos){
            lista.append(usuario);
            lista.append(", ");
        }
        return lista;
    }

    public StringBuilder getListaPublicaciones() {
        StringBuilder lista = new StringBuilder();
        for (Publicacion publicacion : listaPublicaciones){
            lista.append(publicacion);
            lista.append(", ");
        }
        return lista;
    }

    public void publicacionesAmigo(Usuario usuario){
        System.out.println("Las publicaciones de su amig@ "+usuario.nombre+" son "+usuario.getListaPublicaciones());

    }
}
