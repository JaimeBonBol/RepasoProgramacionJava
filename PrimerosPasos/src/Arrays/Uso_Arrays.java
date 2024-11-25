package Arrays;

public class Uso_Arrays {
    public static void main(String[] args) {
        //Repaso Array.
        /*
        int [] mi_matriz = new int[5];

        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=-54;
        mi_matriz[3]=20;
        mi_matriz[4]=10;

         */

        int [] mi_matriz = {5, 38, -54, 20, 10, 4, 233, 453, -5, 96, -42};

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Valor del índice "+i+": "+mi_matriz[i]);
        }



    }
}
