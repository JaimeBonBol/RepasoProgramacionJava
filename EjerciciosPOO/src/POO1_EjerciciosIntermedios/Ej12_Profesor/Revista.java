package POO1_EjerciciosIntermedios.Ej12_Profesor;

public class Revista extends Publicacion {

    private int numero;

    public Revista(String isbn, String titulo, int anio, int numero) {
        super(isbn, titulo, anio);
        this.numero = numero;
    }
}
