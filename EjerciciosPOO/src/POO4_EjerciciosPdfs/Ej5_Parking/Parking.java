package POO4_EjerciciosPdfs.Ej5_Parking;

import java.util.ArrayList;

public class Parking {

    /**
     * Atributos de la clase Parking
     */
    protected ArrayList<String> matriculas;
    private String nombre;

    /**
     * Constructor de la clase parking
     * @param nombre
     * @param numPlazas
     */
    public Parking(String nombre, int numPlazas){
        this.nombre = nombre;
        this.matriculas = new ArrayList<>(numPlazas);
        for (int i = 0; i < numPlazas; i++) {
            matriculas.add(null);
        }
    }

    /**
     * Metodo getter para obtener el valor de la variable nombre.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void getMatriculas() {
        int contador = 1;
        for (String plaza : matriculas){
            System.out.println("Plaza "+contador+": "+plaza);
            contador ++;
        }
    }

    public void entrada(String matricula, int plaza){
        if (matricula.length()<4 || matricula == null) {
            throw new RuntimeException ("Matricula incorrecta");
        } else if (matriculas.get(plaza) != null) {
            throw new RuntimeException("Plaza ocupada");
        } else if (matriculas.contains(matricula)) {
            throw new RuntimeException("Matricula repetida");
        }else {
            matriculas.set(plaza-1,matricula);
        }
    }

}

class Main{
    public static void main(String[] args) {
        Parking parking = new Parking("Arabial",11);

        parking.getMatriculas();
        parking.entrada("1234JGY",2);
        System.out.println();
        parking.getMatriculas();

    }
}
