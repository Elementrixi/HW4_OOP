package main.java.com.hwnumber4.shapes.defshapes;

import main.java.com.hwnumber4.vertex.Vertex;
import java.util.List;

public abstract class Shape {
    private List<Vertex> vertex2DS;

    public Shape(List<Vertex> vertices) {
        this.vertex2DS = vertices;
    }
}
