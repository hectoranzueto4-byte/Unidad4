package com.yazidsystems.unidad4.funciones;

import java.util.*;

class Nodo<T> {
    T dato;
    List<Nodo<T>> vecinos;

    public Nodo(T dato) {
        this.dato = dato;
        this.vecinos = new ArrayList<>();
    }

    public void agregarVecino(Nodo<T> vecino) {
        this.vecinos.add(vecino);
    }
}

class Grafo<T> {
    Map<T, Nodo<T>> nodos;

    public Grafo() {
        this.nodos = new HashMap<>();
    }

    public void agregarNodo(T dato) {
        nodos.putIfAbsent(dato, new Nodo<>(dato));
    }

    public void agregarArista(T inicio, T fin) {
        agregarNodo(inicio);
        agregarNodo(fin);
        nodos.get(inicio).agregarVecino(nodos.get(fin));
        // Si es no dirigido, agregar también la arista inversa
        // nodos.get(fin).agregarVecino(nodos.get(inicio));
    }

    // Método para BFS
    public void bfs(T inicio) {
        Queue<Nodo<T>> cola = new LinkedList<>();
        Set<T> visitados = new HashSet<>();

        Nodo<T> nodoInicio = nodos.get(inicio);
        cola.add(nodoInicio);
        visitados.add(inicio);

        while (!cola.isEmpty()) {
            Nodo<T> actual = cola.poll();
            System.out.print(actual.dato + " ");

            for (Nodo<T> vecino : actual.vecinos) {
                if (!visitados.contains(vecino.dato)) {
                    visitados.add(vecino.dato);
                    cola.add(vecino);
                }
            }
        }
        System.out.println();
    }
}