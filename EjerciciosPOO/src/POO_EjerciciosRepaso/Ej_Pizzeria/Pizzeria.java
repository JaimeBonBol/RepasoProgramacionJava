package POO_EjerciciosRepaso.Ej_Pizzeria;

import java.util.ArrayList;

public class Pizzeria {

    /**
     * Atributos de la clase Pizzería.
     * Numero total de pedidos almacenados.
     * Lista de pedidos realizados.
     */
    private int numeroPedidos;
    private ArrayList<Pedido> listaPedidos;
    private int codigoPedidos;
    private String nombre;

    /**
     * Constructor de la clase Pizzería que inicializa la lista de pedidos para que tenga capacidad de 20 pedidos.
     * Y con el metodo inicializarPIzzería comprueba si esta llena la lista para vaciarla o no.
     */
    public Pizzeria(String nombre){
        this.nombre = nombre;
        this.listaPedidos = new ArrayList<>();
        inicializarPizzeria();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo inicializarPIzzería que comprueba si esta llena la lista para vaciarla o no.
     */
    public void inicializarPizzeria(){
        if (estaLLeno()){
            for (int i = 0; i < listaPedidos.size(); i++) {
                System.out.println("La lista de pedidos esta llena, vaciando...");
                listaPedidos.clear();
            }
        }else {
            System.out.println("Bienvenido a la pizzería "+nombre);
            System.out.println("Listo para comenzar.");
        }
    }

    /**
     * Metodo auxiliar para compronar si la lista esta llena.
     * @return
     */
    public boolean estaLLeno(){
        boolean estaLLeno = false;
        if (listaPedidos.size()== 20){
            for (int i = 0; i < listaPedidos.size(); i++) {
                if (listaPedidos.get(i) != null){
                    estaLLeno = true;
                }
            }
        }
        return estaLLeno;
    }

    /**
     * Metodo para agregar pedido a la lista.
     * @param pedido
     */
    public void agregarPedido(Pedido pedido){
        if (!estaLLeno()){
            listaPedidos.add(pedido);
            System.out.println("Pedido "+pedido.getCodigoPedido()+" agregado con éxito.");
        }else {
            System.out.println("Lista de pedidos completa.");
        }

    }

    /**
     * Metodo para eliminar pedido a partir de su código.
     * @param codigoPedidoEliminar
     */
    public void eliminarPedido(int codigoPedidoEliminar){
        for (Pedido pedido : listaPedidos){
            if (pedido.getCodigoPedido() == codigoPedidoEliminar){
                listaPedidos.remove(pedido);
                System.out.println("Pedido "+codigoPedidoEliminar+ " eliminado.");
            }
        }
    }

    /**
     * Metodo para buscar pedido porn nombre.
     * @param nombre
     */
    public void buscarPedidoPorNombre(String nombre){
        for (Pedido pedido : listaPedidos){
            if (pedido.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Pedido encontrado: ");
                System.out.println(pedido);
            }
        }
    }

    public void ingredientePreferido(){

    }

    /**
     * Metdodo para mostrar los pedidos de la lista.
     */
    public void mostrarPedidos(){
        for (Pedido pedido : listaPedidos){
            System.out.println(pedido);
            System.out.println();
        }
    }

}
