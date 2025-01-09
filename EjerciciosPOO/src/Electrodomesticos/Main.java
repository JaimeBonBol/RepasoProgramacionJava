package Electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico("lavadora", "Bosch", 1000);
        Electrodomestico electrodomestico2 = new Electrodomestico("Horno", "Lenovo", 1500);
        Electrodomestico electrodomestico3 = new Electrodomestico("Secadora", "Bosch", 2000);

        Lavadora lavadora1 = new Lavadora("Balay", 1750);
        Lavadora lavadora2 = new Lavadora("LG", 450, 1250, true);
        Lavadora lavadora3 = new Lavadora("Cecotec", 300, 700, false);

        int horasElectrodomestico1 = 2;
        int horasElectrodomestico2 = 6;
        int horasElectrodomestico3 = 4;

        double costeçHoraElectrodomestico1 = 0.24;
        double costeçHoraElectrodomestico2 = 0.64;
        double costeçHoraElectrodomestico3 = 0.89;

        System.out.println("PRUEBAS ELECTRODOMESTICOS.");
        System.out.println();
        System.out.println(electrodomestico1);
        System.out.println();
        System.out.println(electrodomestico2);
        System.out.println();
        System.out.println(electrodomestico3);

        System.out.println();
        System.out.println("El consumo de " + electrodomestico1.getTipo() + " de la mmarca " + electrodomestico1.getMarca() + " tiene un consumo de " + electrodomestico1.getConsumo(horasElectrodomestico1) + " en " + horasElectrodomestico1 + " horas");
        System.out.println("El consumo de " + electrodomestico2.getTipo() + " de la mmarca " + electrodomestico2.getMarca() + " tiene un consumo de " + electrodomestico2.getConsumo(horasElectrodomestico2) + " en " + horasElectrodomestico2 + " horas");
        System.out.println("El consumo de " + electrodomestico3.getTipo() + " de la mmarca " + electrodomestico3.getMarca() + " tiene un consumo de " + electrodomestico3.getConsumo(horasElectrodomestico3) + " en " + horasElectrodomestico3 + " horas");


        System.out.println();
        System.out.println("El coste total por el consumo del electrodoméstico " + electrodomestico1.getTipo() + " de la marca " + electrodomestico1.getMarca() + " en " + horasElectrodomestico1 + " horas y con el precio de " + costeçHoraElectrodomestico1 + " euros por hora es de " + electrodomestico1.getCosteConsumo(horasElectrodomestico1, costeçHoraElectrodomestico1));
        System.out.println("El coste total por el consumo del electrodoméstico " + electrodomestico2.getTipo() + " de la marca " + electrodomestico2.getMarca() + " en " + horasElectrodomestico2 + " horas y con el precio de " + costeçHoraElectrodomestico2 + " euros por hora es de " + electrodomestico2.getCosteConsumo(horasElectrodomestico2, costeçHoraElectrodomestico2));
        System.out.println("El coste total por el consumo del electrodoméstico " + electrodomestico3.getTipo() + " de la marca " + electrodomestico3.getMarca() + " en " + horasElectrodomestico3 + " horas y con el precio de " + costeçHoraElectrodomestico3 + " euros por hora es de " + electrodomestico3.getCosteConsumo(horasElectrodomestico3, costeçHoraElectrodomestico3));


        System.out.println();

        System.out.println("PRUEBASA LAVADORAS.");
        System.out.println();
        System.out.println(lavadora1);
        System.out.println();
        System.out.println(lavadora2);
        System.out.println();
        System.out.println(lavadora3);

        System.out.println();

        int horasLavadora1 = 2;
        int horasLavadora2 = 6;
        int horasLavadora3 = 1;


        double costeHoraLavadora1 = 0.24;
        double costeHoraLavadora2 = 0.56;
        double costeHoraLavadora3 = 0.27;

        System.out.println("El consumo de la lavadora de la marca " + lavadora1.getMarca() + " tiene un consumo de " + lavadora1.getConsumo(horasElectrodomestico1) + " en " + horasLavadora1 + " horas");
        System.out.println("El consumo de la lavadora de la marca " + lavadora2.getMarca() + " tiene un consumo de " + lavadora2.getConsumo(horasElectrodomestico2) + " en " + horasLavadora2 + " horas");
        System.out.println("El consumo de la lavadora de la marca " + lavadora3.getMarca() + " tiene un consumo de " + lavadora3.getConsumo(horasElectrodomestico3) + " en " + horasLavadora3 + " horas");


        System.out.println();
        System.out.println("El coste total por el consumo de la lavadora de la marca " + electrodomestico1.getMarca() + " en " + horasLavadora1 + " horas y con el precio de " + costeHoraLavadora1 + " euros por hora es de " + lavadora1.getCosteConsumo(horasLavadora1, costeHoraLavadora1));
        System.out.println("El coste total por el consumo de la lavadora de la marca " + electrodomestico2.getMarca() + " en " + horasLavadora2 + " horas y con el precio de " + costeHoraLavadora2 + " euros por hora es de " + lavadora2.getCosteConsumo(horasLavadora2, costeHoraLavadora2));
        System.out.println("El coste total por el consumo de la lavadora de la marca " + electrodomestico3.getMarca() + " en " + horasLavadora3 + " horas y con el precio de " + costeHoraLavadora3 + " euros por hora es de " + lavadora3.getCosteConsumo(horasLavadora3, costeHoraLavadora3));

    }
}
