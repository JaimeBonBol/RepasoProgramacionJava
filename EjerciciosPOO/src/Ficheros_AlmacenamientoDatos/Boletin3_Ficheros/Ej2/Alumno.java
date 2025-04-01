package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.Ej2;

public class Alumno {

    private String nombre;
    private String apellido;
    protected double notaMedia;

    public Alumno(String nombre, String apellido, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notaMedia='" + notaMedia + '\'' +
                '}';
    }
}
