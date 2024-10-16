package Actividades;

import java.util.ArrayList;
import java.util.Scanner;

class Celda {
    int fila;
    int columna;
    String valor;

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
}

class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public void agregarCelda(Celda celda) {
        matrizCuadrada.add(celda);
    }

    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.valor;
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }

    public void mostrarMatriz() {
        if (matrizCuadrada.isEmpty()) {
            System.out.println("No hay valores asignados en la matriz.");
            return;
        }
        for (Celda celda : matrizCuadrada) {
            System.out.println("Fila: " + celda.fila + ", Columna: " + celda.columna + ", Valor: " + celda.valor);
        }
    }
}

public class N_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz();
        String opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar celda");
            System.out.println("2. Mostrar matriz");
            System.out.println("3. Consultar valor");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese un valor para la celda: ");
                    String valor = scanner.nextLine();

                    System.out.print("Ingrese la fila: ");
                    int fila = scanner.nextInt();

                    System.out.print("Ingrese la columna: ");
                    int columna = scanner.nextInt();
                    scanner.nextLine(); 

                    Celda celda = new Celda(fila, columna, valor);
                    matriz.agregarCelda(celda);
                    break;

                case "2":
                    System.out.println("Valores en matrizCuadrada:");
                    matriz.mostrarMatriz();
                    break;

                case "3":
                    System.out.print("Ingrese la fila para consultar el valor: ");
                    int filaConsulta = scanner.nextInt();

                    System.out.print("Ingrese la columna para consultar el valor: ");
                    int columnaConsulta = scanner.nextInt();
                    scanner.nextLine();

                    String valorConsultado = matriz.obtenerValor(filaConsulta, columnaConsulta);
                    System.out.println("Valor consultado: " + valorConsultado);
                    break;

                case "4":
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        } while (!opcion.equals("4"));

        scanner.close(); 
    }
}
