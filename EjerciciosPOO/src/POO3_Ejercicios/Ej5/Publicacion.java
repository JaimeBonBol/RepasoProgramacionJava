package POO3_Ejercicios.Ej5;

import java.util.Date;

public class Publicacion {

    private String contenido;
    private Date fecha;

    public Publicacion(String contenido, Date fecha){
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public void mostrarPublicacion(){
        System.out.println("Contenido: "+this.contenido+"\nFecha: "+this.fecha);
    }

    @Override
    public String toString() {
        return this.contenido+" en la fecha: " + this.fecha;
    }
}
