package com.yazidsystems.unidad4.funciones;

import java.util.Scanner;
public class Grafos {
    private int[][] matrizAdyacencia;
    private int numVertices;
    public Grafos(int numVertices) {
        this.numVertices = numVertices;
        this.matrizAdyacencia = new int[numVertices][numVertices];
    }
    public void agregarArista(int origen, int destino, int peso) {
        matrizAdyacencia[origen][destino] = peso;
        // Para grafos no dirigidos, descomenta la siguiente línea:
        // matrizAdyacencia[destino][origen] = peso;
    }
    public void mostrarMatriz() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de vértices: ");
        int numVertices = scanner.nextInt();
        Grafos grafo = new Grafos(numVertices);
        System.out.println("Ingrese las aristas (origen, destino, peso). Ingrese -1 para terminar:");
        while (true) {
            int origen = scanner.nextInt();
            if (origen == -1) break;
            int destino = scanner.nextInt();
            int peso = scanner.nextInt();
            grafo.agregarArista(origen, destino, peso);
        }
        grafo.mostrarMatriz();
    }
}