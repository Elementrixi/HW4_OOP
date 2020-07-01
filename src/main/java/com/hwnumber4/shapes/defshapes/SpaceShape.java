package main.java.com.hwnumber4.shapes.defshapes;

import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.VolumeMeasurable;
import main.java.com.hwnumber4.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    private List<Vertex> vertex3D;

    public SpaceShape(List<Vertex> vertex3D) {
        super(vertex3D);
        this.vertex3D = vertex3D;
    }
}
