package Figuras;

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
            }else {
                System.out.println("La figura con el id "+id+" no está en la lista.");
            }
        }
    }

    /**
     * Metodo toString que devuelve las características de cada figura que hay en la lista de figuras.
     * @return
     */
    @Override
    public String toString() {
        for (Figura figura : listaFiguras){
            return figura.getSuperheroe().getNombre();
        }
        return null;
    }

    /**
     * Metodo que comprueba en la lista si dentro de la figura, el supeheroe tiene capa, y si tiene lo muestra.
     */
    public void conCapa(){
        for (Figura figura : listaFiguras){
            if (figura.getSuperheroe().getCapa() == true){
                System.out.println(figura.getSuperheroe().getNombre());
            }
        }
    }

    public Figura masValioso(){
        double valioso = 0;
        Figura figuraValiosa = null;
        for (Figura figura : listaFiguras){
            if (figura.precio > valioso){
                valioso = figura.precio;
                figuraValiosa = figura;
            }
        }
        return new Figura(figuraValiosa.codigo,figuraValiosa.precio,figuraValiosa.getDimensiones(),figuraValiosa.getSuperheroe());
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
