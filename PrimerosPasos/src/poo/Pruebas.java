package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("María");


        trabajador1.setSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos()+"\n"+ trabajador2.devuelveDatos()+"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());

    }
}

class Empleados{
    private final String nombre;
    private String seccion;
    private int id;
    protected static int idSiguiente = 1;

    public Empleados(String nombre){
        this.nombre = nombre;
        this.seccion = "Administración";
        this.id = idSiguiente;
        idSiguiente++;
    }

    public void setSeccion(String seccion){ //Setter
        this.seccion = seccion;
    }


    public String devuelveDatos(){  //Getter
        return "El nombre es: "+nombre+"  la sección es "+seccion+" y el Id="+id;
    }

    public static String dameIdSiguiente(){
        return "El id siguiente es "+idSiguiente;
    }
}