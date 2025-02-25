package POO_EjerciciosRepaso.Ej2_Repaso;

import java.util.Random;

public class Persona {

    /**
     * Enum que se va a utilizar para solor tener la opción en el atributo sexo de H o M.
     */
    public enum Sexo{
        H, M
    }

    /**
     * Atributos de la clase Persona.
     */
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;  //El atributo sexo es de tipo Sexo(enum).
    private double peso;
    private double altura;

    /**
     * Constantes. Constante para que sexo por defecto sea H.
     */
    private final char SEXO_PREDEFINIDO = 'H';

    /**
     * Constructor con valores por defecto.
     */
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SEXO_PREDEFINIDO;
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * Constructor en el que se le pasa por parámetros nombre, edad y sexo, lo demás por defecto.
     * @param nombre Nombre
     * @param edad Edad
     * @param sexo Sexo
     */
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * Constructo en el que hay que pasarle por parámetros todos los atributos.
     * @param nombre Nombre
     * @param edad Edad
     * @param DNI DNI
     * @param sexo Sexo
     * @param peso Peso
     * @param altura Altura
     */
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura =altura;
    }


    /**
     * Getters y setters para cada atributo.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }



    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSEXO_PREDEFINIDO() {
        return SEXO_PREDEFINIDO;
    }

    /**
     * Metodo que calcula el IMC de una persona.
     * @return devuelve un valor entero (-1, 0 o 1) dependiendo del resultado del cálculo.
     */
    public int calcularIMV(){
        final int IDEAL = -1;
        final int DEBAJO_IDEAL = 0;
        final int SOBREPESO = 1;
        if (this.peso / (Math.pow(this.altura,2)) < 20){
            return IDEAL;
        } else if (this.peso / (Math.pow(this.altura,2)) >= 20 && this.peso / (Math.pow(this.altura,2)) <= 25) {
            return DEBAJO_IDEAL;
        }else {
            return SOBREPESO;
        }

    }

    /**
     * Metodo para comprobar si la persona es mayor de edad.
     * @return devuelve un valor booleano dependiendo si es mayor de edad o no.
     */
    public boolean esMayordeEdad(){
        if (this.edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    public String generarDNI(){
        Random random = new Random();

        StringBuilder sb = new StringBuilder();
        //Para generar un número aleatorio.
        int numAleatorio = random.nextInt(10);

        //Para generar una letra aleatoria.
        char letraAleatoria = (char) ('A'+random.nextInt(26));
        for (int i = 0; i < 8; i++) {
            sb.append(numAleatorio);
        }
        //Para generar una letra aleatoria.
        sb.append(letraAleatoria);
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Informacion persona: "+
                "\nNombre: "+ getNombre()+
                "\nEdad: "+getEdad()+
                "\nDNI: "+getDNI()+
                "\nSexo: "+getSexo()+
                "\nPeso: "+getPeso()+" kg"+
                "Altura: "+getAltura()+" m";
    }
}
