package com.yazidsystems.unidad4.funciones;
// Clase que representa el Árbol Binario de Búsqueda
public class BinaryTree {
    public Nodo raiz;

    // Insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        // Si el valor ya existe, no se inserta (evita duplicados)
        return actual;
    }

    // Buscar un valor en el árbol
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (valor == actual.valor) {
            return true;
        }
        return valor < actual.valor
                ? buscarRecursivo(actual.izquierdo, valor)
                : buscarRecursivo(actual.derecho, valor);
    }

    // Recorrido en orden (izquierda, raíz, derecha)
    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    // Recorrido preorden (raíz, izquierda, derecha)
    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    // Recorrido postorden (izquierda, derecha, raíz)
    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}
