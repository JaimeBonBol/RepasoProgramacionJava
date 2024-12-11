package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
        /*
        Empleado empleado1 = new Empleado("Paco Gomez",85000,1990,12,17);
        Empleado empleado2 = new Empleado("Ana Lopez",95000,1995,6,2);
        Empleado empleado3 = new Empleado("Maria Martin",105000,2002,3,15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: "+empleado1.getNombre()+ " Sueldo: "+empleado1.getSueldo()+" Fecha de alta: "+empleado1.getAltaContrato());
        System.out.println("Nombre: "+empleado2.getNombre()+ " Sueldo: "+empleado2.getSueldo()+" Fecha de alta: "+empleado2.getAltaContrato());
        System.out.println("Nombre: "+empleado3.getNombre()+ " Sueldo: "+empleado3.getSueldo()+" Fecha de alta: "+empleado3.getAltaContrato());

         */

        Jefatura jefeRRHH = new Jefatura("Juan",55000,2006,9,25);

        jefeRRHH.setIncentivo(2570);

        //Creamos un array para almacenar a los empleados.
        Empleado [] misEmpleados = new Empleado[6];
        //ArrayList<Empleado> misEmpleados = new ArrayList<>();

        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 3, 15);
        misEmpleados[3] = new Empleado("Antonio Fernandez");
        misEmpleados[4] = jefeRRHH; //Polimorfismo en acción. Principio de sustitución.
        misEmpleados[5] = new Jefatura("María",95000,1999,5,26);

        Jefatura jefaFianzas = (Jefatura) misEmpleados[5];  //Casting de objeto.

        jefaFianzas.setIncentivo(55000);

        //Para subirle el sueldo a los tres empleados.
        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].subeSueldo(5);
        }
         */
        //Con un bucle for each.
        for (Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

        //Con un bucle for each.
        for (Empleado e: misEmpleados){
            System.out.println("Nombre: "+ e.getNombre()+ " Sueldo: "+e.getSueldo()+ " Fecha de alta: "+e.getAltaContrato());
        }

        //Para imprimir por pantalla la informacion de los empleados.
        /*for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: "+ misEmpleados[i].getNombre()+ " Sueldo: "+misEmpleados[i].getSueldo()+ " Fecha de alta: "+misEmpleados[i].getAltaContrato());
        }
         */
    }
}

class Empleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    public Empleado(String nom, double sue, int agno, int mes, int dia){
        this.nombre = nom;
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        this.altaContrato = calendario.getTime();
        ++ IdSiguiente;
        Id = IdSiguiente;

    }

    //Sobrecarga de constructores significa que una clase puede tener varios constructores.
    //Con el this() llama al primer constrcutor pero utiliza el nom de este segundo constructor, y lo demás utiliza los parámetros del anterior.
    public Empleado(String nom){
        this(nom, 30000, 2000, 01, 01);
    }

    public String getNombre(){  //Getter para obtener el nombre.
        return nombre + " ID: "+ Id  ;
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

class Jefatura extends Empleado{

    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);

    }

    public void setIncentivo(double incentivoDado){
        this.incentivo = incentivoDado;
    }

    @Override
    public double getSueldo() {
        double sueldoJefe = super.getSueldo();  //Utilizando el super decimos que llame al metodo de la clase padre (superclase).
        return sueldoJefe + this.incentivo;
    }
}