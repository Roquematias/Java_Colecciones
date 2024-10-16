package Actividades;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class N_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            numeros.add(random.nextInt(100) + 1); 
        }

        System.out.println("Numeros generados: " + numeros);

        System.out.print("Introduce el numero que deseas buscar: ");
        int valorABuscar = scanner.nextInt();

        int posicion = -1; 
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valorABuscar) {
                posicion = i; 
                break; 
            }
        }

        if (posicion != -1) {
            System.out.println("El numero " + valorABuscar + " se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("El numero " + valorABuscar + " no se encontro en la lista.");
        }

        scanner.close(); // 
    }
}

