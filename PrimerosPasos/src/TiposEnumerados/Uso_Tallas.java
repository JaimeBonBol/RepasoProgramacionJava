package TiposEnumerados;

import java.util.Scanner;

public class Uso_Tallas {

    //enum Talla{MINI,MEIDANO,GRANDE,MUY_GRANDE};

    enum Talla{

        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private String abreviatura;

        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura() {
            return abreviatura;
        }

    }

    public static void main(String[] args) {

        /*Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
        String entradaDatos = entrada.next().toUpperCase();

        Talla laTalla = Enum.valueOf(Talla.class,entradaDatos);

        System.out.println("Talla: "+laTalla);
        System.out.println("Abreviatura: "+laTalla.getAbreviatura());
    }
}
