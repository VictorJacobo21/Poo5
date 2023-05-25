package wordle.wordlegame;

import java.util.*;
import java.awt.*;

public class WordleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rondas = 0;
        boolean win = false;
        Wordle juego = new Wordle();
        Tablero tablero = new Tablero();
        tablero.crearTablero();
        Teclado teclado = new Teclado(tablero.getCanvas());
        teclado.dibujarTeclado();
        GraphicString letraGrafica = new GraphicString(tablero.getCanvas());
        
        System.out.println("Wordle, El juego de adivinar la palabra!!");
        System.out.println("Tienes 8 intentos para decifrar la palabra");
        System.out.println("NOTA: Este juego esta diseñado para palabras de 5 letras, palabras mas extensas no se validaran");
        System.out.println("Instrucciones");
        System.out.println("El juego terminara cuando adivines la palabra o se acaben tus intentos");
        System.out.println("Para una mejor experiencia, abra la interfaz grafica creada");
        System.out.println("---------------------------------------------");

        while (rondas < 6 && !win) {
            System.out.println("Ingresa tu respuesta: ");
            String intento = scanner.nextLine();
            
            if (intento.length() > juego.getSecreto().length() || intento.length() < juego.getSecreto().length()) {
                System.out.println("La palabra ingresada es demasiado larga o demasiado corta. Inténtalo de nuevo.");
                continue;
            }
            
            juego.intento(intento, teclado, tablero, rondas);
            tablero.escribirPalabra(intento, rondas);

            if (intento.toUpperCase().equals(juego.getSecreto().toUpperCase())) {
                win = true;
                System.out.println("¡Felicidades! Ganaste el juego.");
                letraGrafica.cambiarColor(Color.green);
                letraGrafica.dibujarString("         ¡GG WP!", 140, 150);
            } else {
                rondas++;
                System.out.println("\nTe quedan " + (6-rondas) + " intentos.");
            }
        }

        if (!win) {
            System.out.println("Has perdido!!");
            letraGrafica.cambiarColor(Color.red);
            letraGrafica.dibujarString("La palabra secreta era: " +juego.getSecreto(), 170, 150);
        }
    }
}
    

