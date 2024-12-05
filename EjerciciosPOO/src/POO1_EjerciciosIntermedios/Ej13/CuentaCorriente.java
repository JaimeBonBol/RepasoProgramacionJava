package POO1_EjerciciosIntermedios.Ej13;

import java.util.Random;

public class CuentaCorriente {
    /**
     * Atributos clase CuentaCorriente.
     */
    private int numeroCuenta;
    private double saldo;

    /**
     * Creación objeto de la clase Random para su utilización posterior en el constructor
     * para dar un número aleatorio a la cuenta corriente.
     */
    Random random = new Random();

    /**
     * Constructor de la clase CuentaCorriente que no especifíca el saldo inicial, por lo que se le asigna a 0 inicialmente
     * y se le da un número aleatorio a la cuenta.
     */
    public CuentaCorriente(){
        this.numeroCuenta = 100000000 + random.nextInt(999999999);
        this.saldo = 0;
    }

    /**
     * Constructor en el que se le pasa el saldo de a cuenta. Al tener dos constructores, cuando se cree el objerto, dependiendo
     * si se le pasa por parámetro el saldo o no, se construirá el objeto a partir de un constrictor u otro.
     * @param saldo
     */
    public CuentaCorriente(double saldo){
        this.numeroCuenta = 100000000 + random.nextInt(999999999);
        this.saldo = saldo;
    }

    /**
     * Metodo para el ingreso, donde se le suma la cantidad a ingresar que se le pasas por parámetro.
     * @param cantidadIngreso
     */
    public void ingreso(double cantidadIngreso){
        this.saldo += cantidadIngreso;
    }

    /**
     * Metodo para el cargo, donde se le resta al saldo la cantidad a gastar que se pasa por parámetro.
     * @param cantidadGasto
     */
    public void gasto(double cantidadGasto){
        this.saldo -= cantidadGasto;
    }

    /**
     * Metodo transaferencia de una cuenta a otra, por parámetro hay que decirle a qué cuenta va dirigida y qué cantidad de dinero
     * se le va a transferir.
     * @param cuenta
     * @param cantidadTransferencia
     */
    public void transferencia(CuentaCorriente cuenta, double cantidadTransferencia){
        cuenta.saldo += cantidadTransferencia;
        this.saldo -= cantidadTransferencia;
    }

    /**
     * Metodo para obetener el saldo de la cuenta.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para obetener el número de la cuenta.
     * @return  numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Metodo para mostrar por pantalla los datos de una cuenta corriente.
     * @return
     */
    public String toString(){
        return "Número de cuenta: "+this.numeroCuenta+". Saldo: "+this.saldo+" €";
    }
}
