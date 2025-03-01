package POO_EjerciciosRepaso.Ej_Pizzeria;

import java.util.Arrays;
import java.util.Scanner;

public class Pedido {

    /**
     * Atributos de la clase Pedido.
     * Nombre del cliente.
     * Teléfono del cliente.
     * Código único del pedido, asignado automáticamente. Creo una variable contadorCodigos static por que pertenece a la clase, es decir, todas
     * las instancias de la clase comparten el mismo valor para ese atributo.
     * Número de ingredientes solicitados.
     * Lista de ingredientes seleccionados para la pizza.
     */
    private String nombre;
    private int telefono;
    protected int codigoPedido;
    private int numeroIngredientes;
    private String[] ingredientes;

    private static int contadorCodigos = 0;


    public Pedido(String nombre, int telefono, int numeroIngredientes){
        this.nombre = nombre;
        this.telefono = telefono;
        this.numeroIngredientes = numeroIngredientes;
        this.ingredientes = introducirIngredientes();
        contadorCodigos ++;
        this.codigoPedido = contadorCodigos;
    }

    /**
     * Metodo para introducir ingredientes. Dependiendo de el numero de ingredientes que se deseen introducir.
     * @return Lista de ingredientes seleccionados.
     */
    public String[] introducirIngredientes(){

        Scanner entrada = new Scanner(System.in);
        String[] listaIngredientes = new String[numeroIngredientes];

        System.out.println("Ingredientes disponibles: " +
                "\n0.Tomate" +
                "\n1.Queso" +
                "\n2.Nata" +
                "\n3.Cebolla" +
                "\n4.Pollo" +
                "\n5.Huevo" +
                "\n6.Salami" +
                "\n7.Anchoa" +
                "\n8.Bacon" +
                "\n9.Gamba");

        for (int i = 0; i < listaIngredientes.length; i++) {
            System.out.println("Introduce ingrediente: ");
            int opcion = entrada.nextInt();
            switch (opcion){
                case 0:
                    listaIngredientes[i] = "Tomate";
                    break;
                case 1:
                    listaIngredientes[i] = "Queso";
                    break;
                case 2:
                    listaIngredientes[i] = "Nata";
                    break;
                case 3:
                    listaIngredientes[i] = "Cebolla";
                    break;
                case 4:
                    listaIngredientes[i] = "Pollo";
                    break;
                case 5:
                    listaIngredientes[i] = "Huevo";
                    break;
                case 6:
                    listaIngredientes[i] = "Salami";
                    break;
                case 7:
                    listaIngredientes[i] = "Anchoa";
                    break;
                case 8:
                    listaIngredientes[i] = "Bacon";
                    break;
                case 9:
                    listaIngredientes[i] = "Gamba";
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }


        return listaIngredientes;

    }

    /**
     * Getters y setters para los atributos de la clase Pedido.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public void setNumeroIngredientes(int numeroIngredientes) {
        this.numeroIngredientes = numeroIngredientes;
    }

    public String getIngredientes() {
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < ingredientes.length; i++) {
            sb.append(i+", ");
        }
        return sb.toString();
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Metodo para mostrar la información del pedido.
     * @return
     */
    @Override
    public String toString() {
        return "Pedido"+ getCodigoPedido()+
                "\nNombre: "+getNombre()+
                "\nTeléfono: "+getTelefono()+
                "\nCódigo pedido: "+getCodigoPedido()+
                "\nNúmero ingredientes: "+getNumeroIngredientes()+
                "\nIngredientes: "+getIngredientes();
    }
}
