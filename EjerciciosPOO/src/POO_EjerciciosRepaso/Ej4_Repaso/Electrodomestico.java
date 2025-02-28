package POO_EjerciciosRepaso.Ej4_Repaso;

/**
 * The type Electrodomestico.
 */
public class Electrodomestico {

    /**
     * Atributos de la clase Electrodomestico.
     */
    private double precioBase = 100;
    private String color = "Blanco";
    private char consumoEnergetico = 'F';
    private int peso = 5;

    /**
     * Constructor por defecto.
     */
    public Electrodomestico() {
    }

    /**
     * Constructor con precio y peso, el resto de atributos tendrán valores por defecto.
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Constructor con todos los atributos.
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     * Getters y Setters para todos los atributos.
     */

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Metodo para comprobar si la letra está entre a A y la F.
     * @param letra Letra a comprobar.
     * @return Letra. Si no está disponible se le asigna el valor por defecto.
     */
    public char comprobarConsumoEnergetico(char letra){
        //Pasamos la letra que queremos comprobar a mayusculas.
        letra = Character.toUpperCase(letra);

        //Si la letra está entre la A y la F le asigna esa letra, sino le asigna la letra
        //por defecto, que es la F.
        if (letra >= 'A' && letra <= 'F'){
            return letra;
        }else {
            return 'F';
        }
    }

    /**
     * Metodo para comprobar si el color esta entre los disponibles.
     * @param color Color a comprobar.
     * @return Color. Si no está disponible, le asigna el color por defecto.
     */
    public String comprobarColor(String color){
        //Se crea una losta con los colores disponibles.
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};

        //Paso el color a minuscula ya que en la lista os colores están en minuscula.
        color = color.toLowerCase();

        for (String c : coloresDisponibles){
            if (c.equals(color)){
                return color;
            }
        }
        return "blanco";
    }

    /**
     * Metodo para calcular el precio final, sumandole todos los extras en funcion de su consumo energético
     * y de su peso.
     * @return
     */
    public double precioFinal(){

        double precioFinal = precioBase;

        switch (consumoEnergetico){
            case 'A':
                precioFinal += 100;
                break;

            case 'B':
                precioFinal += 80;
                break;

            case 'C':
                precioFinal += 60;
                break;

            case 'D':
                precioFinal += 50;
                break;

            case 'E':
                precioFinal += 30;
                break;

            case 'F':
                precioFinal += 10;
                break;

        }

        if (peso >= 0 && peso <= 19){
            precioFinal += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 50;
        }else if (peso >= 50 && peso <= 79) {
            precioFinal += 80;
        }else if (peso >= 80 ) {
            precioFinal += 100;
        }

        return precioFinal;
    }

}
