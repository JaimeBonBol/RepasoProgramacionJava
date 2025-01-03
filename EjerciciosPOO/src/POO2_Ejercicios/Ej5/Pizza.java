package POO2_Ejercicios.Ej5;

public class Pizza {

    /**
     * Atributos de la clase Pizza.
     */
    private String tamanio;
    private String tipo;
    private String estado;

    private static int totalPedidas=0;
    private static int totalServidas=0;

    /**
     * Constructor de la clase Pizza, teniendo que pasarle por paraámetros el tamaño que queremos y el tipo de pizza.
     * Al crear una nueva pizza, el estado es Pedida.
     * @param tamanio
     * @param tipo
     */
    public Pizza(String tamanio, String tipo){
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.estado = "Pedida";
        totalPedidas ++;
    }

    /**
     * toString para mostrar la información de la pizza.
     * @return
     */
    @Override
    public String toString() {
        return "Pizza "+ this.tipo +" "+ this.tamanio; //".Estado: " +this.estado;
    }

    /**
     * Metodo para servir la pizza dependiendo del estado que tenga, si esta pedida se sirve y si hya ha sido servida se muestra por pantalla.
     */
    public void sirve(){
        if (estado.equalsIgnoreCase("Pedida")){
            System.out.println("Servida "+toString());
            estado = "Servida";
            totalServidas ++;
        }
        else {
            System.out.println("La pizza "+toString()+" ya se ha servido.");
        }
    }

    /**
     * Metodo para obtener las pizzas totales pedidas.
     * @return
     */
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    /**
     * Metodo para obtener las pizzas totales servidas.
     * @return
     */
    public static int getTotalServidas() {
        return totalServidas;
    }
}
