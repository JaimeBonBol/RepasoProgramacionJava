package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Ana Lopez", "Biología");

        for (Persona personas : lasPersonas){
            System.out.println(personas.getNombre()+", "+personas.getDescripcion());
        }
    }
}

abstract class Persona{

    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract String getDescripcion();

}

class Empleado2 extends Persona{

    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    public Empleado2(String nom, double sue, int agno, int mes, int dia){
        super(nom);
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        this.altaContrato = calendario.getTime();
        ++ IdSiguiente;
        Id = IdSiguiente;

    }

    @Override
    public String getDescripcion(){
        return "Este empleado tiene un ID: "+Id+" con un sueldo de "+sueldo;
    }
    public double getSueldo(){  //Getter para obtener el sueldo.
        return sueldo;
    }

    public Date getAltaContrato(){  //Getter para obtener la fecha de alta del contrato.
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){  //Setter.
        double aumento = sueldo * (porcentaje/100);
        sueldo += aumento;
    }
}

class Alumno extends Persona{

    private String carrera;

    public Alumno(String nom, String carrera){
        super(nom);
        this.carrera = carrera;
    }

    @Override
    public String getDescripcion() {
        return "El alumno esta estudiando la carrera de "+carrera;
    }
}
