package Actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class N_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números (ingresa un número menor a 0 para finalizar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break; 
            }
            numeros.add(numero); 
        }

        System.out.println("Números ingresados:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}

