package POO_EjerciciosRepaso.Ej_FormatearTiempo;

public class FormatearTiempo {
    public static void main(String[] args) {
        int horas = 1;   // Ejemplo: 1 hora
        int minutos = 58; // Ejemplo: 58 minutos
        int segundos = 59; // Ejemplo: 59 segundos

        // Añadir segundos
        int segundosAAgregar = 62; // Ejemplo de agregar 62 segundos
        segundos += segundosAAgregar;

        // Controlamos el rebote de los segundos a los minutos
        if (segundos >= 60) {
            minutos += segundos / 60; // Añadir los minutos obtenidos de los segundos
            segundos = segundos % 60; // El resto son los segundos

            // Controlamos el rebote de los minutos a las horas
            if (minutos >= 60) {
                horas += minutos / 60;  // Añadir las horas obtenidas de los minutos
                minutos = minutos % 60; // El resto son los minutos
            }
        }

        // Imprimir el resultado con el formato adecuado
        System.out.println(String.format("%02d:%02d:%02d", horas, minutos, segundos));
    }
}
