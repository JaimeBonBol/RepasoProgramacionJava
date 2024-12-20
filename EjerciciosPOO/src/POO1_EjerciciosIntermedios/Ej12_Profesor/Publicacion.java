package POO1_EjerciciosIntermedios.Ej12_Profesor;

public class Publicacion {
    private String isbn;
    private String titulo;
    private int anio;

    public Publicacion(String isbn, String titulo, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }
    public String toString() {
        return "ISBN: " + this.isbn + " Titulo: " + this.titulo + " Año de publicación: " + this.anio;
    }
}
