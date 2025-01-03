package POO2_Ejercicios.Ej6;

public class PruebaAnimales {
    public static void main(String[] args) {
        /**
         * Creo un array de tipo Animal donde voy a almacenar 6 animales.
         */
        Animal[] animales = new Animal[6];

        /**
         * Relleno el array con diferentes tipos de animales.
         */
        animales[0] = new Pajaro("Pepe");
        animales[1] = new Perro("Chico");
        animales[2] = new Gato("Mini");
        animales[3] = new Gato("Pi");
        animales[4] = new Pajaro("Pico");
        animales[5] = new Perro("Manolo");

        /**
         * Con un bucle for each recorro el array, diciendole que en cada iteración el animal que esté en cada posición haga el sonido correspondiente.
         */
        for (Animal animal : animales){
            animal.hacerSonido();
            System.out.println();
        }
}
}
