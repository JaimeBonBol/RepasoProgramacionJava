package Arrays;

public class Uso_Arrays3 {
    public static void main(String[] args) {
/*
        String [] paises = new String[8];

        for (int i = 0; i < paises.length; i++) {
            paises[i]= JOptionPane.showInputDialog("Introduce país "+(i+1));
        }

        for (String elemento : paises){
            System.out.println("País: "+elemento);
        }

 */

        int [] matriz_aleatorios = new int[150];

        for (int i = 0; i < matriz_aleatorios.length; i++) {
            matriz_aleatorios[i]= (int)Math.round(Math.random()*100);
        }

        for (int numeros : matriz_aleatorios){
            System.out.print(numeros+" ");
        }
    }

}
