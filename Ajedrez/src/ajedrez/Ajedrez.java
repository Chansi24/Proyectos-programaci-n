/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajedrez;
import java.util.Scanner;


/**
 *
 * @author Medac
 */
public class Ajedrez {

    // Representa el tablero de ajedrez
    private static char[][] tablero = {
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero();
            System.out.println("Turno del jugador: ");
            String movimiento = scanner.nextLine();
            if (esMovimientoValido(movimiento)) {
                realizarMovimiento(movimiento);
            } else {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            }
        }
    }

    // Imprime el tablero de ajedrez
    private static void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verifica si un movimiento es válido (solo mueve piezas, no verifica reglas específicas)
    private static boolean esMovimientoValido(String movimiento) {
        // Verifica que el formato del movimiento sea correcto (por ejemplo, "e2 e4")
        if (movimiento.matches("[a-h][1-8] [a-h][1-8]")) {
            return true;
        }
        return false;
    }

    // Realiza un movimiento en el tablero
    private static void realizarMovimiento(String movimiento) {
        // Divide el movimiento en las coordenadas de origen y destino
        String[] coordenadas = movimiento.split(" ");
        String origen = coordenadas[0];
        String destino = coordenadas[1];

        // Convierte las coordenadas a índices de matriz
        int origenFila = 8 - Character.getNumericValue(origen.charAt(1));
        int origenColumna = origen.charAt(0) - 'a';
        int destinoFila = 8 - Character.getNumericValue(destino.charAt(1));
        int destinoColumna = destino.charAt(0) - 'a';

        // Realiza el movimiento en el tablero
        tablero[destinoFila][destinoColumna] = tablero[origenFila][origenColumna];
        tablero[origenFila][origenColumna] = ' ';
    }
    // hola guapo
}
// llamame bbtrick
// manco en el fortnite