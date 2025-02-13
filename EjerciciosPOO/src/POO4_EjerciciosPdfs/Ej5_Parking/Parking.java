package POO4_EjerciciosPdfs.Ej5_Parking;

import java.util.ArrayList;
import java.util.Collections;

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

        //this.matriculas = new ArrayList<>(Collections.nCopies(numPlazas,null));   También se puede hacer así con Collections.
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
    public void entrada(String matricula, int plaza) throws ParkingException {
        if (plaza <= 0 || plaza > matriculas.size()){
            throw new ParkingException("La plaza introducida es errónea");
        }
        //Comprobación del tamaño de la matrícula para que no sea mayor de 4 carácteres.
        if (matricula.length()<4 || matricula == null){
            throw new ParkingException("Matrícula incorrecta");
        }
        //Comprobación si la plaza está dentro del tamaño del array y si la plaza del array no está vacía.
        else if (plaza >=0 && plaza < matriculas.size() && matriculas.get(plaza-1) != null) {
            throw new ParkingException("Plaza ocupada");
        }
        //Comprobación si la matrícula ya existe en el parking.
        for (String matriculaExistente : matriculas){
            if (matriculaExistente!=null && matriculaExistente.equalsIgnoreCase(matricula)){
                throw new ParkingException("Matrícula repetida");
            }
        }
        if (plaza > 0 && plaza< matriculas.size()){
            matriculas.set(plaza-1,matricula);
            System.out.println("Coche con matrícula "+matricula+" ha entrado en la plaza "+plaza);
        }
    }

    /**
     * Metodo para la salida de un coche, si la matrícula no existe lanza un error.
     * @param matricula
     */
    public int salida(String matricula) throws ParkingException {
        if (matriculas.contains(matricula)){
            System.out.println("El coche con la matrícula "+matricula+" ha salido de la plaza "+(matriculas.indexOf(matricula)+1));
            matriculas.set((matriculas.indexOf(matricula)),null);
            return (matriculas.indexOf(matricula)+1);
        }else {
            throw new ParkingException("Matrícula no existente");
        }
    }

    /**
     * Metodo para obtener el total de plazas que tiene el parking.
     * @return
     */
    public int getPlazasTotales(){
        return matriculas.size();
    }

    /**
     * Metodo para obtener las plazas ocupadas que tiene el parking.
     * @return
     */
    public int getPlazasOcupadas(){
        int contador = 0;
        for (String matriculaPlaza : matriculas){
            if (matriculaPlaza != null){
                 contador ++;
            }
        }
        return contador;
    }

    /**
     * Metodo para obtener las plazas libres que tiene el parking.
     * @return
     */
    public int getPlazasLibres(){
        int contador = 0;
        for (String matriculaPlaza : matriculas){
            if (matriculaPlaza == null){
                contador ++;
            }
        }
        return contador;
    }

    /**
     * Metodo para obtener las matrículas que hay en sus correspondientes plazas.
     * @return
     */
    public String getMatriculas() {
        StringBuilder cadena = new StringBuilder();
        int contador = 1;
        for (String plaza : matriculas){
            if (plaza == null){
                cadena.append("Plaza "+contador+": "+"vacía\n");
                contador ++;
            }else {
                cadena.append("Plaza "+contador+": "+plaza+"\n");
                contador ++;
            }
        }
        return cadena.toString();
    }

    /**
     * Metodo toString para mostrar la información del parking.
     * @return
     */
    @Override
    public String toString() {
        return "Parking "+getNombre()+
                "\n--------------------"+
                "\n"+getMatriculas();
    }

}
