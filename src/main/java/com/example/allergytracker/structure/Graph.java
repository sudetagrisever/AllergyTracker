package com.example.allergytracker.structure;

import java.util.*;

public class Graph<T> {
    private Map<T, List<T>> adjVertices = new HashMap<>();

    // Yeni bir düğüm (vertex) ekler
    public void addVertex(T label) {
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }

    // İki düğüm arasında kenar (edge) ekler
    public void addEdge(T from, T to) {
        adjVertices.get(from).add(to);
    }

    // Belirli bir düğümün komşularını döner
    public List<T> getAdjVertices(T label) {
        return adjVertices.get(label);
    }

    // Grafı yazdırır
    public void printGraph() {
        for (T vertex : adjVertices.keySet()) {
            System.out.println(vertex + " -> " + adjVertices.get(vertex));
        }
    }
}
