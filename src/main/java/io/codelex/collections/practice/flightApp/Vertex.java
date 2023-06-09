package io.codelex.collections.practice.flightApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertex {
    private String data;
    private List<Edge> edges;

    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        this.edges.add(new Edge(this, endVertex, weight));
        System.out.println("add");
    }

    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public String getData() {
        return data;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void print(boolean showWeight){
        String message = "";
        if (this.edges.size() == 0){
            System.out.println("loh");
            return;
        }
        for (int i = 0; i < this.edges.size(); i++) {
            if (i == 0){
                message += this.edges.get(i).getStart().data + " -> ";
            }
            message += this.edges.get(i).getEnd().data;
            if (showWeight) {
                message += " (" + this.edges.get(i).getWeight() + ")";
            }
            if(i != this.edges.size() - 1) {
                message += ", ";
            }
        }

        System.out.println(message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data) && Objects.equals(edges, vertex.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, edges);
    }
}
