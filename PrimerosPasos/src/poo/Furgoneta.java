package poo;

//Para decirle a una clase que tiene que heredar de otra: extends
public class Furgoneta extends Coche{

    //Atributos propios de la clase Furgoneta.
    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadCarga){
        super();    //Llama al constructor de la clase padre.
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    public String getDatosFutgoneta(){
        return "La capacidad de carga es: "+ capacidadCarga+ "kg. Y las plazas son: " +plazasExtra;
    }
}
