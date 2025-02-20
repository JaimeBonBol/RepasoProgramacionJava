package POO_EjerciciosClase.GestionNotasAlumnos;

public class PruebaEstudiante {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pepe García", 3, 2);

        estudiante1.inroducirCalificaciones();
        estudiante1.mostrarCalificaciones();

    }
}
