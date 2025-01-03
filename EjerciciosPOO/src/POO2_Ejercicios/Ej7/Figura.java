package POO2_Ejercicios.Ej7;

public abstract class Figura {

    /**
     * Metodo abstracto calcular área que deberan de implementar las clases que hereden de Figura.
     * @return
     */
    public abstract double calcularArea();

    /**
     * Metodo imprimir área que mostrará el área calculada por el metodo calcularArea.
     */
    public void imprimirArea(){
        System.out.printf("El área de la figura es %.2f\n", calcularArea());
    }

}
