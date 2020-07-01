package main.java.com.hwnumber4.shapes.defshapes;

import main.java.com.hwnumber4.vertex.Vertex;
import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShapes extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private List<Vertex> vertex2D;

    public PlaneShapes(List<Vertex> vertex2D) {
        super(vertex2D);
        this.vertex2D = vertex2D;
    }
}
