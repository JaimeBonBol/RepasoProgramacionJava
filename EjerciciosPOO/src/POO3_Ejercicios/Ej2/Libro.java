package POO3_Ejercicios.Ej2;

public class Libro {

    /**
     * Atributos de la clase Libro.
     */
    private String titulo;
    private String autor;
    protected boolean disponible;

    /**
     * Constructor de la clase Libro.
     */
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    /**
     * Metodo para prestar libro.
     */
    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("Libro "+ titulo+ " prestado con éxito.");
        }else {
            System.out.println("El libro "+titulo+" ya ha sido prestado.");
        }
    }

    /**
     * Metodo para devolver libro.
     */
    public void devolver(){
        if (disponible == false){
            disponible = true;
            System.out.println("Libro "+titulo+ " devuelto con éxito.");
        }else {
            System.out.println("El libro"+titulo+" ya ha sido devuelto  .");
        }
    }

    public String  disponibilidad(){
        if (disponible){
            return "está disponible";
        }else {
            return "no está disponible";
        }
    }

    @Override
    public String toString() {
        return "El libro "+titulo+" con autor "+autor+" "+ disponibilidad();
    }
}
