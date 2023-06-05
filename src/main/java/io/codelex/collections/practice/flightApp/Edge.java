package io.codelex.collections.practice.flightApp;

public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startVertex, Vertex endVertex, Integer weight){
        this.start = startVertex;
        this.end = endVertex;
        this.weight = weight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
}