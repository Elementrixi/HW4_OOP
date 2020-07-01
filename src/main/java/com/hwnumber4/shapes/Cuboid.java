package main.java.com.hwnumber4.shapes;

import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.VolumeMeasurable;
import main.java.com.hwnumber4.shapes.defshapes.SpaceShape;
import main.java.com.hwnumber4.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;

public class Cuboid extends SpaceShape implements VolumeMeasurable, AreaMeasurable{
    private Vertex3D vertex3D;
    private double depth;
    private double width;
    private double height;

    public Cuboid(Vertex3D vertex3D, double length,double width, double height){
        super(new ArrayList<>(Collections.singleton(vertex3D)));
        this.vertex3D = vertex3D;
        this.depth = length;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return 2 * height * (depth + width);
    }

    public double getVolume() {
        return depth * width * height;
    }

    @Override
    public String toString() {
        return "Cuboid : " + "vertex3D = " + vertex3D + ", depth = " + depth + ", width = " + width + ", height = " + height + ", area = " + getArea() + ", volume = " + getVolume();
    }
}

