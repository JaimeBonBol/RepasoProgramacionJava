package POO1_EjerciciosIntermedios.Ej6;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        formateoTiempo();
    }

    public void formateoTiempo(){
        if (segundos > 59){
            minutos += segundos / 60;
            segundos = segundos % 60;

        }
        if (minutos > 59){
            horas += minutos /60;
            minutos = minutos % 60;
        }
        if (horas > 23){
            horas = horas % 24;

        }
    }

    public Tiempo sumar(Tiempo a, Tiempo b){
        int sumaHoras = a.horas + b.horas;
        int sumaMinutos = a.minutos + b.minutos;
        int sumaSegundos = a.segundos + b.segundos;

        return new Tiempo(sumaHoras, sumaMinutos, sumaSegundos);
    }

    /*public Tiempo restar(Tiempo a, Tiempo b){
        int restaHoras = a.horas - b.horas;
        int restaMinutos = a.minutos - b.minutos;
        int restaSegundos = a.segundos - b.segundos;

        return new Tiempo(restaHoras, restaMinutos, restaSegundos);
    }
     */

    public String toString(){
        return horas+" h "+minutos+" min "+ segundos+" s.";
    }

    public int getHoras(){
        return horas;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }


}

