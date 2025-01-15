package POO4_EjerciciosPdfs.Ej1_Figuras;

import java.util.ArrayList;

public class Coleccion {

    /**
     * Atributos de la clase Coleccion.
     */
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    /**
     * Constructor de la clase Coleccion.
     * @param nombreColeccion
     */
    public Coleccion(String nombreColeccion){
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    /**
     * metodo getter para obtener el valor de la variable nombreColeccion.
     * @return
     */
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    /**
     * Metodo setter para definir un nuevo valor a la variable nombreColeccion.
     * @param nombreColeccion
     */
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    /**
     * Metodo para añadir una figura a el array list listaFiguras.
     * @param figura
     */
    public void aniadirFigura(Figura figura){
        listaFiguras.add(figura);
        System.out.println("Figura añadida con éxito.");
    }

    /**
     * Metodo para subir el precio si la figura con el id introducido está en la lista.
     * @param cantidad
     * @param id
     */
    public void subirPrecio(double cantidad, String id){
        for (Figura figura : listaFiguras){
            if (figura.codigo == id){
                figura.precio +=cantidad;
                System.out.println("Precio subido con éxito.");
            }
        }

    }

    /**
     * Metodo toString que devuelve las características de cada figura que hay en la lista de figuras.
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Figura figura : listaFiguras){
            sb.append(figura.getSuperheroe().getNombre()+", ");
        }
        return sb.toString();
    }

    /**
     * Metodo que comprueba en la lista si dentro de la figura, el supeheroe tiene capa, y si tiene lo muestra.
     */
    public void conCapa(){
        for (Figura figura : listaFiguras){
            if (figura.getSuperheroe().getCapa() == true){
                System.out.print(figura.getSuperheroe().getNombre()+" ");
            }
        }
        System.out.println();
    }

    public String masValioso(){
        double valioso = 0;
        String  figuraValiosa = "";
        for (Figura figura : listaFiguras){
            if (figura.precio > valioso){
                valioso = figura.precio;
                figuraValiosa = figura.getSuperheroe().getNombre();
            }
        }
        return figuraValiosa;
    }

    /**
     * Metodo que devuelve el valor de la colección, sumando todos los precios de las figuras que contiene.
     * @return
     */
    public double getValorColeccion(){
        double valorColeccion = 0;
        for (Figura figura : listaFiguras){
            valorColeccion += figura.precio;
        }
        return valorColeccion;
    }

    /**
     * Metodo para que devuelve el volumen máximo aprox que ocuparía toda la colección.
     * @return
     */
    public double getVolumenColeccion(){
        double volumenMaximo = 0;
        for (Figura figura : listaFiguras){
            volumenMaximo += figura.getDimensiones().getVolumen();
        }
        volumenMaximo += 200;
        return volumenMaximo;
    }
}
