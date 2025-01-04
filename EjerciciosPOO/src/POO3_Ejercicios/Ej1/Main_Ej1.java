package POO3_Ejercicios.Ej1;

public class Main_Ej1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Pepe", 20, "ABC1234");
        Estudiante estudiante2 = new Estudiante("María", 22, "CVD564");
        Estudiante estudiante3 = new Estudiante("Juan", 31, "QWE934");
        Estudiante estudiante4 = new Estudiante("Luna", 20, "UYS153");

        Estudiante.registrarEstudiante("Luis", 21, "VDQ579");

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        
    }
}
