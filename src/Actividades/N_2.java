package Actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class N_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 20 numeros decimales:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            double numeroDecimal = scanner.nextDouble();
            numeros.add((int) Math.round(numeroDecimal));
        }

        int mayor = numeros.get(0);
        int menor = numeros.get(0);

        for (Integer num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        int rango = mayor - menor;

        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
        System.out.println("El rango (diferencia entre el mayor y el menor) es: " + rango);

        scanner.close(); 
    }
}

