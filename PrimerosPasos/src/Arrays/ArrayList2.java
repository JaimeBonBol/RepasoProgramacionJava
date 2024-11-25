package Arrays;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        //Realizar operaciones de:
        // iteración y manipulación de elemantos.

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Cereza");
        frutas.add("Aceituna");

        //El .size entiende que puede cambiar el tamaño por eso para el for que recorre el array list se ultiliza el size
        for (int i=0; i< frutas.size(); i++){
            System.out.println("Fruta "+ (i+1)+": "+frutas.get(i));
        }

        //Imprimir usando un for each
        int contaje=1;
        for (String fruta:frutas){
            System.out.println("Fruta "+contaje+": "+ fruta);
            contaje++;
        }

        //Eliminar elemento
        frutas.remove("Cereza");
        frutas.remove(1);
        System.out.println(frutas);

        //ArrayList de enteros donde se emplee lo siguiente:
        // Buscar un elemento.
        //Clonar o copiar el ArrayList.
        //Vaciar o limpiar los elementos del ArrayList.

        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(4);
        numeros.add(10);


        //Buscar un número si existe.
        int numeroBuscado = 2;
        if (numeros.contains(numeroBuscado)){
            System.out.println("El número "+ numeroBuscado + " está en la lista");
        }else {
            System.out.println("El número "+ numeroBuscado + " NO está en la lista");
        }

        //Clonar el ArrayList.
        ArrayList<Integer> copianumeros= (ArrayList<Integer>)numeros.clone() ;
        System.out.println("Copia de la lista números: "+ copianumeros);

        //Limpio el Array.
        numeros.clear();
        System.out.println("Lista original depués de limpiarla: "+numeros);


    }
}
