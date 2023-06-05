package io.codelex.collections.practice.flightApp;

import java.util.*;

public class Graph {
    private List<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(String data) {
//        if(getVertexByValue(data) == null){
//            return null;
//        }
//        if(vertices.contains(getVertexByValue(data))){
//            return null;
//
//        }

        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;

    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);
        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
        if (!this.isDirected) {
            vertex2.removeEdge(vertex1);
        }
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }


    public void print() {
        this.vertices.forEach(vertex -> vertex.print(isWeighted));
    }

    public Vertex getVertexByValue(String value) {
        Optional<Vertex> result = vertices.stream().filter(v -> v.getData().equals(value)).findFirst();
        if (result.isPresent()) {
            System.out.println("is");
            return result.get();

        }
        System.out.println("no");
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graph graph = (Graph) o;
        return isWeighted == graph.isWeighted && isDirected == graph.isDirected && Objects.equals(vertices, graph.vertices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertices, isWeighted, isDirected);
    }
}
