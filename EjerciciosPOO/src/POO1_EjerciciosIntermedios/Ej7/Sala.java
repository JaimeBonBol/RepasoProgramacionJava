package POO1_EjerciciosIntermedios.Ej7;

public class Sala {
    private int entradas;

    public Sala(int entradas){
        this.entradas = entradas;
    }

    public int getEntradas(){
        return this.entradas;
    }

    public void ventaEntrada(int entradas){
        if (entradas <= this.entradas){
            this.entradas -= entradas;
            System.out.println("Venta realizada con éxito.");
        }else {
            System.out.println("No se puede realizar la compra, no quedan sufficientes entradass.");
        }
    }
}
