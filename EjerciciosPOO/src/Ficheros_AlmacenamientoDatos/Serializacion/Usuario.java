package Ficheros_AlmacenamientoDatos.Serializacion;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    //transient es por si quiero que no se serialize un atributo.
    private transient String password;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
