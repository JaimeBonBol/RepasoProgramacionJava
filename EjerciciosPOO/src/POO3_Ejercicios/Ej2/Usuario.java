package POO3_Ejercicios.Ej2;

import java.util.ArrayList;

public class Usuario {

    /**
     * Atributos de la clase Usuario.
     */
    private String nombre;
    private String id;
    private ArrayList<Libro> prestamos;

    /**
     * Constructor de la clase Usuario.
     * @param nombre
     * @param id
     */
    public Usuario(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
        this.prestamos = new ArrayList<>();
    }

    /**
     * Metodo para pedir libro y por tanto agregarlo a la lista de prestamos un libro.
     * @param libro
     */
    public void pedirLibro(Libro libro){
        if (libro.disponible){
            prestamos.add(libro);
            System.out.println("Libro agregado a la lista de préstamos con éxito.");
        }else {
            System.out.println("El libro no se puede agregar a la lista porque no está disponible.");
        }
    }

    /**
     * Metodo para devolver un libro y eliminarlo por tanto de la lista de préstamos.
     * @param libro
     */
    public void devolverLibro(Libro libro){
        if (prestamos.contains(libro)){
            prestamos.remove(libro);
            System.out.println("Libro eliminado de la lista de préstamos con éxito.");
        }else {
            System.out.println("El libro no se puede eliminar de la lista porque no esta en ella.");
        }
    }

    @Override
    public String toString() {
        return "Usuario: \n"+"Nombre:"+nombre+"\n"+"ID: "+id+"\n"+"Prestamos: "+prestamos;
    }
}
