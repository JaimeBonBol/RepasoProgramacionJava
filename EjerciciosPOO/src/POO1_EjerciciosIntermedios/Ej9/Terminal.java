package POO1_EjerciciosIntermedios.Ej9;

public class Terminal {
    protected int numero;
    protected int conversacion;

    public Terminal(int numero){
        this.numero = numero;
        this.conversacion = 0;
    }

    public void llamada(Terminal terminal, int segundosLLamada){
        conversacion += segundosLLamada;
        terminal.conversacion += segundosLLamada;
    }

    @Override
    public String toString() {
        return "Nº "+numero+": "+conversacion+" segundos de conversación.";
    }
}
