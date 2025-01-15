package POO4_EjerciciosPdfs.Ej1_Figuras;

public class Main {
    public static void main(String[] args) {
        Superheroe superheroe1 = new Superheroe("Superman");
        Superheroe superheroe2 = new Superheroe("Spiderman");
        Superheroe superheroe3 = new Superheroe("Batman");

        Dimension dimension1 = new Dimension();
        Dimension dimension2 = new Dimension(10,6.5,4.5);
        Dimension dimension3 = new Dimension(6,4.2,9);
        Dimension dimension4 = new Dimension(7.5,2.3,4.4);

        Figura figura1 = new Figura("123ABC",20.36,dimension2,superheroe1);
        Figura figura2 = new Figura("456QWE",17.25,dimension3,superheroe2);
        Figura figura3 = new Figura("987ASD",15.99,dimension4,superheroe3);

        Coleccion coleccion1 = new Coleccion("Marvel");
        Coleccion coleccion2 = new Coleccion("Futbol");

        System.out.println("PRUEBAS SUPERHEROES");

        superheroe1.setCapa(true);
        superheroe2.setDescripcion("Es ágil");

        System.out.println(superheroe1);
        System.out.println(superheroe2);
        System.out.println(superheroe3);

        System.out.println();
        System.out.println("PRUEBAS DIMENSIONES");

        System.out.println(dimension1);
        System.out.println();
        System.out.println(dimension2);
        System.out.println();
        System.out.println(dimension3);
        System.out.println();
        System.out.println(dimension4);

        System.out.println();
        System.out.println("PRUEBAS FIGURAS");
        System.out.println(figura1);
        System.out.println(figura2);
        System.out.println(figura3);

        System.out.println("PRUEBAS COLECCIONES");
        System.out.println();

        coleccion1.aniadirFigura(figura1);
        coleccion1.aniadirFigura(figura2);
        coleccion1.aniadirFigura(figura3);

        coleccion2.aniadirFigura(figura1);
        coleccion2.aniadirFigura(figura2);

        System.out.println();

        System.out.println("La colección "+coleccion1.getNombreColeccion()+" contiene las siguientes figuras: "+coleccion1);
        System.out.println();
        System.out.println("El valor de la colección "+coleccion1.getNombreColeccion()+" es:"+coleccion1.getValorColeccion());
        System.out.println();
        System.out.println("El volumen de la colección "+coleccion1.getNombreColeccion()+" es:"+ coleccion1.getVolumenColeccion());
        System.out.println();
        System.out.println("La figuras con capa en la colección "+coleccion1.getNombreColeccion()+" son: ");
        coleccion1.conCapa();
        System.out.println("La figura más valiosa en la colección "+coleccion1.getNombreColeccion()+" es: "+coleccion1.masValioso());
        System.out.println();
        coleccion1.subirPrecio(100,"123ABC");

        System.out.println("El valor de la colección después de haber subido el precio a una figura de la colección "+coleccion1.getNombreColeccion()+" es:"+coleccion1.getValorColeccion());
    }
}
