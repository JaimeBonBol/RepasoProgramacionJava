package POO1_EjerciciosIntermedios.Ej13;

public class Uso_CuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println();
        cuenta1.ingreso(2000);
        cuenta2.gasto(600);
        cuenta3.ingreso(75);
        cuenta1.gasto(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println();
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
