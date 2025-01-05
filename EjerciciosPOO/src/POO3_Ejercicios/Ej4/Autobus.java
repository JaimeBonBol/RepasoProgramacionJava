package POO3_Ejercicios.Ej4;

import java.util.List;

public class Autobus extends Vehiculo{

    /**
     * Atributos de la clase Autobus que hereda de Vehiculo.
     */
    private String empresa;
    private String[] paradas;

    /**
     * Constructor de la clase Autobus.
     * @param matricula
     * @param capacidad
     * @param empresa
     * @param paradas
     */
    public Autobus(String matricula, int capacidad, String empresa, String[] paradas){
        super(matricula,capacidad);
        this.empresa = empresa;
        this.paradas = paradas;
    }

    /**
     * Metodo para mostrar información de la clase Autobus.
     */
    @Override
    public void mostrarInformacion() {

        //LLamo al metodo de la superclase Vehiculo.
        super.mostrarInformacion();

        //Y muesto los atributos especificos de la clase Autobus
        System.out.println("Empresa: "+this.empresa);
        //System.out.println("Paradas: "+this.paradas); //Si inteno mostrar las paradas de esta forma me dará la dirección de memoria a la que apunta,
        // por tanto tengo que recorrer la lista con un bucle for.
        System.out.print("Paradas: ");
        for (String parada : paradas){
            System.out.print(parada+" ");
        }
    }
}