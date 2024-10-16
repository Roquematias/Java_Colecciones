package Actividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N_5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 10 digitos enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digito " + (i + 1) + ": ");
            int digit = scanner.nextInt();
            numeros.add(digit);
        }

        ArrayList<Integer> listaAscendente = new ArrayList<>(numeros);
        ArrayList<Integer> listaDescendente = new ArrayList<>(numeros);

        Collections.sort(listaAscendente); 
        Collections.sort(listaDescendente, Collections.reverseOrder()); 

        System.out.println("Lista Ascendente: " + listaAscendente);
        System.out.println("Lista Descendente: " + listaDescendente);

        scanner.close();
    }
}

