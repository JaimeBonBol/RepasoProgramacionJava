package POO_EjerciciosRepaso.Ej_RepasoExcepciones;

public class Persona {

    private int edad;

    public Persona(int edad){
        this.edad = edad;
    }

    public void mayor() throws PersonaException{
        if (edad < 0){
            throw new PersonaException("La edad no puede ser negativa.");
        }else {
            System.out.println("La persona tiene "+edad);
        }
    }

}

class Main{
    public static void main(String[] args) {
        Persona persona = new Persona(-5);
        try {
            persona.mayor();
        }catch (PersonaException exception){
            System.out.println("Error: "+exception.getMensaje());
        }

    }
}