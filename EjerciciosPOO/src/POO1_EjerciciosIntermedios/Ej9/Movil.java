package POO1_EjerciciosIntermedios.Ej9;

public class Movil extends Terminal {
    private String tipo;
    private int conversacion;
    private double tarificacion;

    public Movil(int numero ,String tipo){
        super(numero);
        this.tipo = tipo;
        this.conversacion = 0;
        this.tarificacion = 0;
    }

    public void llamada(Movil terminal, int tiempoLlamada){
        conversacion += tiempoLlamada;
        terminal.conversacion += tiempoLlamada;

        if (this.tipo== "rata"){
            this.tarificacion = (tiempoLlamada / 60) * 6;
        } else if (this.tipo == "mono") {
            this.tarificacion = (tiempoLlamada / 60) * 12;
        } else if (this.tipo == "bisonte") {
            this.tarificacion = (tiempoLlamada / 60) * 30;
        }else {
            System.out.println("Opción no válida.");
        }
    }

    @Override
    public String toString() {
        return "Nº: "+ numero+" - "+conversacion+" segundos de conversación - tarificados: "+tarificacion+" euros.";
    }
}
