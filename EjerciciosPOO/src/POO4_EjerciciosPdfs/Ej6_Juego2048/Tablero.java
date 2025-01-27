package POO4_EjerciciosPdfs.Ej6_Juego2048;

import java.util.Random;

public class Tablero {

    /**
     * Atributos de la clase Tablero.
     */
    private int [][] tablero;
    private int FIL = 4;
    private int COL = 4;

    /**
     * Constructo de la clase Tablero, inicializando el tablero con 4 filas y 4 columnas, y rellenandolas de 0.
     * LLamando al metodo colocarNumero2 dos veces para que se rellene en 2 posiciones aleatorias con el numero 2.
     */
    public Tablero(){
        tablero = new int[FIL][COL];

        for (int i = 0; i < FIL-1; i++) {
            for (int j = 0; j < COL-1; j++) {
                tablero[i][j] = 0;
            }
        }

        colocarNumero2();
        colocarNumero2();
    }

    /**
     * Metodo para colocar el número 2 en una posición aleatoria.
     */
    public void colocarNumero2(){
        Random random = new Random();
        //Obtener una fila aleatoria entre el número de filas del tablero y guardarlo en la variable filaAleatoria.
        int filaAleatoria = random.nextInt(FIL);

        //Obtener una columna aleatoria entre el número de columnas del tablero y guardarlo en la variable columnaAleatoria.
        int columnaAleatoria = random.nextInt(COL);

        if (tablero[filaAleatoria][columnaAleatoria] == 0){
            tablero[filaAleatoria][columnaAleatoria] = 2;
        }
    }

    /**
     * Metodo para mostrar el tablero.
     */
    public void mostrarTablero(){
        for (int i = 0; i < FIL; i++) {
            System.out.println();
            for (int j = 0; j < COL; j++) {
                System.out.print(tablero[i][j]+" ");
            }
        }
    }

}
