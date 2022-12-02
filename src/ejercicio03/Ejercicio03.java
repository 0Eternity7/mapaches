package ejercicio03;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Eternity_19
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero[] = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Inserte un numero natural: ");
            numero[i] = entrada.nextInt();
        }
        Arrays.sort(numero);

        System.out.println("El numero minimo es: " + numero[0] + " y el numero maximo es: " + numero[9]);

    }
}
