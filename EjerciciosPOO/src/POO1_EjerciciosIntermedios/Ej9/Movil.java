package POO1_EjerciciosIntermedios.Ej9;

public class Movil extends Terminal {
    private String tipo;
    private double tarificacion;

    public Movil(int numero ,String tipo){
        super(numero);
        this.tipo = tipo;
        this.conversacion = 0;

    }

    @Override
    public void llamada(Terminal terminal, int segundosLLamada){

        super.llamada(terminal, segundosLLamada);

        //Con el super anterior llama al metodo llamada de la superclase, y lo realiza, por tanto no habría que
        //volver a realizar la suma a la conversación.
        /*conversacion += segundosLLamada;
        terminal.conversacion += segundosLLamada;*/

        double minutos = (double) segundosLLamada / 60;

        if (this.tipo == "rata"){
            this.tarificacion += minutos * 0.06;
        }
        if (this.tipo == "mono") {
            this.tarificacion += minutos * 0.12;
        }
        if (this.tipo == "bisonte") {
            this.tarificacion += minutos * 0.30;
        }

        /*switch (this.tipo) {
            case "rata":
                this.tarificacion += minutos*0.06;
                break;
            case "mono":
                this.tarificacion += minutos*0.12;
                break;
            case "bisonte":
                this.tarificacion += minutos*0.30;
                break;
            default:
        }*/

    }

    @Override
    public String toString() {
        return "Nº: "+ this.numero+" - "+this.conversacion+" segundos de conversación - tarificados: "+this.tarificacion+" euros.";
    }
}
