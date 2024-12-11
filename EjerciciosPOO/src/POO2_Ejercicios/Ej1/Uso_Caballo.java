package POO2_Ejercicios.Ej1;

public class Uso_Caballo {
    public static void main(String[] args) {
        Caballo caballo1 =new Caballo("Macho", 2, "Marrón", "Pepe");
        Caballo caballo2 =new Caballo("Macho", 3, "Blanco", "Paco");
        Caballo caballo3 =new Caballo("Hembra", 2, "Negro", "Mari");

        caballo1.cabalga();
        caballo2.relincha();
        caballo3.come();
    }
}
