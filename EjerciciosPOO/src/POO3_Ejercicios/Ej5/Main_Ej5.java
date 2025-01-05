package POO3_Ejercicios.Ej5;

import java.util.Date;

public class Main_Ej5 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan Martinez");
        Usuario usuario2 = new Usuario("Pepe Sanchez");
        Usuario usuario3 = new Usuario("Marta Lopez");

        Publicacion publicacion1 = new Publicacion("Partido de fútbol", new Date(2025,1,2));
        Publicacion publicacion2 = new Publicacion("Desfile de moda", new Date(2024,12,26));
        Publicacion publicacion3 = new Publicacion("Teatro", new Date(2025,1,4));

        usuario1.agregarAmigo(usuario2);
        usuario1.agregarAmigo(usuario3);

        usuario1.publicarEstado(publicacion1);
        usuario1.publicarEstado(publicacion2);

        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();
        System.out.println();
        usuario3.mostrarInformacion();

        usuario2.agregarAmigo(usuario1);
        usuario2.publicarEstado(publicacion1);

        System.out.println();

        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();
        System.out.println();
        usuario3.mostrarInformacion();

        System.out.println();

        usuario2.publicacionesAmigo(usuario1);
    }
}
