package com.yazidsystems.unidad4.funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase que representa un nodo del árbol
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}

public class Trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree arbol = new BinaryTree();

        try {
            // Insertar valores en el árbol
            System.out.println("Ingrese números para insertar en el árbol (0 para terminar):");
            while (true) {
                int num = sc.nextInt();
                if (num == 0) break;
                arbol.insertar(num);
            }

            // Mostrar recorridos
            System.out.print("Recorrido InOrden: ");
            arbol.inOrden(arbol.raiz);
            System.out.println();

            System.out.print("Recorrido PreOrden: ");
            arbol.preOrden(arbol.raiz);
            System.out.println();

            System.out.print("Recorrido PostOrden: ");
            arbol.postOrden(arbol.raiz);
            System.out.println();

            // Buscar un valor
            System.out.print("Ingrese un número para buscar: ");
            int buscar = sc.nextInt();
            if (arbol.buscar(buscar)) {
                System.out.println("El número " + buscar + " SÍ está en el árbol.");
            } else {
                System.out.println("El número " + buscar + " NO está en el árbol.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar solo números enteros.");
        } finally {
            sc.close();
        }
    }
}
