package main.java.com.hwnumber4.shapes;

import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.VolumeMeasurable;
import main.java.com.hwnumber4.shapes.defshapes.SpaceShape;
import main.java.com.hwnumber4.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;
public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private Vertex3D vertex3D;
    private double radius;

    public Sphere(Vertex3D vertex3D, double radius) {
        super(new ArrayList<>(Collections.singletonList(vertex3D)));
        this.vertex3D = vertex3D;
        this.radius = radius;
    }

    public double getArea() {
        return  4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(radius, 3);    }

    @Override
    public String toString() {
        return "Sphere : " + "vertex = " + vertex3D + ", radius = " + radius + ", area = " + getArea() + ", perimeter = " + getVolume();
    }
}

