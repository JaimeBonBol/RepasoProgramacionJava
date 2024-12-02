package POO1_EjerciciosIntermedios.Ej8;

public class Terminal {
    private int numero;
    private int conversacion;

    public Terminal(int numero){
        this.numero = numero;
        this.conversacion = 0;
    }

    public void llamada(Terminal terminal, int tiempoLlamada){
        conversacion += tiempoLlamada;
        terminal.conversacion += tiempoLlamada;
    }

    @Override
    public String toString() {
        return "Nº "+numero+": "+conversacion+" segundos de conversación.";
    }
}
