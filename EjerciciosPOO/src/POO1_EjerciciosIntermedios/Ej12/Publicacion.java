package POO1_EjerciciosIntermedios.Ej12;

public class Publicacion {
    /**
     * Atributos clase Publicación.
     */
    protected String ISBN;
    protected String titulo;
    protected int agnoPublicacion;

    /**
     * Metodo condtructor para la clase Publicacion.
     * @param ISBN
     * @param titulo
     * @param agnoPublicacion
     */
    public Publicacion(String ISBN, String titulo, int agnoPublicacion){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.agnoPublicacion = agnoPublicacion;
    }


}
