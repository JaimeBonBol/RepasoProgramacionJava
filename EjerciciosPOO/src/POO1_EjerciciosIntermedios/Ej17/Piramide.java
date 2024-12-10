package POO1_EjerciciosIntermedios.Ej17;

public class Piramide {
    /**
     * Atributos de la clase Piramide. Com el atributo contajePiramides static para llevar el contaje de
     * cuantas piramides se han creado.
     */
    private int altura;
    private static int contajePiramides;

    /**
     * Constructor de la clase Piramdide, donde el atributo static contajePiramides se
     * le suma uno por cada piramide que se construya
     * @param altura
     */
    public Piramide(int altura){
        this.altura = altura;
        contajePiramides ++;
    }

    /**
     * Metodo para pintar la piramide.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.altura; i++) {
            //Imprimir los espacios antes de los asteriscos.
            for (int j = i; j < this.altura; j++) {
                sb.append(" ");
            }

            //Imprimir los asteriscos en cada fila.
            for (int j = 0; j < ((2* i) -1); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Metodo para obtener el numero de piramides que se han creado.
     * @return
     */
    public static int getContajePiramides() {
        return contajePiramides;
    }
}
