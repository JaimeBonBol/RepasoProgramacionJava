package Arrays;

public class Array_ForEach {
    public static void main(String[] args) {
        String [] paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};

        //Recorremos la matriz con un bucle for normal:
        for (int i=0; i< paises.length; i++){
            System.out.println("País "+(i+1)+" : "+paises[i]);
        }
        System.out.println(":::::::::::::::::::::::::::::::");

        for (String pais: paises){
            System.out.println(pais);
        }
    }
}
