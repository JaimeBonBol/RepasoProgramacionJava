package POO1_EjerciciosIntermedios.Ej6;

public class Uso_Tiempo {
    public static void main(String[] args) {

        Tiempo t1 = new Tiempo(1,70,30);
        Tiempo t2 = new Tiempo(1,50,63);

        //De esta forma para guardarlo en un nuevo objeto, tinees que iunstanciar el objeto y gguardar en el la suma
        Tiempo t3 = t1.sumar(t1, t2);
        System.out.println(t3.getHoras()+" h "+t3.getMinutos()+" m "+t3.getSegundos()+" s ");

        //Con el metodo to string.
        System.out.println("Suma de "+t1+" y "+t2);
        System.out.println(t1.sumar(t1, t2));
    }
}
