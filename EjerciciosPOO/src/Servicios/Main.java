package Servicios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Servicio servicio1 = new TrabajoPintura("Pepe Sanchez", LocalDate.of(2025,1,4),"Juan Ramirez",40,4.35);
        Servicio servicio2 = new TrabajoPintura("Jose Martinez", LocalDate.of(2025,2,28),"Marta Fernandez",59,3.90);

        Servicio servicio3 = new RevisionAlarma(LocalDate.of(2024,12,19),"Sofia Lorenzo",12);
        Servicio servicio4 = new RevisionAlarma(LocalDate.of(2024,12,29),"Ies Antonio Gala",30);


        ArrayList<Servicio>  servicios = new ArrayList<>();

        servicios.add(servicio1);
        servicios.add(servicio2);
        servicios.add(servicio3);
        servicios.add(servicio4);

        System.out.println();

        for (Servicio servicio : servicios){
            System.out.println(servicio.detalleServicio());
            System.out.println();
        }
    }
}
