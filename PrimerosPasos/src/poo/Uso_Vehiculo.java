package poo;


public class Uso_Vehiculo {
    public static void main(String[] args) {
        Coche micoche1 = new Coche();

        micoche1.setColor("Rojo");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        mifurgoneta1.setColor("Azul");
        mifurgoneta1.setAsientos_cuero("Si");
        mifurgoneta1.setClimatizador("Si");

        System.out.println(micoche1.getDatosGenerales()+". "+ micoche1.getColor());

        System.out.println(mifurgoneta1.getDatosGenerales()+ ". "+mifurgoneta1.getDatosFutgoneta());

    }
}
