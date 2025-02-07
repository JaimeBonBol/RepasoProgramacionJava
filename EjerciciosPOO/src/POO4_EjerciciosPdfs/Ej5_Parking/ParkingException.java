package POO4_EjerciciosPdfs.Ej5_Parking;

public class ParkingException extends Exception{

    private String mensaje;

    public ParkingException(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
