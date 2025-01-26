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

    /**
     * Metodo para la entrada de un coche a una plaza del parking, tranatdo los errores siguientes.
     * @param matricula
     * @param plaza
     */
    public void entrada(String matricula, int plaza){
        System.out.println(matriculas.get(plaza-1));
        if (plaza <= 0 || plaza > matriculas.size()){
            throw new RuntimeException("La plaza introducida es errónea");
        }
        //Comprobación del tamaño de la matrícula para que no sea mayor de 4 carácteres.
        if (matricula.length()<4 || matricula == null){
            throw new RuntimeException("Matrícula incorrecta");
        }
        //Comprobación si la plaza está dentro del tamaño del array y si la plaza del array no está vacía.
        else if (plaza >=0 && plaza < matriculas.size() && matriculas.get(plaza-1) != null) {
            throw new RuntimeException("Plaza ocupada");
        }
        //Comprobación si la matrícula ya existe en el parking.
        for (String matriculaExistente : matriculas){
            if (matriculaExistente!=null && matriculaExistente.equalsIgnoreCase(matricula)){
                throw new RuntimeException("Matrícula repetida");
            }
        }
        if (plaza >= 0 && plaza< matriculas.size()){
            matriculas.set(plaza-1,matricula);
            System.out.println("Coche con matrícula "+matricula+" ha entrado en la plaza "+plaza);
            System.out.println();
        }
        System.out.println(matriculas.get(plaza-1));
    }

    /**
     * Metodo para la salida de un coche, si la matrícula no existe lanza un error.
     * @param matricula
     */
    public void salida(String matricula){
        if (matriculas.contains(matricula)){
            System.out.println("El coche con la matrícula "+matricula+" ha salido de la plaza "+(matriculas.indexOf(matricula)+1));
            matriculas.set((matriculas.indexOf(matricula)),null);
        }else {
            throw new RuntimeException("Matrícula no existente");
        }
    }

    public int getPlazasTotales(){
        return matriculas.size();
    }

    public void getMatriculas() {
        int contador = 1;
        for (String plaza : matriculas){
            System.out.println("Plaza "+contador+": "+plaza);
            contador ++;
        }
    }



}

class Main{
    public static void main(String[] args) {
        Parking parking = new Parking("Arabial",11);

        parking.getMatriculas();

        parking.entrada("1234QWE",1);

        parking.getMatriculas();

        parking.entrada("4623LTE",4);

        parking.getMatriculas();

        System.out.println();

        parking.salida("4623LTE");

        parking.getMatriculas();


        parking.salida("1234QWE");

        parking.getMatriculas();

        System.out.println("El parking "+parking.getNombre()+" tiene "+ parking.getPlazasTotales()+" plazas.");

    }
}
