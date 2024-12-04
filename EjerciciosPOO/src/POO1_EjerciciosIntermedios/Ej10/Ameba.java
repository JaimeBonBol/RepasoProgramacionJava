package POO1_EjerciciosIntermedios.Ej10;

public class Ameba {

    //Atributos.
    private int peso;

    //Metodo constructor de la clase Ameba.
    public Ameba(){
        this.peso = 3;
    }

    /*public int fagocitar(){
        return this.peso -1;
    }*/

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void come(int microGramos){
        this.peso += microGramos - 1;
    }

    public void come(Ameba ameba){
        this.peso += ameba.peso - 1;
        ameba.setPeso(0);
    }

    public String toString(){
        return "Soy una ameba y peso "+ this.peso+" micogramos.";
    }
}
