package POO1_EjerciciosIntermedios.Ej11;

import java.util.Random;

public class TarjetaRegalo {
    /**
     * Atributos de la clase TajetaRegalo.
     */
    private double saldo;
    private int numero;
    /*private static int idSiguiente;
    private int id;*/

    Random random = new Random();

    /**
     * Metodo constructor de la clase TarjetaRegalo, donde se le pasa por parámetro el saldo de cada tarjeta
     * y genera un número aleatorio entre 0 y 10000 para cada tarjeta.
     * @param saldo
     */
    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        this.numero = 10000 + random.nextInt(99999);
        /*idSiguiente ++;
        this.id = idSiguiente;*/
    }

    /**
     * Metodo getter para obtener el número.
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metodo para gastar, dode se le pasa por parámetro cuánto va a gastar, si el gasto es mayor derl saldo disponible
     * muestra error, si tiene suficiente saldo, realiza la compra y se le resta al saldo el gasto de la compra.
     * @param gasto
     */
    public void gastar(double gasto){
        if (gasto > this.saldo){
            System.out.println("Error, saldo insuficiente en la tarjeta "+getNumero()+" para gastar "+gasto+" euros.");
        }else {
            this.saldo -= gasto;

        }
    }

    /**
     * Metodo que fusiona dos tarjetas, generando una nueva tarjeta con el saldo de las dos tarjetas fusionadas,
     * y dejando vacías a estas dos que han sido fuisonadas.
     * @param t
     * @return TarjetaRegalo(nuevoSaldo)
     */
    public TarjetaRegalo fusionar(TarjetaRegalo t){
        double nuevoSaldo = this.saldo + t.saldo;
        this.saldo = 0;
        t.saldo = 0;

        return new TarjetaRegalo(nuevoSaldo);
    }

    /**
     * Metodo toString para mostrar la información de la tarjeta.
     * @return Información de la tarjerta.
     */
    public String toString(){
        return "Tarjeta nº: "+this.numero + ". Saldo: "+this.saldo+" €";
    }


}
