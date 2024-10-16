package Actividades;

import java.util.ArrayList;
import java.util.Random;

public class N_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int suma = 0;

        while (numeros.size() < 20) {
            int numero = random.nextInt(50) * 2 + 2;
            numeros.add(numero);
            suma += numero; 
        }

        double promedio = suma / 20.0;

        int igualesAlPromedio = 0;
        int mayoresQuePromedio = 0;
        int menoresQuePromedio = 0;

        for (Integer num : numeros) {
            if (num == promedio) {
                igualesAlPromedio++;
            }
            if (num > promedio) {
                mayoresQuePromedio++;
            }
            if (num < promedio) {
                menoresQuePromedio++;
            }
        }

        System.out.println("Numeros generados: " + numeros);
        System.out.println("Promedio aritmetico: " + promedio);
        System.out.println("Cantidad de numeros iguales al promedio: " + igualesAlPromedio);
        System.out.println("Cantidad de numeros mayores que el promedio: " + mayoresQuePromedio);
        System.out.println("Cantidad de numeros menores que el promedio: " + menoresQuePromedio);
    }
}

