package POO_EjerciciosRepaso.Ej6_Repaso_Movil_Terminal;

public class Terminal {

    /**
     * Atributos de la clase Terminal
     * Número de cada terminal(Número de móvil).
     * Tiempo en segundos de conversación.
     */
    private String numero;
    private int conversacion;

    /**
     * COnstructor de la clase Terminal.
     * @param numero Número del terminal.
     * El tiempo de conversación de un terminal empieza por defecto a 0.
     */
    public Terminal(String numero){
        this.numero = numero;
        this.conversacion = 0;
    }

    /**
     * Metodo para realizar una llamada.
     * @param terminal Terminal al que se desea llamar.
     * @param segundosLlamada Segundos que dura la llamada.
     */
    public void llama(Terminal terminal, int segundosLlamada){
        this.conversacion += segundosLlamada;
        terminal.conversacion += segundosLlamada;
    }

    @Override
    public String toString() {
        return "Nº "+this.numero+" - "+this.conversacion+"s de conversación.";
    }
}
//PRUBA PARA VER QUE FUNCIONA BIEN.

class usoTerminal{
    public static void main(String[] args) {
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}

