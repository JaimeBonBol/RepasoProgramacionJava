package POO1_EjerciciosIntermedios.Ej17;

public class Rectangulo {

    /**
     * Atributos de la clase Rectangulo. Com el atributo contajeRectangulos static para llevar el contaje de
     * cuantos rectangulos se han creado.
     */
    private int base;
    private int altura;
    private static int contajeRectangulos;

    /**
     * Constructor de la clase Rectangulo, donde el atributo static contajeRectangulos se
     * le suma uno por cada rectangulo que se construya
     * @param altura
     */
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
        contajeRectangulos ++;
    }

    /**
     * Metodo para pintar el rectangulo.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Metodo para obtener el numero de rectangulos que se han creado.
     * @return
     */
    public static int getContajeRectangulos() {
        return contajeRectangulos;
    }
}
