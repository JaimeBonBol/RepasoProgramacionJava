package POO2_Ejercicios.Ej1;

public class Caballo {
    private String sexo;
    private int edad;
    private String color;
    private String nombre;

    public Caballo(String sexo, int edad, String color, String nombre){
        this.sexo = sexo;
        this.edad = edad;
        this.color = color;
        this.nombre = nombre;
    }

    public void cabalga(){
        System.out.println(this.nombre+" cabalgando...");
    }

    public void relincha(){
        System.out.println(this.nombre+" relinchando...");
    }

    public void come(){
        System.out.println(this.nombre+" comiendo...");
    }
}
