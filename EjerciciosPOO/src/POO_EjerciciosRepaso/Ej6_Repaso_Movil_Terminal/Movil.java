package POO_EjerciciosRepaso.Ej6_Repaso_Movil_Terminal;

public class Movil extends Terminal{

    /**
     * Atributos de la clase Movil
     * Tarifa que dependerá si es rata, mono o bisonte.
     * Coste por minuto que dependerá de la tarifa.
     */
    private String tarifa;
    private double costeMinuto;
    private double tarificacion;

    /**
     * COnstructor de la clase Movil.
     * @param numero Numero del movil.
     * @param tarifa Tarifa para aplicar.
     * Se comprueba la tarifa para aplicarle un coste u otro a la variable costa por minuto.
     */
    public Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
        this.tarificacion = 0;
        comprobarTarifa(tarifa);
    }

    /**
     * Metodo para comprobar la tarifa y asignarle un precio u otro a el coste por minuto.
     * @param tarifa
     */
    public void comprobarTarifa(String tarifa){
        if (tarifa.equals("rata")){
            this.costeMinuto = 0.06;
        } else if (tarifa.equals("mono")) {
            this.costeMinuto = 0.12;
        } else if (tarifa.equals("bisonte")) {
            this.costeMinuto = 0.30;
        }else {
            System.out.println("Tarifa no disponible.");
        }
    }

    /**
     * Metodo para realizar una llamada, sobreescrito de la superclase Terminal.
     * @param terminal Terminal al que se desea llamar.
     * @param segundosLlamada Segundos que dura la llamada.
     */
    @Override
    public void llama(Terminal terminal, int segundosLlamada) {
        super.llama(terminal, segundosLlamada);

        double minutosLLamada = (double) segundosLlamada / 60;

        this.tarificacion += minutosLLamada * costeMinuto;
    }

    @Override
    public String toString() {
        return super.toString()+" - Tarificados "+tarificacion+" euros.";
    }
}
