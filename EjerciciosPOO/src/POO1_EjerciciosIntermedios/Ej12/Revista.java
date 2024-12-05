package POO1_EjerciciosIntermedios.Ej12;

public class Revista extends Publicacion{
    /**
     * Atributos propios de revista.
     */
    private int numero;

    /**
     * Metodo constructor de la clase Revista.
     * @param ISBN
     * @param titulo
     * @param agnoPublicacion
     * @param numero
     */
    public Revista(String ISBN, String titulo, int agnoPublicacion, int numero){
        super(ISBN, titulo, agnoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ISBN: "+this.ISBN+". Titulo: "+this.titulo+". Año de publicación: "+this.agnoPublicacion;
    }
}
