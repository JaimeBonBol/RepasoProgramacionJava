package Ejercicio1_NumerosAleatorios;

public class chatgpt {
    public static void main(String[] args) {
                int anchura, altura;

                System.out.println("Introduce la anchura de la tableta: ");
                anchura = EntradaDatos.LeerNumeroInt();  // Suponiendo que tienes esta clase para leer entradas

                System.out.println("Introduce la altura de la tableta: ");
                altura = EntradaDatos.LeerNumeroInt();

                // Crear una tableta con todos los valores inicializados a "*"
                String[][] tableta = new String[altura][anchura];

                // Inicializar la tableta con asteriscos
                for (int fila = 0; fila < altura; fila++) {
                    for (int columna = 0; columna < anchura; columna++) {
                        tableta[fila][columna] = "*";  // Establecer la tableta como turrón
                    }
                }

                // Generar las coordenadas del bocado aleatorio (en el borde, pero no en el medio)
                int bocadoFila, bocadoColumna;
                do {
                    // Asegurarse de que el bocado no esté en el medio (no en el centro ni en el borde interno)
                    bocadoFila = (int) (Math.random() * (altura - 2)) + 1;  // Evita las filas 0 y altura-1
                    bocadoColumna = (int) (Math.random() * (anchura - 2)) + 1;  // Evita las columnas 0 y anchura-1
                } while (bocadoFila == 0 || bocadoFila == altura - 1 || bocadoColumna == 0 || bocadoColumna == anchura - 1);

                // Poner el bocado en la tableta (cualquier posición válida que no sea en el borde)
                tableta[bocadoFila][bocadoColumna] = " ";  // El bocado se representa con un espacio vacío

                // Imprimir la tableta con el bocado
                for (int fila = 0; fila < altura; fila++) {
                    for (int columna = 0; columna < anchura; columna++) {
                        System.out.print(tableta[fila][columna] + " ");  // Imprimir cada celda
                    }
                    System.out.println();  // Salto de línea después de cada fila
                }
            }
        }
