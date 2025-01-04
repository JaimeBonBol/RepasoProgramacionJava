package POO3_Ejercicios.Ej2;

public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "Michael Jadnds");
        Libro libro2 = new Libro("El Zorro", "Antonio Banderas");
        Libro libro3 = new Libro("Oliver y Benji", "Pepe Pineda");

        Usuario usuario1 = new Usuario("Jaime Lorente", "ABC123");
        Usuario usuario2 = new Usuario("Juan Lopez", "QWE987");

        //PRUEBAS LIBRO.
        System.out.println("Pruebas libros.");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println();

        libro1.prestar();

        System.out.println();

        System.out.println(libro1);

        System.out.println();

        libro1.devolver();

        System.out.println();

        System.out.println(libro1);

        System.out.println();

        //PRUEBAS USUARIOS.
        System.out.println("Pruebas usuarios.");
        usuario1.pedirLibro(libro1);
        usuario1.pedirLibro(libro2);
        System.out.println();
        System.out.println(usuario1);

        usuario1.devolverLibro(libro1);
        System.out.println();
        System.out.println(usuario1);
    }
}
