package POO2_Ejercicios.Ej4;

public class Fraccion {

    /**
     * Atributos de la clase Fracción.
     */
    protected int numerador;
    protected int denominador;

    /**
     * Constructor de la clase Fraccion, teniendole que pasar por parámetros el numerador y el denominador.
     * @param numerador
     * @param denominador
     */
    public Fraccion(int numerador, int denominador){

        this.numerador = numerador;
        this.denominador = denominador;

    }

    /**
     * toString para mostrar la fracción.
     * @return
     */
    @Override
    public String toString() {

        return numerador + "/" + denominador;

    }

    /**
     * Metodo para invertir una fracción. Devooviendo una nueva fracción donde el nunerador sea el denominador de la fracción a invertir y viceversa.
     * @param
     * @return
     */
    public void invierte(){

        int aux = numerador;
        numerador = denominador;
        denominador = aux;

    }

    /**
     * Metodo para calcular el Máximo Común Divisor
     * @param a
     * @param b
     * @return
     */
    private int mcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }

    /**
     * Metodo para simplificar una fracción.
     * @param
     * @return
     */
    public void simplifica(){

        int mcd = mcd(this.numerador, this.denominador);    //Calculamos el mcd del numeraodor y denominador de la fracción que le pasamos para simplificar.
        this.numerador /= mcd;  //Dividimos el numerador entre el mcd.
        this.denominador /= mcd;    //Dividimos el denominador entre el mcd.


    }

    /**
     *
     * @param fraccionAmultiplicar
     * @return
     */
    public Fraccion multiplica(Fraccion fraccionAmultiplicar){

        int numeradorResultado = this.numerador * fraccionAmultiplicar.numerador;    //Guardo en esta variable la multiplicación del numerador por el numerador de la fraccion a multiplicar.
        int denominadorResultado = this.denominador * fraccionAmultiplicar.denominador; //Igual que el pso anterior pero con el denominador.

        return new Fraccion(numeradorResultado, denominadorResultado);   //Devuelvo una nueva fracción con el resultado de las multiplicaciones tanto del numerador como del denominador.

    }

    public Fraccion divide(Fraccion fraccionAdividir){

        int numeradorResultado = this.numerador * fraccionAdividir.denominador; //Guardo en esta variable el calculo para la división de fracciones.
        int denominadorResultado = this.denominador * fraccionAdividir.numerador;   //Igual que el paso anterior.

        return new Fraccion(numeradorResultado, denominadorResultado);

    }
}
