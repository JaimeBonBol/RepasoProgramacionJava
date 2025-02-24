package POO_EjerciciosRepaso.Ej1_Cuenta;

public class MainEj1 {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Pepe Ruiz");
        Cuenta cuenta2 = new Cuenta("Luisa Martinez",1000);

        System.out.println(cuenta1);

        System.out.println();

        System.out.println(cuenta2);

        cuenta1.ingresar(2500.85);

        cuenta2.retirar(608.50);

        System.out.println();

        System.out.println(cuenta1);

        System.out.println();

        System.out.println(cuenta2);
    }
}
