package POO_Examen;

public class Fraccion {

    /**
     * Atributos de la clase Fraccion.
     * Numerador de la fracción.
     * Denominador de la fracción.
     */
    protected int num;
    protected int den;

    //CONSTRUCTORES DE LA CLASE FRACCION.

    public Fraccion(int num, int den){
        this.num = num;
        if (comprobarDenominador(den)){
            this.den = den;
        }else {
            System.out.println("El denominador no puede ser 0.");
        }
    }

    public Fraccion(){
        this.num = 0;
        this.den = 1;
    }

    public Fraccion(int num){
        this.num = num;
        this.den = 1;
    }

    public boolean comprobarDenominador(int den){
        if (den == 0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * Metodo para sumar.
     * @param fraccion Fracción que se le desea sumar.
     * @return Una fracción con la suma de las dos fracciones.
     */
    public Fraccion suma(Fraccion fraccion) {
        int numSuma;
        int denSuma;

        Fraccion fraccionSuma = null;
        if (!comprobarDenominador(this.den) || !comprobarDenominador(fraccion.den)){
            System.out.println("No se puede sumar por que hay una fracción con denominador 0.");
        }else {
             numSuma = (this.num * fraccion.den) + (this.den * fraccion.num);
             denSuma = (this.den * fraccion.den);


             fraccionSuma = new Fraccion(numSuma, denSuma);



        }
        return fraccionSuma;

    }

    /**
     * Metodo para restar.
     * @param fraccion Fracción que se le desea restar.
     * @return Delvuelve una fracción con la resta de las dos fracciones.
     */
    public Fraccion restar(Fraccion fraccion){
        int numResta = (this.num * fraccion.den) - (this.den * fraccion.num);
        int denResta = (this.den * fraccion.den);

        Fraccion fraccionResta = new Fraccion(numResta, denResta);

        return fraccionResta;

    }

    /**
     * Metodo para realizar una multiplicación de dos fracciones.
     * @param fraccion Fracción que se desea multiplicar.
     * @return Devuelve una fracción con la multiplicación de las dos fracciones.
     */
    public Fraccion multiplicar(Fraccion fraccion){
        int numMult = (this.num * fraccion.num);
        int denMult = (this.den * fraccion.den);

        Fraccion fraccionMultiplicacion = new Fraccion(numMult, denMult);

        return fraccionMultiplicacion;
    }

    /**
     * Metodo para realizar una división de dos fracciones.
     * @param fraccion Fracción que se desea dividir.
     * @return Devuelve una fracción con la división de las dos fracciones.
     */
    public Fraccion dividir(Fraccion fraccion){
        int numDiv = (this.num * fraccion.den);
        int denDiv = (this.den * fraccion.num);

        Fraccion fraccionDivision = new Fraccion(numDiv, denDiv);

        return fraccionDivision;
    }

    /**
     * Metodo toString para mostrar la información de una Fracción.
     * @return
     */
    @Override
    public String toString() {
        return num+"/"+den;
    }
}
