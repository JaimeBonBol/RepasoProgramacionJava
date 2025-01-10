package Parking;

import java.util.ArrayList;

public class Parking {

    protected ArrayList<String> matriculas;
    private String nombre;

    public Parking(String nombre, int numPlazas){
        this.nombre = nombre;
        this.matriculas = new ArrayList<>(numPlazas);
        for (String plaza : matriculas){
            matriculas.add(null);
        }
    }
    
}

class Main{
    public static void main(String[] args) {
        Parking parking = new Parking("Arabial",10);
    }
}
