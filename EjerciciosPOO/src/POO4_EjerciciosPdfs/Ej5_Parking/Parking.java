package POO4_EjerciciosPdfs.Ej5_Parking;

import java.util.ArrayList;

public class Parking {

    protected ArrayList<String> matriculas;
    private String nombre;

    public Parking(String nombre, int numPlazas){
        this.nombre = nombre;
        this.matriculas = new ArrayList<>(numPlazas);
        for (int i = 0; i < numPlazas; i++) {
            matriculas.add(null);
        }
    }



    public void getMatriculas() {
        int contador = 1;
        for (String plaza : matriculas){
            System.out.println("Plaza "+contador+": "+plaza);
            contador ++;
        }
    }
    

}

class Main{
    public static void main(String[] args) {
        Parking parking = new Parking("Arabial",10);

        parking.getMatriculas();

    }
}
