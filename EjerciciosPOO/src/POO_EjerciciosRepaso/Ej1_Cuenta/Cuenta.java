package POO_EjerciciosRepaso.Ej1_Cuenta;

public class Cuenta {

    /**
     * Atributos de la clase Cuenta.
     */
    private String titular;
    private double cantidad;

    /**
     * Constructor de la clase Cuenta, en el que el titular y la cuenta son obligatorios.
     * @param titular Titular de la cuenta.
     * @param cantidad Cantidad de dinero que hay en la cuenta.
     */
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if (cantidad >= 0){
            this.cantidad = cantidad;
        }else {
            System.out.println("Error. La cantidad no puede ser negativa.");
        }
    }

    /**
     * Constructor de la clase Cuenta en el que no tienes por qué pasarle por parámetros la cantidad.
     * @param titular Titular de la cuenta.
     */
    public Cuenta(String titular){
        this.titular = titular;
    }

    /**
     * Metodos getter y setter para los atributos.
     */

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El titular de la cuenta es: "+getTitular()+
                "\nCantidad en la cuenta: "+getCantidad()+" euros.";
    }

    /**
     * Metodo ingresar dinero.
     * @param cantidad Cantidad que se desea ingresar.
     */
    public void ingresar(double cantidad){
        if (cantidad >= 0 ){
            this.cantidad += cantidad;
        }else {
            System.out.println("La operación no pudo realizarse, cantidad introducida incorrecta.");
        }
        System.out.println("Ingreso con éxito.");
    }

    /**
     * Metodo retirar dinero.
     * @param cantidad Cantidad de dinero a retirar.
     */
    public void retirar(double cantidad){
        if (cantidad > this.cantidad) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
        System.out.println("Retirada con éxito.");
    }


}
