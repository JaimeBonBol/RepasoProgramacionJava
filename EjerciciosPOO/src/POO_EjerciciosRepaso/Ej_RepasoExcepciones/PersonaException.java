package POO_EjerciciosRepaso.Ej_RepasoExcepciones;

public class PersonaException extends Exception{

    private String mensaje;

    public PersonaException(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
