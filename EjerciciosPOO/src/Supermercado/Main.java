package Supermercado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Detergente detergente1 = new Detergente("Ariel",5.39);
        detergente1.setDescuento(20);
        Detergente detergente2 = new Detergente("Mimosin",4.25);
        Detergente detergente3 = new Detergente("Colon",3.99);
        detergente3.setDescuento(70);

        Cereales cereales1 = new Cereales("Flakes",1.50,"maiz");
        cereales1.setCaducidad(LocalDate.of(2025, 6, 1));

        Cereales cereales2 = new Cereales("Nesquick",1.0,"espelta");
        cereales2.setCaducidad(LocalDate.of(2025,3,24));

        Cereales cereales3 = new Cereales("Trix",2.05,"trigo");
        cereales3.setCaducidad(LocalDate.of(2026,1,2));

        Cereales cereales4 = new Cereales("Fitness",3.15,"maizena");
        cereales4.setCaducidad(LocalDate.of(2026,3,29));

        Vino vino1 = new Vino("Rioja","Tinto",11.5,25.50);
        vino1.setDescuento(3.67);
        vino1.setTipoEnvase("Vidrio");
        vino1.setVolumen(20.58);
        Vino vino2 = new Vino("Frizzante","Frisante",7.8,16.99);
        vino2.setTipoEnvase("Vidrio");
        vino2.setVolumen(14.70);
        Vino vino3 = new Vino("Chardonnay","Blaco",8.2,21.30);
        vino3.setTipoEnvase("Plástico");
        vino3.setVolumen(30.64);

        ArrayList<EsAlimento> alimentos = new ArrayList<>();
        alimentos.add(cereales1);
        alimentos.add(cereales2);
        alimentos.add(cereales3);
        alimentos.add(cereales4);

        ArrayList<EsLiquido> liquidos = new ArrayList<>();
        liquidos.add(vino1);
        liquidos.add(vino2);
        liquidos.add(vino3);

        ArrayList<Detergente> detergentes = new ArrayList<>();
        detergentes.add(detergente1);
        detergentes.add(detergente2);
        detergentes.add(detergente3);

        System.out.println("PRUEBAS ALIMENTOS");

        for (EsAlimento alimento : alimentos){
            System.out.println(alimento);
            System.out.println();
        }

        System.out.println("PRUEBAS LIQUIDOS");

        for (EsLiquido liquido : liquidos){
            System.out.println(liquido);
            System.out.println();
        }

        System.out.println("PRUEBAS DETERGENTES");

        for (Detergente detergente : detergentes){
            System.out.println(detergente);
            System.out.println();
        }
    }
}
